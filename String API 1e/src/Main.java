import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Player name");
		String s = sc.nextLine();
		System.out.println("Enter starting index");
		int start = sc.nextInt();
		System.out.println("Short name of "+s+": "+s.substring(start));
	}

}
