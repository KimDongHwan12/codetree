import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String A = sc.next();

        long open = 0;
        long answer = 0;

        for (int i = 0; i < A.length(); i++) {

            char c = A.charAt(i);

            if (c == '(') {
                open++;
            } else {
                answer += open;
            }
        }

        System.out.println(answer);
    }
}