import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UserMainCode {
	public static void displayDate(String input) throws Exception{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d = sdf.parse(input);
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.YEAR, 1);
		System.out.println(sdf.format(cal.getTime()));
		cal.add(Calendar.YEAR, -2);
		System.out.println(sdf.format(cal.getTime()));
		
	}
}
