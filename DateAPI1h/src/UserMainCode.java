import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class UserMainCode {
	public static void displayDay(String date1, String date2) throws Exception{
		DateTimeFormatter sdf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate ld1 = LocalDate.parse(date1, sdf);
		LocalDate ld2 =  LocalDate.parse(date2, sdf);
		Period diff = Period.between(ld1, ld2);
		int years = diff.getYears();
		int months = diff.getMonths();

		System.out.println("Difference between "+date1+" and "+date2+": "+years+ " Years and "+months+" Months");
	}
}
