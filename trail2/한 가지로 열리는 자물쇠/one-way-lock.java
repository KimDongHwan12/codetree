import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //입력가능 번호 범위
        int n = sc.nextInt();
        
        //기준 자물쇠 번호
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int answer = 0;
        
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=n ; j++) {
                for(int k=1; k<=n ; k++) {
                    int one = Math.abs(i-a);
                    int two = Math.abs(j-b);
                    int three = Math.abs(k-c);
                    
                    if(one<=2 || two<=2 || three <=2) {
                        answer++;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}