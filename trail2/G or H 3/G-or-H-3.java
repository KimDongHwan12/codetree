import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        // 위치는 최대 10000
        // start + K까지 접근할 수 있으므로 넉넉하게 생성
        int[] placed = new int[20001];

        for (int i = 0; i < N; i++) {

            int x = sc.nextInt();
            char type = sc.next().charAt(0);

            if (type == 'G') {
                placed[x] = 1;
            } else {
                placed[x] = 2;
            }
        }

        int maxScore = 0;

        // 사진 시작 위치
        for (int start = 1; start <= 10000; start++) {

            int score = 0;

            // [start, start + K]
            for (int pos = start; pos <= start + K; pos++) {
                score += placed[pos];
            }

            maxScore = Math.max(maxScore, score);
        }

        System.out.println(maxScore);
    }
}