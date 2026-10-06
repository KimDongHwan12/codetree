
import java.util.*;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] start = new int[n];
        int[] end = new int[n];

        for (int i = 0; i < n; i++) {
            start[i] = sc.nextInt();
            end[i] = sc.nextInt();
        }

        int answer = 0;

        // i번 선분 선택
        for (int i = 0; i < n; i++) {

            boolean cross = false;

            // 다른 선분과 비교
            for (int j = 0; j < n; j++) {

                if (i == j) {
                    continue;
                }

                // 아래와 위에서 순서가 뒤집히면 교차
                if ((start[i] < start[j] && end[i] > end[j]) ||
                    (start[i] > start[j] && end[i] < end[j])) {

                    cross = true;
                    break;
                }
            }

            // 아무 선분과도 교차하지 않았다면
            if (!cross) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}