import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int a = sc.nextInt();
        
        
        int[] arr = new int[a];
        int sum = 0;
        
        
        for(int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
            sum +=arr[i];
        }
        
        System.out.printf("%d %.1f",sum ,(double)sum/a);
    }
}
