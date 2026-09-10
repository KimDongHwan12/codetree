import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;

        for (int i = 1; i < N; i++) {

            if (arr[i] != arr[i - 1]) {
                int diff = arr[i] - arr[i - 1];

                if (diff < min) {
                    min = diff;
                }
            }
        }

        System.out.println(min);
    }
}