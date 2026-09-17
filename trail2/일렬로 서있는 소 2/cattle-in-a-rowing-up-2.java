/**구할해야할 것: i<j<k와 범위가 조건에 맞는 것
 * 
 * 입력에서 주어지는 것: 소의 마리수, 소의 키
 * 
 * 내가 선택해야하는 것: 시작소, 다음소, 마지막소
 * 
 * 선택범위 : 시작소 = 전체에서 -2 다음소는 시작소+1 마지막소는 시작소 +2
 * 
 * 문제 조건: 조건이 문제에서 대놓고 주어짐
 */

import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int result = 0;
        
        for(int i = 0; i<n-2; i++) {
            int count = 0;
            for(int j = i+1; j<n-1; j++ ) {
                for(int k = j+1; k<n; k++) {
                    
                    if(arr[i]<= arr[j] && arr[j]<=arr[k]) {
                        count++;
                    }
                }
            }
            result += count;
        }
        System.out.println(result);
    }
}