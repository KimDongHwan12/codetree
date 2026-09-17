import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = -1;

        // 서로 다른 3개의 수 선택
        for (int i = 0; i < n - 2; i++) {

            for (int j = i + 1; j < n - 1; j++) {

                for (int k = j + 1; k < n; k++) {

                    // carry가 발생하지 않는다면
                    if (checkCarry(arr[i], arr[j], arr[k])) {

                        int sum = arr[i] + arr[j] + arr[k];

                        result = Math.max(result, sum);
                    }
                }
            }
        }

        System.out.println(result);
    }

    // 세 숫자를 더했을 때 carry가 발생하지 않는지 확인
    static boolean checkCarry(int a, int b, int c) {

        while (a > 0 || b > 0 || c > 0) {

            // 현재 자리 숫자
            int digitA = a % 10;
            int digitB = b % 10;
            int digitC = c % 10;

            // 현재 자리의 합이 10 이상이면 carry 발생
            if (digitA + digitB + digitC >= 10) {
                return false;
            }

            // 다음 자리로 이동
            a /= 10;
            b /= 10;
            c /= 10;
        }

        return true;
    }
}