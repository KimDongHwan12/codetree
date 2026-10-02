

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        int total = 0;

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();

            // 전체 능력치의 합
            total += arr[i];
        }

        int answer = Integer.MAX_VALUE;

        // 1번 팀 : 2명 선택
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {

                // 2번 팀 : 2명 선택
                for (int k = 0; k < 5; k++) {
                    for (int l = k + 1; l < 5; l++) {

                        // 같은 사람이 두 팀에 들어가면 안 됨
                        if (i == k || i == l ||
                            j == k || j == l) {
                            continue;
                        }

                        int team1 = arr[i] + arr[j];
                        int team2 = arr[k] + arr[l];

                        // 남은 1명의 능력
                        int team3 = total - team1 - team2;

                        // 세 팀의 능력은 모두 달라야 함
                        if (team1 == team2 ||
                            team1 == team3 ||
                            team2 == team3) {
                            continue;
                        }

                        int max = Math.max(team1,
                                  Math.max(team2, team3));

                        int min = Math.min(team1,
                                  Math.min(team2, team3));

                        int diff = max - min;

                        answer = Math.min(answer, diff);
                    }
                }
            }
        }

        // 가능한 팀 구성이 하나도 없었다면
        if (answer == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(answer);
        }
    }
}