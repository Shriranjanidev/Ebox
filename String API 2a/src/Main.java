import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String date = sc.nextLine();
		if(UserMainCode.validateDate(date))
			System.out.println("Valid");
		else
			System.out.println("Invalid");

	}

}
