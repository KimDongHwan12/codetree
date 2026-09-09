import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();

        int c = a + b + x;

        int d = c / 3;

        System.out.println(c);
        System.out.println(d);
    }
}