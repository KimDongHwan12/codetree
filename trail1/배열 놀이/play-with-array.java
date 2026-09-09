import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();

        int[] arr = new int[N];

        // 배열 입력
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Q개의 질문 처리
        for (int q = 0; q < Q; q++) {

            int type = sc.nextInt();

            // 1 a
            if (type == 1) {

                int a = sc.nextInt();

                System.out.println(arr[a - 1]);
            }

            // 2 b
            else if (type == 2) {

                int b = sc.nextInt();

                int index = 0;

                for (int i = 0; i < N; i++) {

                    if (arr[i] == b) {
                        index = i + 1;
                        break;
                    }
                }

                System.out.println(index);
            }

            // 3 s e
            else if (type == 3) {

                int s = sc.nextInt();
                int e = sc.nextInt();

                for (int i = s - 1; i <= e - 1; i++) {
                    System.out.print(arr[i] + " ");
                }

                System.out.println();
            }
        }
    }
}