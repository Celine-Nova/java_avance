import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main (String[] args) {
    int count = 0;
    int tries;
    Scanner scanner = new Scanner(System.in);
    ArrayList<User> users =new ArrayList<>();
    users.add(new User("Céline","Dada","c.dada@gmail.com", "cd8caracteres"));
    users.add(new User("Eric","Darmusie","e.dada@gmail.com", "ed8caracteres"));
    users.add(new User("Matteo","Michelon","mm@gmail.com", "mm3"));
    users.add(new User("Sue","Serveto","gmail.com", "abcd"));



    System.out.println("Définissez votre email : ");
    String email = scanner.next();
    System.out.println("Définissez votre mot de passe : ");
    String password = scanner.next();
    System.out.println("Définissez votre prénom : ");
    String firstName= scanner.next();
    System.out.println("Définissez votre nom : ");
    String lastName = scanner.next();

        users.add(new User(email, firstName, lastName, password));
        for(int j=0;j< users.size();j++){
            System.out.println("User : " + users.get(j));
        }
        while (count < 5 ) {
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
            tries--;
            System.out.println("Nombre de tentatives restantes : " + tries);
            count ++;

            if(tries == 0){
                System.out.println("degage mon gars t'es bloqué");
            }
        }
//        System.out.println("Veuillez entrer votre email : ");
//        email = scanner.nextLine();
//        System.out.println("Entrez votre mot de passe : ");
//        password = scanner.nextLine();
    }
}