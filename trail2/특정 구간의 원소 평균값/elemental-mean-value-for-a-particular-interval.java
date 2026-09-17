import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = 0;

        // i = 구간의 시작
        for (int i = 0; i < n; i++) {

            // j = 구간의 끝
            for (int j = i; j < n; j++) {

                int sum = 0;

                // i ~ j까지 합
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }

                // 구간 길이
                int length = j - i + 1;

                // 평균이 정수가 아니면
                // 정수 원소와 같을 수 없음
                if (sum % length != 0) {
                    continue;
                }

                int avg = sum / length;

                // 평균과 같은 원소가 구간 안에 있는지 확인
                for (int k = i; k <= j; k++) {

                    if (arr[k] == avg) {
                        result++;
                        break;
                    }
                }
            }
        }

        System.out.println(result);
    }
}