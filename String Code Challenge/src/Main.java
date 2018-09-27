import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		String name = sc.nextLine();
		if(UserMainCode.validatePlayer(name))
			System.out.println("Valid");
		else
			System.out.println("Invalid");

	}

}
