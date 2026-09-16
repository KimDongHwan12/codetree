import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] point = new int[N][2];

        for (int i = 0; i < N; i++) {
            point[i][0] = sc.nextInt();
            point[i][1] = sc.nextInt();
        }

        int total = 0;

        // 원래 전체 이동 거리
        for (int i = 0; i < N - 1; i++) {
            total += distance(point[i], point[i + 1]);
        }

        int maxSave = 0;

        // 1번과 N번은 건너뛸 수 없으므로
        // 배열 기준 1 ~ N-2
        for (int i = 1; i < N - 1; i++) {

            int before =
                    distance(point[i - 1], point[i])
                  + distance(point[i], point[i + 1]);

            int after =
                    distance(point[i - 1], point[i + 1]);

            int save = before - after;

            maxSave = Math.max(maxSave, save);
        }

        System.out.println(total - maxSave);
    }

    static int distance(int[] a, int[] b) {

        return Math.abs(a[0] - b[0])
             + Math.abs(a[1] - b[1]);
    }
}