
public class UserMainCode {
	public static void orangeCapDetails(String data) {
		String team = "";
		String name = "";
		String runs = "";
		if(data.charAt(2)==' ') 
			team = data.charAt(0)+""+data.charAt(1)+" ";		
		else
			team = data.charAt(0)+""+data.charAt(1)+""+data.charAt(2);
		for(int i=3;i<data.length();i++) {
			if(Character.isAlphabetic(data.charAt(i)) || data.charAt(i)==' ')
				name += data.charAt(i);
			else {
				runs += data.substring(i);
				break;
			}
		}
		System.out.println(team+"\n"+name+"\n"+runs);

	}
}
