import java.util.Scanner;

public class TP1 {
    static int diametre;
    static double surface;
    static float rayon;
    static void surface(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre");
        diametre = scanner.nextInt();
        rayon = diametre / 2;
        surface = Math.PI * rayon * rayon;
        System.out.println("Le résultat de la surface est : " + surface);
    }
}
