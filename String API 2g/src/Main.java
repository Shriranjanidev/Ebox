import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String data = sc.nextLine();
		if(UserMainCode.validatePlayer(data))
			System.out.println("Valid");
		else
			System.out.println("Invalid");

	}

}
