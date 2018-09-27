import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class UserMainCode {
	public static boolean validateDate(String date) {
		try {
            DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            df.setLenient(false);
            df.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
	}
}
