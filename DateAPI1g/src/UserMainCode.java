import java.util.Calendar;

public class UserMainCode {
	public static void displayDay(int year) throws Exception{
		Calendar cal = Calendar.getInstance();
		cal.set(year, 0, 1);
		String days[] = {"","Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
		System.out.println("Start Day of the given year is "+days[cal.get(Calendar.DAY_OF_WEEK)]);
		cal.set(year, 11, 31);
		System.out.println("End Day of the given year is "+days[cal.get(Calendar.DAY_OF_WEEK)]);

	}
}
