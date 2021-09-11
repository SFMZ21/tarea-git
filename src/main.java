import java.util.Scanner;

public class main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        String nombre = scan.nextLine();

        System.out.println(nombre);
        StringBuilder strb = new StringBuilder(nombre);
        nombre = strb.reverse().toString();
        System.out.println(nombre);


    }

}

