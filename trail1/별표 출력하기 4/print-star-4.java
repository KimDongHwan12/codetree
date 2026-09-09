import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        // 위쪽 : a개부터 1개까지
        for(int i = 0; i < a; i++) {

            for(int j = a; j > i; j--) {

                System.out.print("*" + " ");
            }

            System.out.println();
        }

        // 아래쪽 : 2개부터 a개까지
        for(int i = 2; i <= a; i++) {

            for(int j = 0; j < i; j++) {

                System.out.print("*" + " ");
            }

            System.out.println();
        }
    }
}