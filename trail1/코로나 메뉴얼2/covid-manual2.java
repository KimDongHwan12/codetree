import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;

        for (int i = 0; i < 3; i++) {

            char symptom = sc.next().charAt(0);
            int temp = sc.nextInt();

            if (symptom == 'Y' && temp >= 37) {
                A++;
            }
            else if (symptom == 'N' && temp >= 37) {
                B++;
            }
            else if (symptom == 'Y' && temp < 37) {
                C++;
            }
            else {
                D++;
            }
        }

        System.out.print(A + " " + B + " " + C + " " + D);

        if (A >= 2) {
            System.out.print(" E");
        }
    }
}