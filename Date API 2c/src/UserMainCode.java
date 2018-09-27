import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UserMainCode {
	public static void displayDay(String date) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate ld1 = LocalDate.parse(date, dtf);
		System.out.println("Day of year : "+ld1.getDayOfYear());
	}
}
