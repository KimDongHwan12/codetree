import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        
        //줄 갯수
        for(int i  = 0; i<a ; i++) {
            //공백 갯수
            for(int j = a-1; j>i ; j--) {
                System.out.print("  ");
            }
            for(int z =0; z< 2*i+1 ; z++ ) {
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
        
    }
}