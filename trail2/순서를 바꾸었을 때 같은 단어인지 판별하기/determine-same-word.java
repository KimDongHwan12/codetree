import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();
        
        char[] chr1 = word1.toCharArray();
        char[] chr2 = word2.toCharArray();
        
        Arrays.sort(chr1);
        Arrays.sort(chr2);
        
        boolean same = true;
        
     // 길이가 다르면 무조건 다름
        if (word1.length() != word2.length()) {
            same = false;
        } else {

            // 길이가 같을 때만 하나씩 비교
            for (int i = 0; i < word1.length(); i++) {

                if (chr1[i] != chr2[i]) {
                    same = false;
                    break;
                }
            }
        }

        if (same) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}