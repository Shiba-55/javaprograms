package stringprogram;

import org.testng.annotations.Test;

public class Reverse_Words_In_A_String {

	/**
	 * input: wlecome to expleo
	 * output: expleo to welcome
	 */
	@Test
	public void reverse(){
	
		String str="wlecome to expleo";
		String s[]=str.split("\\s+");
		for (int i = s.length-1; i >=0 ; i--) {
			System.out.print(s[i]+" ");
		}
	}
	
}
