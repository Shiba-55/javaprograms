package stringprogram;

import org.testng.annotations.Test;

public class Even_Number_1_to_20 {

	@Test
	public void even() {
		int n=20;
		for(int i=1;n>=i;i++) {
			if (i%2==0) {
				System.out.print(i+" ");
			}
		}
	}
}
