import java.util.Scanner;

/**
 * Created by tjc on 6/2/17.
 */
public class TUI {
    public static void main(String[] args) {
        IFunktionalitet funk = new Funktionalitet_Kasper();
        Scanner in = new Scanner(System.in);
        System.out.print("Indtast CPR: ");
        String input = in.next();
        System.out.println("Navn: " + funk.getNavn(input) + "\n" + "BMI: " + funk.getBMI(input) + ", " + funk.getTextualBMI(input));
    }
}
