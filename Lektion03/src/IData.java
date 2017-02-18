/**
 * Created by tjc on 6/2/17.
 */
public interface IData {
    // Get name from CPR of person.
    String getNavn(String cpr) throws DataException;
    // Get weight from CPR of person.
    double getVaegt(String cpr) throws DataException;
    // Get height from CPR of person.
    double getHoejde(String cpr)throws DataException;

}
