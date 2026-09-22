import java.util.*;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int OFFSET = 100000;
        int curr = 0;

        char[] color = new char[200001];

        for (int i = 0; i < n; i++) {

            int x = sc.nextInt();
            char command = sc.next().charAt(0);

            int dir;
            char paint;

            if (command == 'R') {
                dir = 1;
                paint = 'B';
            } else {
                dir = -1;
                paint = 'W';
            }

            // 현재 위치 포함 x개의 타일 칠하기
            for (int j = 0; j < x; j++) {
                color[curr + dir * j + OFFSET] = paint;
            }

            // 마지막으로 칠한 타일로 이동
            curr += dir * (x - 1);
        }

        int white = 0;
        int black = 0;

        for (int i = 0; i < color.length; i++) {

            if (color[i] == 'W') {
                white++;
            } else if (color[i] == 'B') {
                black++;
            }
        }

        System.out.println(white + " " + black);
    }
}