package stringprogram;

import org.testng.annotations.Test;

public class Input_ProductOfNumbers {

	/**
	 * STRING S= I a1m goi123ng to fi3215nd pro234duct for the num1212bers ins1212ide th1212is st3245ring
	 * Output -1*123*3215*234*1212*1212*1212*3254
	 * Output should be product of these
	 */
	@Test
	public void input() {
		long prod=1;
		int	num=0;
		String res="";
		String s= "I a1m goi123ng to fi3215nd pro234duct for the num1212bers ins1212ide th1212is st3245ring";
		for (int i = 0; i < s.length(); i++) {
	
			if (s.charAt(i)>='1' && s.charAt(i)<='9') {
				num=num*10+Character.getNumericValue(s.charAt(i));
				//System.out.print(s.charAt(i)+" ");
			}
			else {
				
				if(num>0) {
					System.out.println(num);
					prod=prod*num;
				res=res+num+"*";}
				num=0;
			}
			
		}
		System.out.println(res);
		System.out.println(prod);
	}
}
