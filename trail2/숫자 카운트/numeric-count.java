import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        String[] nums = new String[N];
        int[] count1 = new int[N];
        int[] count2 = new int[N];

        // B가 했던 질문들을 저장
        for (int i = 0; i < N; i++) {
            nums[i] = sc.next();
            count1[i] = sc.nextInt();
            count2[i] = sc.nextInt();
        }

        int answer = 0;

        // A가 생각할 수 있는 모든 숫자 만들기
        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                for (int c = 1; c <= 9; c++) {

                    // 세 숫자는 서로 달라야 함
                    if (a == b || a == c || b == c) {
                        continue;
                    }

                    String candidate = "" + a + b + c;

                    boolean possible = true;

                    // 모든 질문과 비교
                    for (int q = 0; q < N; q++) {

                        int cnt1 = 0;
                        int cnt2 = 0;

                        // 후보와 질문 숫자 비교
                        for (int i = 0; i < 3; i++) {

                            for (int j = 0; j < 3; j++) {

                                if (candidate.charAt(i) == nums[q].charAt(j)) {

                                    // 숫자도 같고 위치도 같음
                                    if (i == j) {
                                        cnt1++;
                                    }

                                    // 숫자는 같지만 위치가 다름
                                    else {
                                        cnt2++;
                                    }
                                }
                            }
                        }

                        // B가 알려준 결과와 다르면
                        // 이 후보는 절대 정답이 될 수 없음
                        if (cnt1 != count1[q] || cnt2 != count2[q]) {
                            possible = false;
                            break;
                        }
                    }

                    // 모든 질문을 통과했다면 가능한 숫자
                    if (possible) {
                        answer++;
                    }
                }
            }
        }

        System.out.println(answer);
    }
}