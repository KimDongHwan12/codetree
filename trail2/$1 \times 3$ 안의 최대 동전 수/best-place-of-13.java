import java.util.Scanner;
/**
 * 입력
 * n
 * nXn 2차원배열
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[][] arr =  new int[n][n];
        
        for(int i = 0; i<n ; i++) {
            for(int j = 0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            } 
        }
        
        
        int result = 0;
        for(int i = 0; i<n ; i++) {
            int sum = 0;
            for(int j = 0; j<n-2; j++) {
                result = Math.max(result, arr[i][j]+arr[i][j+1]+arr[i][j+2]);
            } 
        }    
        
        System.out.println(result);
    }
}
