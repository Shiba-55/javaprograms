package stringprogram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

import org.testng.annotations.Test;

public class Input_count {

	/**
	 * string i/p= "aabbcettrrraaee"  , O/p - a2b2c1e1t2r3a2e2
	 */
	@Test
	public void count() {
		String str= "aabbcettrrraaee";
		LinkedHashSet<Character>lhs=new LinkedHashSet<>();
		for (int i = 0; i < str.length(); i++) {
			lhs.add(str.charAt(i));
		}
		
		for (Character ch : lhs) {
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (ch == str.charAt(i)) {
					count++;
				}else {
					
				}
				
			}
			if(count!=0)
			System.out.println(ch+""+count);
		}
	
		
		        
		

	}
}
