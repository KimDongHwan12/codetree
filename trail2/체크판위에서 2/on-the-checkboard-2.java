import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int C = sc.nextInt();

        char[][] grid = new char[R][C];

        // 1. 체스판 입력
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                grid[i][j] = sc.next().charAt(0);
            }
        }

        int answer = 0;

        // 첫 번째 중간 위치
        for (int r1 = 1; r1 < R - 1; r1++) {
            for (int c1 = 1; c1 < C - 1; c1++) {

                // 시작점 -> 첫 번째 중간 위치
                if (grid[0][0] == grid[r1][c1]) {
                    continue;
                }

                // 두 번째 중간 위치
                for (int r2 = r1 + 1; r2 < R - 1; r2++) {
                    for (int c2 = c1 + 1; c2 < C - 1; c2++) {

                        // 첫 번째 중간 위치 -> 두 번째 중간 위치
                        if (grid[r1][c1] == grid[r2][c2]) {
                            continue;
                        }

                        // 두 번째 중간 위치 -> 도착점
                        if (grid[r2][c2] == grid[R - 1][C - 1]) {
                            continue;
                        }

                        answer++;
                    }
                }
            }
        }

        System.out.println(answer);
    }
}