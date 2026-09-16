import java.util.Scanner;
/**
 * 입력
 * N
 * N마리의 소
 * 
 * 어떤 조건에 따라 정렬하여 조건이 맞는걸 보기
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        for(int i = 0; i<n ; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        
        for(int i = 0; i<n; i++) {
            for(int j = i+1; j<n; j++) {
                for(int k = j+1 ; k<n; k++) {
                    
                    if((arr[i]<=arr[j] && arr[j]<=arr[k]) &&
                            (i<j && j<k)) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
