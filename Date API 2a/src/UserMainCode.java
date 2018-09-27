import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class UserMainCode {
	public static void displayDate(int year, int month, int date) {
		LocalDate ld = LocalDate.of(year, month, date);
		LocalDate ld1 = ld.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
		System.out.println("Next Friday: "+ld1.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
		LocalDate ld2 = ld.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));
		System.out.println("Previous Friday: "+ld2.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));

	}
}
