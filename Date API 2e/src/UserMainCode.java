import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class UserMainCode {
	public static void displayTime(String time) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalTime lt = LocalTime.parse(time, dtf);
		System.out.println(lt.plusHours(2).format(dtf));
	}
}
