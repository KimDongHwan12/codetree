import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int c= a+b;
        double d = (double) c / 2;
        
        System.out.printf("%d %.1f", c, d);
    }
}