import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of players");
		int n = sc.nextInt();
		sc.nextLine();
		String s[] = new String[n];
		System.out.println("Enter the player name");
		for(int i=0;i<n;i++) {
			s[i] = sc.nextLine();
		}
		System.out.println("Player name starting with \'M\' or Ending with \'a\'");
		for(int i=0;i<n;i++) {
			if(s[i].startsWith("M") || s[i].endsWith("a"))
				System.out.println(s[i]);
		}
	}

}
