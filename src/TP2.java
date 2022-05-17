import java.util.Scanner;

public class TP2 {
    static String nom;
    static String prenom;
    static Integer age;
    static void presentation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer votre nom ");
        nom = scanner.next();
        System.out.println("Veuillez entrer votre prénom");
        prenom = scanner.next();
        System.out.println("Veuillez entrer votre age ");
        age = scanner.nextInt();

        System.out.println("Vous vous appelez " + prenom + " " + nom + " et vous avez " + age + " ans");
    }
}
