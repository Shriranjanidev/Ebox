import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String city = sc.nextLine();
		if(UserMainCode.validateCity(city))
			System.out.println("Valid");
		else
			System.out.println("Invalid");

	}

}
