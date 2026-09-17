import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int result = 0;

        // "(("의 시작 위치 i
        for (int i = 0; i < str.length() - 1; i++) {

            // i, i+1이 "(("인지 확인
            if (str.charAt(i) == '('
                    && str.charAt(i + 1) == '(') {

                // "))"는 "((" 뒤에서 시작해야 함
                for (int j = i + 2; j < str.length() - 1; j++) {

                    // j, j+1이 "))"인지 확인
                    if (str.charAt(j) == ')'
                            && str.charAt(j + 1) == ')') {

                        result++;
                    }
                }
            }
        }

        System.out.println(result);
    }
}