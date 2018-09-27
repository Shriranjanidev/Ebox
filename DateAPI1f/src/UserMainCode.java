import java.util.Calendar;

public class UserMainCode {
	public static void displayDay(int year, int month) throws Exception{
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, 1);
		String days[] = {"","SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
		System.out.println(days[cal.get(Calendar.DAY_OF_WEEK)]);
		cal.set(Calendar.DATE, cal.getActualMaximum(Calendar.DATE));
		System.out.println(days[cal.get(Calendar.DAY_OF_WEEK)]);
		
	}
}
