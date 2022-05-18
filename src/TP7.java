import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;

/*
Ecrire un programme Java qui permet à l’utilisateur de définir une adresse email et un mot de passe.
Ensuite dans un second temps, il sera demandé à l’utilisateur de fournir l’email et le mot de passe:
Si l’email et le mot de passe ne correspondent pas aux valeurs définies, le message “Identifiants incorrect devra s’afficher”, et l’utilisateur devra recommencer la saisie des valeurs.
Sinon, le message “Bienvenu dans votre espace client” devra s’afficher.
Le nombre de fois que l’utilisateur peut saisir des mauvais identifiants est limité à 5, ensuite le programme va s’arrêter avec un message disant : “Vous avez saisi des mauvais identifiants x fois, votre compte est bloqué“.
Il faut dire à au user le nombre de tentatives restants
 */
public class TP7 {
    static String email;
    static String password;
    static String emailCheck;
    static String passwordCheck;
    static int tentative = 5;
    static int compteur ;

    static void userConnexion() {

        Scanner scanner = new Scanner(System.in);
        // Ecrire un programme Java qui permet à l’utilisateur de définir une adresse email et un mot de passe.
        System.out.println("Définissez votre email : ");
        email = scanner.next();
        System.out.println("Définissez votre mot de passe : ");
        password = scanner.next();

        while (compteur < 1 ) {
            System.out.println("Veuillez entrer votre email : ");
            emailCheck = scanner.next();
            System.out.println("Veuillez entrer votre mot de passe : ");
            passwordCheck = scanner.next();

            if (email != emailCheck || password != passwordCheck) {
                System.out.println("Identifiants incorrects");
            } else {
                System.out.println("Bienvenue dans votre espace client");
            }
            System.out.println("recommencez");
            tentative--;
            System.out.println("Nombre de tentatives restantes : " + tentative);
            compteur ++;

            if(tentative == 0){
                System.out.println("degage mon gars t'es bloqué");
            }
        }
   }

}