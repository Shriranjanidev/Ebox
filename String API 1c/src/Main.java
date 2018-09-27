import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of players");
		int n = sc.nextInt();
		sc.nextLine();
		String s[] = new String[n];
		for(int i=0;i<n;i++) {
			s[i] = sc.nextLine();
		}
		for(int i=0;i<n;i++) {
			if(s[i].lastIndexOf('a')==s[i].indexOf('a')) {
				System.out.println("Player of the Match:\n"+s[i]);
				break;
			}
		}
	}

}
