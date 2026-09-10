
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();
        
        int count = 0;
        int max = 0;
        
        for(int i = 0; i<n ; i++) {
            int x = sc.nextInt();
            if(x>t) {
                count++;
            }else {
                count = 0;
            }
            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}