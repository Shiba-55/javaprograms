package stringprogram;

import org.testng.annotations.Test;

public class Word_With_Character_Reverse {

	/**
	 * I/p= my name is ok
	 * O/p=ko si eman ym
	 */
	@Test
	public void reverse() {
		String s= "my name is ok";
		String str[]=s.split(" ");
		String res="";
		for (int i = str.length-1; i >=0 ; i--) {
			String rev="";
			for (int j = str[i].length()-1; j >=0 ; j--) {
				rev=rev+str[i].charAt(j);
				
			}
			
			res=res+rev+" ";
		}
		System.out.println(res);
	}
}
