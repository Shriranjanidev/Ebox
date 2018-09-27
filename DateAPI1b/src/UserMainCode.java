import java.text.SimpleDateFormat;
import java.util.Date;

public class UserMainCode {
	public static void displayDate(String input) throws Exception{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = sdf.parse(input);
		sdf = new SimpleDateFormat("dd/MM/yyyy, H:mm:ss");
		System.out.println(sdf.format(d));
	}
}
