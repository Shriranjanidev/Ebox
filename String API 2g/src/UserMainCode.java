
public class UserMainCode {
	public static boolean validatePlayer(String data) {
		for(int i=0;i<data.length();i++) {
			if(data.charAt(i)=='a' && (i+1)%2==0)
				return false;
		}
		return true;
	}
}
