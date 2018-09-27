import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter venue1");
		String s1 = sc.nextLine();
		System.out.println("Enter venue2");
		String s2 = sc.nextLine();
		if(s1.equalsIgnoreCase(s2))
			System.out.println("Both the venues are same.");
		else
			System.out.println("Both the venues are different.");
				
	}

}
