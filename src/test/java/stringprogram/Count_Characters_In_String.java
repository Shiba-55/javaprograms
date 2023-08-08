package stringprogram;

import java.util.HashSet;

import org.testng.annotations.Test;

public class Count_Characters_In_String {

	@Test
	public void count() {
		String s="aweexxxyyyyyy";
		HashSet<Character> hs= new HashSet();
		for (int i = 0; i < s.length(); i++) {
			hs.add(s.charAt(i));
		}
		for (char ch : hs) {
			int count=0;
			for (int i = 0; i < s.length(); i++) {
				if (ch == s.charAt(i)) {
					count++;
				}
			}
			System.out.println(ch+"-->>"+count);
		}
	}
}
