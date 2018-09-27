import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class UserMainCode {
	public static void displayAge(String d1, String d2) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate ld1 = LocalDate.parse(d1, dtf);
		LocalDate ld2 = LocalDate.parse(d2, dtf);
		Period age = Period.between(ld1, ld2);
		int years = age.getYears();
		int months = age.getMonths();
		int days = age.getDays();
		System.out.println("I am  "+years+" years, "+months+" months and "+days+" days old.");

	}
}
