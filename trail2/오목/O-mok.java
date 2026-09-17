import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] board = new int[19][19];

        // 입력
        for (int r = 0; r < 19; r++) {
            for (int c = 0; c < 19; c++) {
                board[r][c] = sc.nextInt();
            }
        }

        // 오른쪽, 아래, 오른쪽 아래, 왼쪽 아래
        int[] dr = {0, 1, 1, 1};
        int[] dc = {1, 0, 1, -1};

        // 모든 칸을 시작점으로 확인
        for (int r = 0; r < 19; r++) {

            for (int c = 0; c < 19; c++) {

                // 빈칸이면 검사할 필요 없음
                if (board[r][c] == 0) {
                    continue;
                }

                // 현재 돌의 색
                int color = board[r][c];

                // 4가지 방향 확인
                for (int d = 0; d < 4; d++) {

                    boolean win = true;

                    // 현재 위치부터 5칸 확인
                    for (int k = 0; k < 5; k++) {

                        int nr = r + dr[d] * k;
                        int nc = c + dc[d] * k;

                        // 범위를 벗어나면 실패
                        if (nr < 0 || nr >= 19 ||
                            nc < 0 || nc >= 19) {

                            win = false;
                            break;
                        }

                        // 다른 색의 돌이면 실패
                        if (board[nr][nc] != color) {

                            win = false;
                            break;
                        }
                    }

                    // 5개가 모두 같은 색이라면 승리
                    if (win) {

                        // 5개 중 가운데는 시작점에서 2칸 이동
                        int middleR = r + dr[d] * 2;
                        int middleC = c + dc[d] * 2;

                        System.out.println(color);

                        // 배열은 0부터지만 문제 좌표는 1부터
                        System.out.println(
                            (middleR + 1) + " " + (middleC + 1)
                        );

                        return;
                    }
                }
            }
        }

        // 승자가 없는 경우
        System.out.println(0);
    }
}