import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int a = sc.nextInt();
        int num =1;
        while(num<=a) {
            System.out.println("*");
            num++;
        }
    }
}