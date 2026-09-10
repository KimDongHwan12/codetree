import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] count = new int[1001];

        for (int i = 0; i < n; i++) {

            int num = sc.nextInt();

            count[num]++;
        }

        for (int i = 1000; i >= 1; i--) {

            if (count[i] == 1) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(-1);
    }
}