import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of players");
		int n = sc.nextInt();
		sc.nextLine();
		String s[] = new String[n];
		System.out.println("Enter player names");
		for(int i=0;i<n;i++) {
			s[i] = sc.nextLine();
		}
		for(int i=0;i<n;i++) {
			if(s[i].contains("Sharma"))
				System.out.println(s[i]);
		}
	}

}
