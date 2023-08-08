package stringprogram;

import org.testng.annotations.Test;

public class Wap_to_reverse_the_string {

	/**
	 * Wap to reverse the string
	 */
	@Test
	public void reverse() {
		String s="Shiba";
		String rev="";
		for (int i =  s.length()-1; i >=0; i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}
}
