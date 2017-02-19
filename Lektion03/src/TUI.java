import java.util.Scanner;

/**
 * Created by tjc on 6/2/17.
 */
public class TUI {
    public static void main(String[] args) throws DataException {
        IFunktionalitet funk = new Funktionalitet();
        Scanner in = new Scanner(System.in);
        System.out.println("Indtast CPR: ");
        System.out.println("f.eks. ");
        System.out.println("234567-8901");
        System.out.println("456789-0123");
        System.out.println("123456-7890");
        String input = in.next();
        System.out.println("Navn: " + funk.getNavn(input) + "\n" + "BMI: " + funk.getBMI(input) + ", " + funk.getTextualBMI(input));
    }
}
