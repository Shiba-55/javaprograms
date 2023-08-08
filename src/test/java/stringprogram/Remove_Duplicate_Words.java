package stringprogram;

import java.util.HashSet;
import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class Remove_Duplicate_Words {

	@Test
	public void remove_duplicate() {
		String str="Keep it simple and focus"
				+ " on a single portion of a character's life. "
				+ "Make sure the reader has a clear picture of your "
				+ "main character right away. Focus on the theme and "
				+ "message you're trying to get across. Let the short "
				+ "story idea create a life of its own";
		String s[]=str.toLowerCase().split("\\s+");
		LinkedHashSet<String> hs=  new LinkedHashSet<String>();
		for (int i = 0; i < s.length; i++) {
			if (!(hs.contains(s[i]))) {
				hs.add(s[i]);
			}
		}
		for (String s1: hs) {
			System.out.print(s1+" ");
		}
		System.out.println();
	}
}
