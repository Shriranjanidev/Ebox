
public class UserMainCode {
	public static boolean validateCity(String city) {
		for(int i=2;i<city.length()-2;i++) {
			if(city.charAt(i)!='*')
				return false;
		}
		int ind = city.length()-1;
		if(!Character.isAlphabetic(city.charAt(0)) ||  !Character.isAlphabetic(city.charAt(1)) || !Character.isAlphabetic(city.charAt(ind)) || !Character.isAlphabetic(city.charAt(ind-1)))
			return false;
		return true;
	}
}
