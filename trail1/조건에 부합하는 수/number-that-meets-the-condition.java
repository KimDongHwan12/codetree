import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        for (int i = 1; i <= A; i++) {

            // 조건 1
            if (i % 2 == 0 && i % 4 != 0) {
                continue;
            }

            // 조건 2
            if ((i / 8) % 2 == 0) {
                continue;
            }

            // 조건 3
            if (i % 7 < 4) {
                continue;
            }

            System.out.print(i + " ");
        }
    }
}