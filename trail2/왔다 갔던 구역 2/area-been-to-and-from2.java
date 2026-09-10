import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[2001];

        int pos = 0;

        for (int i = 0; i < N; i++) {

            int x = sc.nextInt();
            String dir = sc.next();

            int next;

            if (dir.equals("R")) {
                next = pos + x;
            } else {
                next = pos - x;
            }

            int left = Math.min(pos, next);
            int right = Math.max(pos, next);

            for (int j = left; j < right; j++) {
                arr[j + 1000]++;
            }

            pos = next;
        }

        int count = 0;

        for (int i = 0; i < 2001; i++) {
            if (arr[i] >= 2) {
                count++;
            }
        }

        System.out.println(count);
    }
}