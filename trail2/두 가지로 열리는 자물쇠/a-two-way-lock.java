import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 첫 번째 조합
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 두 번째 조합
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int c2 = sc.nextInt();

        int answer = 0;

        // 가능한 모든 3자리 조합
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                for(int k = 1; k <= n; k++) {

                    // =========================
                    // 첫 번째 조합과의 거리
                    // =========================

                    int one = Math.abs(i - a);
                    one = Math.min(one, n - one);

                    int two = Math.abs(j - b);
                    two = Math.min(two, n - two);

                    int three = Math.abs(k - c);
                    three = Math.min(three, n - three);


                    // =========================
                    // 두 번째 조합과의 거리
                    // =========================

                    int one2 = Math.abs(i - a2);
                    one2 = Math.min(one2, n - one2);

                    int two2 = Math.abs(j - b2);
                    two2 = Math.min(two2, n - two2);

                    int three2 = Math.abs(k - c2);
                    three2 = Math.min(three2, n - three2);


                    // 첫 번째 조합과 모든 자리 거리가 2 이하
                    boolean first =
                            one <= 2 &&
                            two <= 2 &&
                            three <= 2;

                    // 두 번째 조합과 모든 자리 거리가 2 이하
                    boolean second =
                            one2 <= 2 &&
                            two2 <= 2 &&
                            three2 <= 2;


                    // 둘 중 하나라도 만족하면
                    // 현재 (i, j, k)는 자물쇠를 열 수 있음
                    if(first || second) {
                        answer++;
                    }
                }
            }
        }

        System.out.println(answer);
    }
}