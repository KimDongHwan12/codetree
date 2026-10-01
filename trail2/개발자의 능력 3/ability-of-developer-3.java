import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[6];
        
        int total = 0;
        
        for(int i = 0; i<6 ; i++) {
            arr[i] = sc.nextInt();
            total+=arr[i];
        }
        
        int answer = Integer.MAX_VALUE;
        
        //1팀 3명 뽑기
        for(int i = 0; i<6 ; i++) {
            for(int j = i+1; j<6 ; j++) {
                for(int k = j+1; k<6 ; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    int sum2 = total-sum;
                    
                    answer = Math.min(answer, Math.abs(sum-sum2));
                }    
            }
        }
        System.out.println(answer);
    }
}