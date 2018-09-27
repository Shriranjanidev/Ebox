import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UserMainCode {
	public static void displayDate(String input) throws Exception{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d = sdf.parse(input);
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		System.out.println("Day of year : "+cal.get(Calendar.DAY_OF_YEAR));
		
	}
}
