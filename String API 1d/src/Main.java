import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter team name");
		String s = sc.nextLine();
		System.out.println("Enter starting index of the sequence");
		int start = sc.nextInt();
		System.out.println("Enter ending index of the sequence");
		int end = sc.nextInt();
		System.out.println(s.subSequence(start, end));
	}

}
