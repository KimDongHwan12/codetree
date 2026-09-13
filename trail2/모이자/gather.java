import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        long[] A = new long[N + 1];
        long total = 0;

        for (int i = 1; i <= N; i++) {
            A[i] = Long.parseLong(st.nextToken());
            total += A[i];
        }

        // 가중 중앙값 위치 찾기
        long prefix = 0;
        int meeting = 1;

        for (int i = 1; i <= N; i++) {
            prefix += A[i];

            if (prefix * 2 >= total) {
                meeting = i;
                break;
            }
        }

        // 최소 이동 거리 계산
        long answer = 0;

        for (int i = 1; i <= N; i++) {
            answer += A[i] * Math.abs((long) i - meeting);
        }

        System.out.println(answer);
    }
}