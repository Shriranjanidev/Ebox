
public class UserMainCode {
	public static boolean validateTeam(String team) {
		String name = "";
		if(!team.contains("-"))
			return false;
		String input[] = team.split("\\s|-"); 
		for(int i=0;i<input.length-1;i++) {
			name+=input[i].charAt(0);
		}
		if(team.endsWith("-"+name))
			return true;
		return false;
	}
}
