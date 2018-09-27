import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class UserMainCode {
	public static void displayDay(String date) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate ld1 = LocalDate.parse(date, dtf);
		LocalDate fwd = ld1.plusDays(10);
		LocalDate bwd = ld1.minusDays(10);
		System.out.println(bwd.format(dtf));
		System.out.println(bwd.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault()));
		System.out.println(fwd.format(dtf));
		System.out.println(fwd.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault()));
	}
}
