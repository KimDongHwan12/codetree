import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int num = sc.nextInt();
        
        int a= 3;
        
        while(a<=num) {
            System.out.print(a+" ");
            a+=3;
        }
    }
}