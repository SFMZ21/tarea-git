import java.util.Scanner;

public class main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int edad;

        edad = scan.nextInt();

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }


    }

}

