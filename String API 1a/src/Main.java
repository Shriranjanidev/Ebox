import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter team1");
		String s1 = sc.nextLine();
		System.out.println("Enter team2");
		String s2 = sc.nextLine();
		System.out.println("Enter third character");
		char c = sc.next().charAt(0);
		if(s1.charAt(2)==c)
			System.out.println("Winner Team : "+s1);
		else
			System.out.println("Winner Team : "+s2);
				
	}

}
