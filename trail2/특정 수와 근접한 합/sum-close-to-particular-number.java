/**
 * 구해야하는 것
 * 두개를 제거하여 s와 가장 같아지는 합을 구하기
 * 
 * 입력
 * s와 n, n개의 수
 * 
 * 
 * 조건
 * 반복문 2개
 * 범위는 i~n-1, j(i+1부터 시작)~n
 * 
 * 그것을 제외한 합을 찾고
 * s랑 뺀것 중에 최솟값을 찾기
 */

import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
        int result =  Integer.MAX_VALUE;
        
        for (int i = 0; i < n - 1; i++) {

            for (int j = i + 1; j < n; j++) {

                int remain = sum - arr[i] - arr[j];

                int diff = Math.abs(s - remain);

                result = Math.min(result, diff);
            }
        }

        System.out.println(result);
    }
}