package stringprogram;

import org.testng.annotations.Test;

public class Product_of_Max_3_element {

	@Test
	public void product() {
		int a[]={7, -3, 0, 2, 1, -9};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if (a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println(a[0]*a[1]*a[2]);
	}
}
