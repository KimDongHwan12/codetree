import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
           int high = sc.nextInt();
           arr[i] = Math.abs(high - h);
        }
        
        int answer = Integer.MAX_VALUE;

        //시작위치 선정
        for (int i = 0; i <= n-t; i++) {
            int sum = 0;
            //t번 나오게 하는 합
            for(int j = 0; j<t; j++){
                sum+=arr[i+j];
            }
            answer = Math.min(answer, sum);
        }
        System.out.print(answer);
    }
}