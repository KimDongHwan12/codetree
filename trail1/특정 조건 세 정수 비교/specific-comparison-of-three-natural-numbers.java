import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // a가 최솟값인지
        if (a <= b && a <= c) {
            System.out.print(1 + " ");
        } else {
            System.out.print(0 + " ");
        }

        // 세 수가 모두 같은지
        if (a == b && b == c) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}