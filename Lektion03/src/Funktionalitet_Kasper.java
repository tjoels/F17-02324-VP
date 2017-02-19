/**
 * Wrote by leiszner on 2/6/17.
 */

public class Funktionalitet_Kasper implements IFunktionalitet
{
    private IData data = new Data();

    @Override
    public double getBMI(String cpr) throws DataException {
        double vaegt = data.getVaegt(cpr);
        double hoejde = data.getHoejde(cpr);
        double BMI;

        BMI = vaegt / Math.pow(hoejde, 2);

        return BMI;
    }

    @Override
    public String getTextualBMI(String cpr) throws DataException {
        double BMI = getBMI(cpr);

        if (BMI < 18.5)
            return "Du vejer for lidt";
        else if(18.5 <= BMI && BMI < 25)
            return "Din vægt er passende";
        else if(25 <= BMI && BMI <= 30)
            return "Du er overvægtig";
        else if(30 < BMI)
            return "Du er svært overvægtig";

        return null;
    }

    @Override
    public String getNavn(String cpr) throws DataException {
        return data.getNavn(cpr);
    }
}
