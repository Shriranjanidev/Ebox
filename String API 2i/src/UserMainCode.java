
public class UserMainCode {
	public static int getCount(String data) {
		int count = 0;

		for(int i=0;i<data.length()-2;i++) {
			String s = data.substring(i, i+3);
			if(Integer.parseInt(s)%4==0)
				count++;
		}
		return count;
	}
}
