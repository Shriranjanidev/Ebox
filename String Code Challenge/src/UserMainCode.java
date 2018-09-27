
public class UserMainCode {
	public static boolean validatePlayer(String player) {
		String[] playersArray = player.split(" ");
		if((player.endsWith("-Raider*") || player.endsWith("-Defender#")) && (Character.isUpperCase(playersArray[0].charAt(0)) && Character.isUpperCase(playersArray[1].charAt(0))))
			return true;
		return false;
	}
}
