import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        
        for(int i = 0; i<n ; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        
        int answer = Integer.MAX_VALUE;
        
        //계산할 위치를 지정
        for(int i = 0; i<n ;i++) {
            //지정한 위치와 모든 점을 계산
            for(int j =0; j<n ; j++) {
                if(i==j) {
                    continue;
                }
                int distance = (int) (Math.pow(x[i] - x[j], 2) + Math.pow(y[i]-y[j], 2));
                
                answer = Math.min(answer, distance);
            }
        }
        System.out.println(answer);
    }
}
