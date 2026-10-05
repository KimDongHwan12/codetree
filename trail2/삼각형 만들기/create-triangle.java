import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int answer = 0;

        // i = 직각이 되는 꼭짓점
        for (int i = 0; i < n; i++) {

            // j = i와 가로로 연결할 점
            for (int j = 0; j < n; j++) {

                if (i == j) {
                    continue;
                }

                // k = i와 세로로 연결할 점
                for (int k = 0; k < n; k++) {

                    if (i == k || j == k) {
                        continue;
                    }

                    // i-j가 x축에 평행하려면 y가 같아야 함
                    // i-k가 y축에 평행하려면 x가 같아야 함
                    if (y[i] == y[j] && x[i] == x[k]) {

                        int width = Math.abs(x[i] - x[j]);
                        int height = Math.abs(y[i] - y[k]);

                        // 실제 넓이 = width * height / 2
                        // 문제는 넓이의 2배를 요구하므로
                        // width * height만 계산
                        int area2 = width * height;

                        answer = Math.max(answer, area2);
                    }
                }
            }
        }

        System.out.println(answer);
    }
}