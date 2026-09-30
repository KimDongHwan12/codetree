import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String str= sc.next();
        char[] chr = new char[str.length()];
        int count = 0;

        for(int i = 0; i<str.length(); i++){
            chr[i] = str.charAt(i);
        }

        for(int i = 0; i<chr.length-1; i++){
            for(int j = i+1; j<chr.length ; j++){
                if(chr[i] == '(' && chr[j] == ')'){
                    count++;
                }
            }
        }

        System.out.print(count);
    }
}