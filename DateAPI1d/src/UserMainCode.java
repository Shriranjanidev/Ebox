import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UserMainCode {
	public static void displayDate(String input) throws Exception{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d = sdf.parse(input);
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		String days[] = {"","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		System.out.println(days[cal.get(Calendar.DAY_OF_WEEK)]);

	}
}
