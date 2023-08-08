package stringprogram;

import java.util.HashSet;
import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class Count_Characters {

	/**
	 * input: aaabbcdddf
	 * output: a3b2cd3f
	 */
	@Test
	public void count() {
		String s="aaabbcdddf";
		LinkedHashSet<Character> hs= new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			hs.add(s.charAt(i));
		}
		for(Character c:hs) {
			int count=0;
			for (int j = 0; j < s.length(); j++) {
				if (c ==s.charAt(j)) {
					count++;
				}
			}
			if (count>1) {
				System.out.print(c);
				System.out.print(count);
			}else if(count==1) {
				System.out.print(c);
			}
		}
	}
}
