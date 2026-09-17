import java.util.*;

public class Main {

    static int N;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        // 첫 번째 조합
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int c1 = sc.nextInt();

        // 두 번째 조합
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int c2 = sc.nextInt();

        int answer = 0;

        // 가능한 모든 자물쇠 조합 확인
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                for (int k = 1; k <= N; k++) {

                    // 첫 번째 조합과 가까운가?
                    boolean first =
                            isClose(i, a1) &&
                            isClose(j, b1) &&
                            isClose(k, c1);

                    // 두 번째 조합과 가까운가?
                    boolean second =
                            isClose(i, a2) &&
                            isClose(j, b2) &&
                            isClose(k, c2);

                    // 둘 중 하나라도 만족하면 열림
                    if (first || second) {
                        answer++;
                    }
                }
            }
        }

        System.out.println(answer);
    }

    static boolean isClose(int x, int target) {

        int diff = Math.abs(x - target);

        int distance = Math.min(diff, N - diff);

        return distance <= 2;
    }
}