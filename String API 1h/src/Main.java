import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter team details");
		String s1 = sc.nextLine();
		s1 = s1.replaceAll("Captain", "Skipper");
		System.out.println("After replacement\n"+s1);
	}

}
