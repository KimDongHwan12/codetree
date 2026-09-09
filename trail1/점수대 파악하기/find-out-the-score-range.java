import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] count = new int[11];

        while (true) {

            int score = sc.nextInt();

            // 0이 나오면 입력 종료
            if (score == 0) {
                break;
            }

            // 10점 미만은 세지 않음
            if (score < 10) {
                continue;
            }

            // 해당 점수대의 학생 수 증가
            count[score / 10]++;
        }

        // 100점부터 10점대까지 출력
        for (int i = 10; i >= 1; i--) {
            System.out.println(i * 10 + " - " + count[i]);
        }
    }
}