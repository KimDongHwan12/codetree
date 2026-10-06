

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int b = sc.nextInt();

        int[] p = new int[n];

        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }

        int answer = 0;

        // i = 할인 받을 학생
        for (int i = 0; i < n; i++) {

            // 원본 가격 복사
            int[] temp = p.clone();

            // i번 학생의 선물만 반값
            temp[i] = temp[i] / 2;

            // 싼 선물부터 사기 위해 정렬
            Arrays.sort(temp);

            int total = b;
            int count = 0;

            // j = 실제로 구매할 선물
            for (int j = 0; j < n; j++) {

                if (total - temp[j] >= 0) {

                    total = total - temp[j];
                    count++;

                } else {
                    break;
                }
            }

            answer = Math.max(count, answer);
        }

        System.out.println(answer);
    }
}