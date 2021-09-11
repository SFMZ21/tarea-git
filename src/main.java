import java.util.Scanner;

public class main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int edad = scan.nextInt();

        for (int i = 0; i <= edad; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }

}

