import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UserMainCode {
	public static void displayDate(String date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate ld = LocalDate.parse(date,formatter);
		LocalDate ld1 = ld.plusMonths(20);
		System.out.println("20 months after "+date+" will be "+ld1.format(formatter));
	}
}
