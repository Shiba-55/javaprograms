package stringprogram;

import org.testng.annotations.Test;

public class Print_Missing_Number {

	/**
	 * if arr[] = {1, 2, 5} 
	 * Print the no. in b/w 1-10 except the no which are present in array
	 **/
	@Test
	public void missing() {
		int arr[] = {1, 2, 5};
		for (int i = 1; i <= 10; i++) {
			int count=0;
			for (int j = 0; j < arr.length; j++) {
				if (i == arr[j]) {
					count++;
				}
			}
			if (count==0) {
				System.out.println(i);
			}
		}
	}
}
