/**
 * Created by tjc on 30/1/17.
 */
public class StakTest {
    public static void main(String[] args) {
        Stak stak1 = new ArrayStak(5);
        stak1.push("Dette");
        stak1.push("er");
        stak1.push("en");
        stak1.push("mærkelig");
        stak1.push("sætning");
        stak1.show();

        System.out.println(stak1.pop());
        System.out.println(stak1.pop());

        stak1.show();

        stak1.push("mærkelig");
        stak1.push("sætning");

        stak1.show();
        System.out.println("Full: " + stak1.full());
        System.out.println("Empty: " + stak1.empty());
    }
}
