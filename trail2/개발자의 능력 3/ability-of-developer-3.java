import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[6];

        int total = 0;

        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        int result = Integer.MAX_VALUE;

        // 6명 중 3명 선택
        for (int i = 0; i < 4; i++) {

            for (int j = i + 1; j < 5; j++) {

                for (int k = j + 1; k < 6; k++) {

                    int teamA = arr[i] + arr[j] + arr[k];

                    int teamB = total - teamA;

                    int diff = Math.abs(teamA - teamB);

                    result = Math.min(result, diff);
                }
            }
        }

        System.out.println(result);
    }
}