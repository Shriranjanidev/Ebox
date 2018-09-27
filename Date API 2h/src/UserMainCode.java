import java.time.LocalDate;
import java.time.Month;

public class UserMainCode {
	public static void displayDate(int year) {
		LocalDate ld = LocalDate.of(year, Month.FEBRUARY, 1);
		if(ld.isLeapYear())
			System.out.println(year+" is leap year");
		else
			System.out.println(year+" is not leap year");
	}
}
