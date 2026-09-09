import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        
       char chr = sc.next().charAt(0);
       
       if(chr =='S') {
           System.out.println("Superior");
       }
       else if(chr =='A') {
           System.out.println("Excellent");
       }
       else if(chr =='B') {
           System.out.println("Good");
       }
       else if(chr =='C') {
           System.out.println("Usually");
       }
       else if(chr =='D') {
           System.out.println("Effort");
       }else {
           System.out.println("Failure ");
       }
    }
}