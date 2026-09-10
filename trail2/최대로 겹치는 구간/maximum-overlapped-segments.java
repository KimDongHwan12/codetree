import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[201];

        for (int i = 0; i < N; i++) {

            int x1 = sc.nextInt();
            int x2 = sc.nextInt();

            for (int j = x1; j < x2; j++) {
                arr[j + 100]++;
            }
        }

        int max = 0;

        for (int i = 0; i < 201; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}