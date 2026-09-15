import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int[] days = {
                0,
                31, 28, 31, 30,
                31, 30, 31, 31,
                30, 31, 30, 31
        };

        int start = 0;
        int end = 0;

        // 시작 날짜가 1월 1일부터 몇 번째 날인지 계산
        for (int i = 1; i < m1; i++) {
            start += days[i];
        }
        start += d1;

        // 끝 날짜가 1월 1일부터 몇 번째 날인지 계산
        for (int i = 1; i < m2; i++) {
            end += days[i];
        }
        end += d2;

        System.out.println(end - start + 1);
    }
}