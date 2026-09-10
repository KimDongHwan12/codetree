import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        
       Arrays.sort(words); 
       int count = 0; 
       for (int i = 0; i < n; i++) {
           if(words[i].startsWith(t)) {
               count++;
               if(count ==k) {
                   System.out.println(words[i]);
               }
           }
           
       }
       
    }
}