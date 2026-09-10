import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int current = 0;

        int OFFSET = 100000;

        int[] white = new int[200001];
        int[] black = new int[200001];
        int[] color = new int[200001];

        for (int i = 0; i < n; i++) {

            int x = sc.nextInt();
            String str = sc.next();

            if (str.equals("R")) {

                for (int j = 0; j < x; j++) {

                    int now = current + j;
                    int idx = now + OFFSET;

                    black[idx]++;

                    if (color[idx] != 3) {

                        if (white[idx] >= 2 && black[idx] >= 2) {
                            color[idx] = 3;
                        } else {
                            color[idx] = 2;
                        }
                    }
                }

                current += x - 1;

            } else {

                for (int j = 0; j < x; j++) {

                    int now = current - j;
                    int idx = now + OFFSET;

                    white[idx]++;

                    if (color[idx] != 3) {

                        if (white[idx] >= 2 && black[idx] >= 2) {
                            color[idx] = 3;
                        } else {
                            color[idx] = 1;
                        }
                    }
                }

                current -= x - 1;
            }
        }

        int whiteCnt = 0;
        int blackCnt = 0;
        int grayCnt = 0;

        for (int i = 0; i < 200001; i++) {

            if (color[i] == 1) {
                whiteCnt++;
            } else if (color[i] == 2) {
                blackCnt++;
            } else if (color[i] == 3) {
                grayCnt++;
            }
        }

        System.out.println(whiteCnt + " " + blackCnt + " " + grayCnt);
    }
}