import java.util.Scanner;

public class Correction {

    static void IsPair() {
        Scanner clavier = new Scanner(System.in);
        byte nombre = clavier.nextByte();
        boolean estPair = nombre % 2 == 0;//true

//        String resultat="";
//        if(estPair){
//            resultat="pair";
//        }else{
//            resultat="impair";
//        }
//
//        String resultat2=estPair?"pair":"impair";

        if(nombre>0)

        {
            System.out.printf("%d est positif et %s", nombre, (estPair ? "pair" : "impair"));
//            System.out.printf("%d est positif et %s",resultat);
//            System.out.printf("%d est positif et %s",resultat2);
        }else if(nombre<0)

        {
            System.out.printf("%d est négatif et %s", nombre, (estPair ? "pair" : "impair"));
        }else

        {
            System.out.println("0 et pair");
        }
    }

}
