package stringprogram;

import org.testng.annotations.Test;

public class Prime_number_1_to_100 {

	@Test
	public void prime() {
		int n=100;
		for(int i=2;n>=i;i++) {
			int count=0;
			for(int j=2;n>=j;j++) {
				if(i%j==0)
					count++;
			}
			if(count==1)
				System.out.println(i+" ");
		}
	}
}
