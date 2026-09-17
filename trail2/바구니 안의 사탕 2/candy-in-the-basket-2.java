import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] candy = new int[N];
        int[] x = new int[N];

        for (int i = 0; i < N; i++) {
            candy[i] = sc.nextInt();
            x[i] = sc.nextInt();
        }

        int result = 0;

        // 중심 위치 c를 하나씩 선택
        for (int c = 0; c <= 100; c++) {

            int sum = 0;

            // 모든 바구니 확인
            for (int i = 0; i < N; i++) {

                // 바구니가 [c-K, c+K] 안에 있는가?
                if (c - K <= x[i] && x[i] <= c + K) {
                    sum += candy[i];
                }
            }

            result = Math.max(result, sum);
        }

        System.out.println(result);
    }
}