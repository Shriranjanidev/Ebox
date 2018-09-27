import java.util.HashSet;
import java.util.Set;

public class UserMainCode {
	public static int vowelCount(String data) {
		int count = 0;
		Set<Character> s = new HashSet<>();
		s.add('A');s.add('a');
		s.add('E');s.add('e');
		s.add('I');s.add('i');
		s.add('O');s.add('o');
		s.add('U');s.add('u');
		
		
		for(int i=0;i<data.length();i++) {
			if(s.contains(data.charAt(i)))
				count++;
		}
		return count;
	}
}
