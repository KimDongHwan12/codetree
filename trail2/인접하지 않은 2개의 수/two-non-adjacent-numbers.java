/*
 * 구해야하는것
 * 인접하지 않는 2개의 수 중 합이 최대가 되는 것을 출력(최대합)
 * 
 * 입력 받는것
 * n과 n개의 정수
 * 
 * 선택할 것
 * i의 범위
 * j의 범위
 */

import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        //i의 위치
        int result = 0;
        for(int i = 0; i<n-2; i++) {
            int sum = 0;
            //j위치
            for(int j = i+2; j<n; j++) {
                
                sum=arr[i]+arr[j];
                result = Math.max(sum, result);
            }
        }
        System.out.println(result);
    }
}