package stringprogram;

import org.testng.annotations.Test;

public class ReverseAlternateWords {

	/**
	 * String s="this is Java programming questions"
	 * Reverse the alternative words and count
	 */
	@Test
	public void reverse() {
		String s="this is Java programming questions";
		String[] str = s.split("\\s+");
		String res="";
		for (int i= 0; i < str.length; i++) {
			if (i%2==0) {
			String rev="";
			for (int j =str[i].length()-1; j >=0; j--) {
				rev=rev+str[i].charAt(j);
			}
			res=res+" "+rev;
			}else {
				res=res+" "+str[i];
			}
		}
		System.out.println(res);
	}
	
}
