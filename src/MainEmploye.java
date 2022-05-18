import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainEmploye {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("Combien d'employés souhaitez-vous enregistrer?");
        var nombreEmployes = input.nextInt();

        ArrayList<Employe> employes = new ArrayList<>();
        int i;
        for (i = 0; i < nombreEmployes; i++) {
            System.out.println("Taille du tableau : " + employes.size());
            System.out.print("Id : ");
            int id = input.nextInt();
            input.nextLine();

            System.out.print("Votre nom : ");
            String nom = input.nextLine();


            System.out.print("Votre prenom : ");
            String prenom = input.nextLine();


            employes.add(new Employe(id, prenom, nom));
        }

        System.out.println(employes);


        for (int j = 0; j < employes.size(); j++) {
            System.out.println("Employé[" + j + "] : " + employes.get(j));
        }

        System.out.println("Souhaitez-vous ajouter un autre employé?");
        String response = input.nextLine();

        if (response.equals("oui")) {
            employes.add(new Employe(5, "Zozor", "Zazar"));
        } else {
            System.out.println("Bye bye");
        }
        System.out.println("Taille du tableau à la fin : " + employes.size());
       // employes.get(3); <= erreur il y 3 élements mais il n'y a que 2 index (o,1,2)
    }
}
/*String[] fruits=new String[3];
fruits[0]="pommes";
fruits[1]="bananes";
fruits[2]="oranges";

toString : formatage de l'affichage pas obligatoire de le mettre si la methode  existe dans la classe println() le gère
System.out.println(Arrays.toString(fruits));

 */