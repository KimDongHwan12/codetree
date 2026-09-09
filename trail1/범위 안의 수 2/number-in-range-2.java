
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int[] arr = new int[10];
        
        int sum = 0;
        int count = 0;
        
        for(int i = 0; i<10; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]>=0 && arr[i]<=200) {
                count++;
                sum+=arr[i];
            }
        }
        System.out.printf("%d %.1f", sum, (double)sum/count);
    }
}
