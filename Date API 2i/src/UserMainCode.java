import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalUnit;

public class UserMainCode {
	public static void displayDay(String d1, String d2) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-d");
		LocalDate ld1 = LocalDate.parse(d1,dtf);
		LocalDate ld2 = LocalDate.parse(d2,dtf);
		int count = 0;
		while(ld1.isBefore(ld2)) {
			ld1 = ld1.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
			if(ld1.isBefore(ld2)) count++;
		}
		System.out.println(count);
	}
}