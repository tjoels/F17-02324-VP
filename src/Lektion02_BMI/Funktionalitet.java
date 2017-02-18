package Lektion02_BMI;

/**
 * Created by tjc on 6/2/17.
 */
public class Funktionalitet implements IFunktionalitet {
    private IData data = new Data();

    @Override
    public double getBMI(String cpr) {
        return data.getVaegt(cpr) / Math.pow(data.getHoejde(cpr), 2);
    }

    @Override
    public String getTextualBMI(String cpr) {
        double bmi = getBMI(cpr);
        if (getBMI(cpr) < 18.5) {
            return "Du vejer for lidt";
        } else if (18.5 <= bmi && bmi < 25) {
            return "Din vægt er passende";
        } else if (25 <= bmi && bmi <= 30) {
            return "Du er overvægtig";
        } else if (bmi > 30) {
            return "Du er svært overvægtig";
        }
        return null;
    }

    @Override
    public String getNavn(String cpr) {
        return data.getNavn(cpr);
    }
}
