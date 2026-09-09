import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 0;

        for (int i = 0; i < 3; i++) {

            char symptom = sc.next().charAt(0);
            int temp = sc.nextInt();

            if (symptom == 'Y' && temp >= 37) {
                count++;
            }
        }

        if (count >= 2) {
            System.out.println("E");
        } else {
            System.out.println("N");
        }
    }
}