package Lektion03;

/**
 * Created by tjc on 6/2/17.
 */
public interface IFunktionalitet {
    // beregn BMI udfra personens CPR-nr
    double getBMI(String cpr) throws DataException;
    // returnér en tekst der beskriver BMI intervallet
    String getTextualBMI(String cpr) throws DataException;
    // returnér perosn navn udfra CPR-nr
    String getNavn(String cpr) throws DataException; // returnér perosn navn udfra CPR-nr
}
