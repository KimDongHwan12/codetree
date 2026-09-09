import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int a = sc.nextInt();
        
        int[] arr = new int[a];
        
        int c = 0;
        
        for(int i = 0; i<a ; i++) {
            arr[i]=sc.nextInt();
            
            if(arr[i] % 2 != 0 && arr[i] % 3 ==0) {
                c+=arr[i];
            }
        }
        
        System.out.println(c);
        
    }
}
