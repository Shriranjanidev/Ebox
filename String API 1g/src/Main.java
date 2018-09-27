import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter player names");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		String[] ss = s1.split(" ");
		int len = ss[0].length();
		if(s1.regionMatches(0,s2,0,len))
			System.out.println("Both the players names starts with "+ss[0]);
		else
			System.out.println("Both the players names does not starts with "+ss[0]);
	}

}
