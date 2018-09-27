import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String team = sc.nextLine();
		if(UserMainCode.validateTeam(team))
			System.out.println("Valid");
		else
			System.out.println("Invalid");

	}

}
