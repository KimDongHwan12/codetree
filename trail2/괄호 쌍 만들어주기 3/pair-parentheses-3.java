import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
       
       
       String str = sc.next();
       int result = 0;
       
       for(int i = 0; i<str.length()-1; i++) {
           char chr = str.charAt(i);
           boolean open = false;
           int count = 0;
           if(chr == ')') {
               continue;
           }else {
               open = true;
           }
           for(int j = i+1; j<str.length(); j++) {
               char chr2 = str.charAt(j);
               if(open && chr2 == ')') {
                   count++;
               }
           }
           result += count;
       }
       System.out.println(result);
    }
}