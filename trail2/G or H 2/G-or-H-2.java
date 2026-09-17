
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 0 = 사람 없음
        // 1 = G
        // 2 = H
        int[] arr = new int[101];

        for (int i = 0; i < n; i++) {

            int position = sc.nextInt();
            char ch = sc.next().charAt(0);

            if (ch == 'G') {
                arr[position] = 1;
            } else {
                arr[position] = 2;
            }
        }

        int result = 0;

        // i = 사진에서 가장 왼쪽에 있는 사람의 위치
        for (int i = 0; i <= 100; i++) {

            // i 위치에 사람이 없으면 시작할 필요 없음
            if (arr[i] == 0) {
                continue;
            }

            int gCount = 0;
            int hCount = 0;

            // j = 사진에서 가장 오른쪽에 있는 사람의 위치
            for (int j = i; j <= 100; j++) {

                // j 위치에 사람이 있다면 카운트
                if (arr[j] == 1) {
                    gCount++;
                } else if (arr[j] == 2) {
                    hCount++;
                }

                // j에 사람이 없으면
                // 사진의 오른쪽 끝 사람이 될 수 없음
                if (arr[j] == 0) {
                    continue;
                }

                // 전부 G
                // 또는 전부 H
                // 또는 G와 H 개수가 같음
                if (hCount == 0 ||
                    gCount == 0 ||
                    gCount == hCount) {

                    int size = j - i;

                    result = Math.max(result, size);
                }
            }
        }

        System.out.println(result);
    }
}