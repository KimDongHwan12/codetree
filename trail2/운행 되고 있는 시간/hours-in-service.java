

import java.util.*;

public class Main {

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

        // i번 사람을 해고해본다.
        for (int i = 0; i < n; i++) {

            boolean[] work = new boolean[1001];

            // 나머지 사람들의 근무시간 표시
            for (int j = 0; j < n; j++) {

                if (i == j) {
                    continue;
                }

                for (int t = start[j]; t < end[j]; t++) {
                    work[t] = true;
                }
            }

            // 회사가 운행된 시간 계산
            int sum = 0;

            for (int t = 0; t <= 1000; t++) {
                if (work[t]) {
                    sum++;
                }
            }

            answer = Math.max(answer, sum);
        }

        System.out.println(answer);
    }
}