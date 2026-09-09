import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        
        for(int i = 0; i<a ;i++) {
            for(int j = 0; j<=i ; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        
        for(int x = 0 ; x<a-1 ; x++) {
            for(int y = a-1; y>x ; y--) {
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
        
        
        
        
    }
}