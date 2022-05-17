import java.util.Scanner;

public class TP4 {
    static int number;
   // static  int reste = number % 2;

    static void Modulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre");
        number = scanner.nextInt();
//
        if (number == 0) {
            System.out.println("Le nombre est zéro il est donc pair");
        } else if (number % 2 == 0 && number > 0 ) {
            System.out.println("Le nombre est pair est positif .");
        } else if (number % 2 != 0 && number > 0 ) {
            System.out.println("Le nombre est impair est positif .");
        } else if ( number % 2 == 0 &&number < 0) {
            System.out.println("Le nombre est pair est négatif");
        } else if ( number % 2 != 0 && number < 0) {
            System.out.println("Le nombre est impair est négatif ");
        }
    }
}
