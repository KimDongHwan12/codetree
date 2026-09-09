import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        // 별 1개 -> N개
        for (int i = 1; i <= N; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
            System.out.println();
        }

        // 별 N-1개 -> 1개
        for (int i = N - 1; i >= 1; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();

            // 마지막 별 1개 뒤에는 빈 줄을 만들지 않음
            if (i != 1) {
                System.out.println();
            }
        }
    }
}