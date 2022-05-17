import java.util.Scanner;

public class TP5 {
    static double a;
    static double b;
    static double c;

    static double x;
    static void equation(){

        Scanner scanner = new Scanner(System.in);
        //Demander 3 nombres
        System.out.println("Veuillez entre le 1er nombre :");
        a = scanner.nextDouble();
        System.out.println("Veuillez entre le 2eme nombre : ");
        b = scanner.nextDouble();
        System.out.println("Veuillez entre le 3eme nombre : ");
        c = scanner.nextDouble();

        // Equation du 2nd degré:
        //ax 2+ bx + c = 0 === b² − 4 a c
        String equation = "(ax 2+ bx + c = 0)";
        //La méthode Math.pow() renvoie un nombre à une certaine puissance, c'est-à-dire base^exposant
        double discriminant =  Math.pow(b,2 - 4 * a * c);
      //  double delta= racineCarre - 4 * a * c ;
        System.out.println("Le resultat de l'équation : " +  equation + " est : " + discriminant);
        if(discriminant < 0 ){
            System.out.println("L'équation n'a pas de solution réelle");
        } else if (discriminant == 0) {
            System.out.println("L'équation a une solution unique");
            x = b/2 * a;
            System.out.println("x = b / 2 * a" + x);
        }else {
            System.out.println("L'équation a deux solutions distinctes");
            // La méthode Math.sqrt() permet de calculer la racine carré d'une valeur passée en paramètre
            double x1 = -b - Math.sqrt(discriminant) / 2 * a;
            System.out.println("Solution 1 : (x1=-b-(b²−4ac)/2*a) : " + x1);
            double x2 = -b + Math.sqrt(discriminant) / 2 * a;
            System.out.println("Solution 2 : (x2=-b+(b²−4ac)/2*a) : " + x2);
        }

    }
}