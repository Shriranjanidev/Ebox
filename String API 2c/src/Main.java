import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String player = sc.nextLine();
		String team = sc.nextLine();
		String out = sc.nextLine();
		if(UserMainCode.validatePlayer(player, team,out))
			System.out.println("Valid");
		else
			System.out.println("Invalid");

	}

}
