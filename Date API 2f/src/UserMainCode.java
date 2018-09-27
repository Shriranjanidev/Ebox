import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class UserMainCode {
	public static void displayDate(int year, int days) {
		LocalDate ld = LocalDate.of(year, Month.JANUARY, 1);
		LocalDate ld1 = ld.plusDays(days-1);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		System.out.println(days+"th day of "+year+" : "+ld1.format(formatter));
	}
}
