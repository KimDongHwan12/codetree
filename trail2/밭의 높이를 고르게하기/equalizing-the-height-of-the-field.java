import java.util.*;
/**
 * 구해야하는 것 n개의 밭에서 t번 연속한 h를 나오게하는 최소비용을 구하는 문제
 * 
 * 입력받을 것 n,n개의 밭, t, h
 * 
 * 높이를 구하는 법
 * 각 배열의 인덱스의 값 - h의 절댓값이 변화하는데 드는 비용
 * 
 * 조건
 * t개의 h가 연속되게 존재해야함
 * 
 * 
 * 
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int h = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        int[] pay = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            pay[i] = Math.abs(arr[i] - h);
        }
        int result = Integer.MAX_VALUE;;
        
        for(int i = 0; i<=n-t ; i++) {
            int sum = 0;
            for(int j = 0 ; j<t ; j++) {
                sum += pay[j+i];
            }
            result = Math.min(result, sum);
        }
        System.out.println(result);
    }
}