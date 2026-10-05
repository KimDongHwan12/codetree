import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[] x = new int[n];
        int[] y = new int[n];
        
        for(int i = 0; i<n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        
        int answer = Integer.MAX_VALUE;
        
        //제외할 지점
        for(int i = 0; i<n; i++) {
            //제외하고 선택한 지점
            int minx = Integer.MAX_VALUE;
            int maxx = 1;
            int miny = Integer.MAX_VALUE;
            int maxy = 1;
            for(int j = 0; j<n; j++) {
                if(i == j) {
                    continue;
                }
                minx = Math.min(minx, x[j]);
                maxx = Math.max(maxx, x[j]);
                miny = Math.min(miny, y[j]);
                maxy = Math.max(maxy, y[j]);
            }
            int area = (maxx - minx) * (maxy - miny);
            answer = Math.min(area, answer);
        }
        System.out.println(answer);
    }
}