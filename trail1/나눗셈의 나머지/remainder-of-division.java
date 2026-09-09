import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int[] count = new int[10];

        while (A > 1) {

            int remainder = A % B;

            count[remainder]++;

            A = A / B;
        }

        int answer = 0;

        for (int i = 0; i < B; i++) {
            answer += count[i] * count[i];
        }

        System.out.println(answer);
    }
}