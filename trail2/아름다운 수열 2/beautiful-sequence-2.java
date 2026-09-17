import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int[] B = new int[M];

        // B의 각 숫자가 몇 개 있는지 저장
        int[] countB = new int[101];

        for (int i = 0; i < M; i++) {
            B[i] = sc.nextInt();
            countB[B[i]]++;
        }

        int result = 0;

        // 길이 M짜리 연속 부분수열의 시작 위치
        for (int i = 0; i <= N - M; i++) {

            int[] countA = new int[101];

            // A[i]부터 M개 숫자의 개수를 센다.
            for (int j = 0; j < M; j++) {

                countA[A[i + j]]++;
            }

            boolean same = true;

            // 각 숫자의 개수가 B와 같은지 확인
            for (int num = 1; num <= 100; num++) {

                if (countA[num] != countB[num]) {
                    same = false;
                    break;
                }
            }

            if (same) {
                result++;
            }
        }

        System.out.println(result);
    }
}