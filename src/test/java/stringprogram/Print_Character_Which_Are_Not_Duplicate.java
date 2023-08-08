package stringprogram;

import java.util.HashSet;

import org.testng.annotations.Test;

public class Print_Character_Which_Are_Not_Duplicate {

	@Test
	public void character() {
		String s="aabbccdaabbcceaabbccf";
		HashSet<Character> hs= new HashSet();
		for (int i = 0; i < s.length(); i++) {
			hs.add(s.charAt(i));
		}
		for (Character ch : hs) {
			int count=0;
			for (int i = 0; i < s.length(); i++) {
				if (ch==s.charAt(i)) {
					count++;
				}
			}
			if (count ==1) {
				System.out.println(ch);
			}
		}
	}
}
