import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] arr = new int [a];
        
        for(int i = 0; i<a ; i++) {
            arr[i] = sc.nextInt();
        }
        
        int max = 0;
        
        for(int i = 0; i<a-1 ; i++) {
            for(int j = i+1 ; j<a ; j++) {
                if((arr[i] < arr[j]) && (arr[j] - arr[i] > max)) {
                    max = arr[j] - arr[i];
                }
            }
        }
        System.out.println(max);
        
    }
}