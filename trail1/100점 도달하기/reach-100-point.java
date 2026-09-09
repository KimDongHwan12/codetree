
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        
        int a = sc.nextInt();
        
        
        for(int i = a ;  i<=100; i++) {
            
            if(i>=90) {
                System.out.print('A'+" ");
            }
            if(i<90&&i>=80) {
                System.out.print('B'+" ");
            }
            if(i<80&&i>=70) {
                System.out.print('C'+" ");
            }
            if(i<70&&i>=60) {
                System.out.print('D'+" ");
            }
            if(i<60) {
                System.out.print('F'+" ");
            }
        }
        
    }
}