/*
 * 구해야하는것
 * c,o,w가 순서대로 나오는 경우의 수
 * 
 * 입력받을 것
 * n과 n길이의 문자열
 * 
 * 선택할것
 * c를 찾을 범위
 * o를 찾을 범위
 * w를 찾을 범위
 */

import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String str = sc.next();
        char[] arr = new char[n];
        
        for(int i = 0; i<n  ;i++) {
            arr[i] = str.charAt(i);
        }
        int result = 0;
        //c찾기
        for(int i = 0; i<n-2; i++ ) {
            //o찾기
            for(int j = i+1; j<n-1; j++) {
                //w찾기
                for(int k = j+1; k<n; k++) {
                    
                    if(arr[i] == 'C' &&arr[j]=='O' && arr[k]=='W') {
                        result++;
                    }
                }
            }
        }
        System.out.println(result);
    }
}