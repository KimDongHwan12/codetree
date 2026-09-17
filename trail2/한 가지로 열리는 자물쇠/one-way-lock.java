import java.util.*;
/**
 * 문제 요약
 * 세자리의 자물쇠가 있다 1~n까지의 정수를 비밀번호를 입력가능. 중복가능
 * 기준번호와 입력한 번호가 한 자리라도 절대값빼기 값이 2이하면 자물쇠가 열림
 * 자물쇠를 열수 있는 서로 다른 번호의 개수를 구하라
 * 
 * 입력받을 것
 * n, a,b,c,
 * 
 * 생각할 것
 * xyz의 범위도 1~n까지다
 * 
 * 
 * 
 * 
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int total = n*n*n;
        int count = 0;
        
        for(int i = 1; i<=n ; i++) {
            for(int j =1; j<=n ; j++) {
                for(int k = 1; k<=n ; k++) {
                    if(Math.abs(a-i)>2 && Math.abs(b-j)>2 &&Math.abs(c-k)>2) {
                        count++;
                    }
                }
            }
        }
        System.out.println(total-count);
    }
}