import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        
        int max = 1;
        int min = 1000;
        
        for(int i = 0; i<10 ; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]>max && arr[i]<500) {
                max = arr[i];
            }
            if(arr[i]<min && arr[i] > 500) {
                min = arr[i];
            }
        }
        System.out.printf("%d %d", max, min);
        
    }
}