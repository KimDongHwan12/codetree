import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String a= sc.next();
        String b= sc.next();
        
        String temp = a;
        
        a=b;
        b=temp;
        
        System.out.println(a);
        System.out.println(b);
    }
}