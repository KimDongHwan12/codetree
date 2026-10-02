import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[6];
        
        int total = 0;
        
        for(int i = 0; i<6; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        
        int answer = Integer.MAX_VALUE;
        
        //1번조
        for(int i = 0; i<6; i++) {
            for(int j = i+1; j<6 ; j++) {
                
                //2번조
                for(int k = 0; k<6 ; k++) {
                    for(int l = k+1; l<6; l++ ) {
                        
                        //각 조의 개발자가 하나라도 같은면 안됨
                        if(i==k || j==l || j==k|| i==l) {
                            continue;
                        }
                        
                        int team1 = arr[i] + arr[j];
                        int team2 = arr[k] + arr[l];
                        int team3 = total - (team2+ team1);
                        
                        int max = Math.max(team3, Math.max(team2, team1));
                        int min = Math.min(team3, Math.min(team1, team2));
                        
                        int diff = max - min;
                        
                        answer  = Math.min(diff, answer);
                        
                    }
                }
            }
        }
        System.out.println(answer);
    }
}