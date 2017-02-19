import java.security.SecureRandom;

/**
 * Created by tjc on 6/2/17.
 */
public interface IData {
    // Get name from CPR of person.
    String getNavn(String cpr);
    // Get weight from CPR of person.
    double getVaegt(String cpr);
    // Get height from CPR of person.
    double getHoejde(String cpr);

}
