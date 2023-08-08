package stringprogram;

import org.testng.annotations.Test;

public class Find_first_max_element_without_bubble_sorting {

	/**
	 * input: {7, -3, 0, 2, 1, -9} find first max element without bubble sorting
	 */
	@Test
	public void max() {
		int a[]={7, -3, 0, 2, 1, -9};
		int max=a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
	}
}
