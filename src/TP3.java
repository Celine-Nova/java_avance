import java.util.Scanner;

public class TP3 {
    static int a;
    static int b;
    static int c;
    static int permutation;
    static void permutation(){

        Scanner scanner = new Scanner(System.in);
        //Demander 3 nombres
        System.out.println("Veuillez entre le 1er nombre :");
        a = scanner.nextInt();
        System.out.println("Veuillez entre le 2eme nombre : ");
        b = scanner.nextInt();
        System.out.println("Veuillez entre le 3eme nombre : ");
        c = scanner.nextInt();

        // permutation
        // je stocke la valeur de a dans une autre variable
        permutation = a;
        a = c;
        c = b;
        b = permutation;

        System.out.println("Resultat de la permutation : a = " + a + " b = " + b + " c = " + c);
    }
}
