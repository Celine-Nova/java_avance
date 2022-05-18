import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main (String[] args) {
    int count = 0;
    int tries = 3;
    String email ;
    String password ;
    boolean isPresent = false;
    Scanner scanner = new Scanner(System.in);
    ArrayList<User> users =new ArrayList<>();
    users.add(new User("Céline","Dada","c.dada@gmail.com", "cd8caracteres"));
    users.add(new User("Eric","Darmusie","e.dada@gmail.com", "ed8caracteres"));
    users.add(new User("Matteo","Michelon","mm@gmail.com", "mm3"));
    users.add(new User("Sue","Serveto","gmail.com", "abcd"));

    System.out.println("Définissez votre email : ");
    email = scanner.next();
    System.out.println("Définissez votre mot de passe : ");
    password = scanner.next();
    System.out.println("Définissez votre prénom : ");
    String firstName = scanner.next();
    System.out.println("Définissez votre nom : ");
    String lastName = scanner.next();
    if (Validate.isEmail(email) || Validate.isLength(password, 8, 20)) {
        users.add(new User(email, firstName, lastName, password));
        System.out.println(" compte enregistré");
    } else {
        System.out.println("Saisie incorrect verifiez : @  et Votre mot de passe doit contenir de 8 à 20 caractères");
    }

    while (count < 3 ) {
    System.out.println("Veuillez entrer votre email : ");
    String emailCheck = scanner.next();
    System.out.println("Veuillez entrer votre mot de passe : ");
    String passwordCheck = scanner.next();


    for (User user: users) {
        email = user.getEmail();
        password = user.getPassword();
        // il réitère chaque element de du tableau donc passe toujours dans le else
        // Gràce à Mattéo qui a trouver une solution avec un boolean pour remplacer le else
        if (email.equals(user.getEmail()) && password.equals(user.getPassword())) {
            System.out.println("Bienvenue dans votre espace client : " + user.getFirstName() + user.getLastName());
            isPresent = true;
            break;
        }
    }
        if (isPresent == false) {
            System.out.println("Identifiants incorrects");
            System.out.println("RECOOMENCEZ");
            tries--;
            System.out.println("Nombre de tentatives restantes : " + tries);
            count++;
        }
        if(tries == 0){
            System.out.println("degage mon gars t'es bloqué");
        }
    }

    }
}