package stringprogram;

import org.testng.annotations.Test;

public class Reverse_String {

	/**
	 * 
	 * input: i am selenium
	 * output: m ui nelesmai
	 * 
	 */

	@Test
	public void reverse() {
		String s="i am selenium";
		StringBuilder sb= new StringBuilder(s.replaceAll(" ", "")).reverse();
		String res="";
		int j=0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)==' ') {
				res=res+s.charAt(i);
			}else {
				res=res+sb.charAt(j);
				j++;
			}
		}
		System.out.println(res);
	}
}
