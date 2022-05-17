import java.util.Scanner;

public class TP6 {
    static byte number;
    static void calendrier(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez un nombre entre 1 et 12");
        number = scanner.nextByte();
        while(number < 1 || number > 12){
            System.out.println("J'ai dit entre 1 et 12  Recommencez");
            number = scanner.nextByte();
        }
    }
}