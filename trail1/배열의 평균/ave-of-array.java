import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2][4];

        // 입력
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // 1. 가로 평균
        for (int i = 0; i < 2; i++) {

            int sum = 0;

            for (int j = 0; j < 4; j++) {
                sum += arr[i][j];
            }

            System.out.printf("%.1f ", sum / 4.0);
        }

        System.out.println();

        // 2. 세로 평균
        for (int j = 0; j < 4; j++) {

            int sum = 0;

            for (int i = 0; i < 2; i++) {
                sum += arr[i][j];
            }

            System.out.printf("%.1f ", sum / 2.0);
        }

        System.out.println();

        // 3. 전체 평균
        int total = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                total += arr[i][j];
            }
        }

        System.out.printf("%.1f", total / 8.0);
    }
}