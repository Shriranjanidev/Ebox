
public class UserMainCode {
	public static boolean validatePlayer(String data1 , String data2, String data3) {
		String name = "";
		String split[] = data2.split(" ");
		if(split.length==1) {
			name+=(split[0].charAt(0)+""+split[0].charAt(1)+""+split[0].charAt(2)).toUpperCase();
		}
		else {
			for(int i=0;i<split.length;i++) {
				name += (split[i].charAt(0)+"").toUpperCase();
			}
		}
		if(data3.equals(data1+"#"+name))
			return true;
		return false;
	}
}
