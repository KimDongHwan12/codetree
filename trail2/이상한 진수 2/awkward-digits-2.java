import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.next();

        int max = -1;

        for (int i = 0; i < a.length(); i++) {

            char[] arr = a.toCharArray();

            // i번째 숫자 뒤집기
            if (arr[i] == '0') {
                arr[i] = '1';
            } else {
                arr[i] = '0';
            }

            // 맨 앞이 0이면 일반적인 이진수 표현으로 사용할 수 없음
            // 단 "0" 하나만 있는 경우는 N = 0이므로 가능
            if (arr.length > 1 && arr[0] == '0') {
                continue;
            }

            String changed = new String(arr);

            // 2진수 문자열 → 10진수
            int num = Integer.parseInt(changed, 2);

            max = Math.max(max, num);
        }

        System.out.println(max);
    }
}