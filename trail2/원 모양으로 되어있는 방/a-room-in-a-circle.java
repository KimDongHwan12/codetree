/*
 * 구해야 하는 것
 * ->시계방향으로 움직이며 각방에 정해진 인원이 다 들어가는 최소거리
 * 
 * 입력 받을 것
 * ->방의 갯수 , 각방에 정해진 인원
 * 
 * 선택해야할 것
 * 시작할 방의 위치
 * 반시계 방향으로 도는법(이게 문제)
 * 
 * 계산할 것
 * 각방의 인원 x 이동거리(시작인덱스 - 도착인덱스 절댓값)
 */

import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i<n ; i++) {
            arr[i] = sc.nextInt();
        }
        
        int result = Integer.MAX_VALUE;
        
        //시작할 방
        for (int start = 0; start < n; start++) {

            int total = 0;
            int cur = start;

            for (int dist = 0; dist < n; dist++) {

                total += arr[cur] * dist;

                cur++;

                if (cur == n) {
                    cur = 0;
                }
            }

            result = Math.min(result, total);
        }
        System.out.println(result);
    }
}