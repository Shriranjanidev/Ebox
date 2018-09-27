import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String in this format(YYYY-MM-DD HH:mm:ss)");
		String input = sc.nextLine();
		UserMainCode.displayDate(input);
	}

}
