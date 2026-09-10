import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        
        char[] chr = new char[str.length()];
        
        for(int i = 0; i<chr.length ; i++) {
            chr[i] = str.charAt(i);
        }
        
        Arrays.sort(chr);
        for(int i = 0; i<chr.length ; i++) {
            System.out.print(chr[i]);
        }
        
        
    }
}