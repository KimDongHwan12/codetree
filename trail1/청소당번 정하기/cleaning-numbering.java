import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int room = 0;
        int hall = 0;
        int toilet = 0;

        for (int i = 1; i <= n; i++) {

            if (i % 12 == 0) {
                toilet++;

            } else if (i % 3 == 0) {
                hall++;

            } else if (i % 2 == 0) {
                room++;
            }
        }

        System.out.println(room + " " + hall + " " + toilet);
    }
}