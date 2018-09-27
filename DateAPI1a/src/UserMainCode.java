import java.text.SimpleDateFormat;
import java.util.Date;

public class UserMainCode {
	public static void displayDate(String input) throws Exception{
		SimpleDateFormat sdf = new SimpleDateFormat("MMM d,yyyy");
		Date d = sdf.parse(input);
		sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(d));
	}
}
