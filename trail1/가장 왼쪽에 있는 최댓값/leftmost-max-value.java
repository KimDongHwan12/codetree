import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int end = n;

        while (true) {

            int max = arr[0];
            int position = 0;

            for (int i = 1; i < end; i++) {

                if (max < arr[i]) {
                    max = arr[i];
                    position = i;
                }
            }

            System.out.print((position + 1) + " ");

            if (position == 0) {
                break;
            }

            end = position;
        }
    }
}