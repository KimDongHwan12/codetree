import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        // 정수 부분 출력
        System.out.print(A / B + ".");

        // 나머지
        int remain = A % B;

        int count = 0;

        while (count < 20) {

            remain = remain * 10;

            System.out.print(remain / B);

            remain = remain % B;

            count++;
        }
    }
}