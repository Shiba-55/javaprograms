package stringprogram;

import org.testng.annotations.Test;

public class Sum_Is_11 {

	/**
	 * I/P : {1,3,5,2,8,9,10} print combination of numbers, sum of numbers should be 11
	 */
	@Test
	public void sum() {
		int ip[]={1,3,5,2,8,9,10};
		for (int i = 0; i <= ip.length/2; i++) {
			for (int j = 0; j < ip.length; j++) {
				if(ip[i]+ip[j] == 11) {
					System.out.println(ip[i]+"+"+ip[j]+"="+"11");
				}
			}
		}
	}
}
