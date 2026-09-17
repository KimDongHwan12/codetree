import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] board = new int[N][N];

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                board[r][c] = sc.nextInt();
            }
        }

        int result = 0;

        // 첫 번째 직사각형
        for (int r1 = 0; r1 < N; r1++) {
            for (int c1 = 0; c1 < N - 2; c1++) {

                int sum1 =
                        board[r1][c1]
                      + board[r1][c1 + 1]
                      + board[r1][c1 + 2];

                // 두 번째 직사각형
                for (int r2 = 0; r2 < N; r2++) {
                    for (int c2 = 0; c2 < N - 2; c2++) {

                        // 같은 행에서 겹치는 경우
                        if (r1 == r2) {

                            // 두 구간이 겹치면 넘어감
                            if (!(c1 + 2 < c2 || c2 + 2 < c1)) {
                                continue;
                            }
                        }

                        int sum2 =
                                board[r2][c2]
                              + board[r2][c2 + 1]
                              + board[r2][c2 + 2];

                        result = Math.max(result, sum1 + sum2);
                    }
                }
            }
        }

        System.out.println(result);
    }
}