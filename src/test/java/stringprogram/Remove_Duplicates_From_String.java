package stringprogram;

import java.util.HashSet;

import org.testng.annotations.Test;

public class Remove_Duplicates_From_String {

	@Test
	public void duplicate() {
		String s="aaaabbbbccccddddeeeefff";
		HashSet<Character> hs= new HashSet();
		for (int i = 0; i < s.length(); i++) {
			
			if (!(hs.contains(s.charAt(i)))) {
				
				hs.add(s.charAt(i));
			}
		}
		for (Character ch : hs) {
			System.out.print(ch);	
		}
	}
}
