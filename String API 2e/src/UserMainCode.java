
public class UserMainCode {
	public static boolean validateOver(String over) {
		if(over.length()!=6)	
			return false;
		if(over.contains("N"))
			return false;
		int ind = over.indexOf('W');
		if(ind<0)
			return false;
		return true;
	}
}
