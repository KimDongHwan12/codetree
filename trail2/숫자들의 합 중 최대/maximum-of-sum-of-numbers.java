import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        int result = 0;
        
        for (int i = x; i <= y; i++) {

            int num = i;
            int sum = 0;

            // i의 각 자리 숫자의 합
            while (num > 0) {

                sum += num % 10;

                num /= 10;
            }

            // 가장 큰 자리수 합 저장
            result = Math.max(result, sum);
        }

        System.out.println(result);
        
    }
}