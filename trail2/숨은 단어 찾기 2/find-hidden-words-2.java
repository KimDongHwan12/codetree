import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        char[][] board = new char[N][M];

        // 입력
        for (int r = 0; r < N; r++) {

            String str = sc.next();

            for (int c = 0; c < M; c++) {
                board[r][c] = str.charAt(c);
            }
        }

        // 8방향
        // 위, 아래, 왼쪽, 오른쪽,
        // 왼쪽 위, 오른쪽 위, 왼쪽 아래, 오른쪽 아래
        int[] dr = {-1, 1, 0, 0, -1, -1, 1, 1};
        int[] dc = {0, 0, -1, 1, -1, 1, -1, 1};

        int result = 0;

        // 모든 칸을 시작점으로 확인
        for (int r = 0; r < N; r++) {

            for (int c = 0; c < M; c++) {

                // 시작 문자가 L이 아니면 볼 필요 없음
                if (board[r][c] != 'L') {
                    continue;
                }

                // L이라면 8방향 확인
                for (int d = 0; d < 8; d++) {

                    // L에서 1칸 이동
                    int nr1 = r + dr[d];
                    int nc1 = c + dc[d];

                    // L에서 2칸 이동
                    int nr2 = r + dr[d] * 2;
                    int nc2 = c + dc[d] * 2;

                    // 두 번째 E 위치가 배열 밖이면 검사 불가능
                    if (nr2 < 0 || nr2 >= N ||
                        nc2 < 0 || nc2 >= M) {
                        continue;
                    }

                    // L → E → E 인지 확인
                    if (board[nr1][nc1] == 'E'
                            && board[nr2][nc2] == 'E') {

                        result++;
                    }
                }
            }
        }

        System.out.println(result);
    }
}