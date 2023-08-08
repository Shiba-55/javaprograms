package stringprogram;

import org.testng.annotations.Test;

public class TryCatchFinally {

	@Test
	public int tried() {
		try {
			//System.out.println("Shiba");
			//int a= 10/0;
			System.out.println("Litan");
			
		}
		catch(Throwable e) {
			System.out.println("Shankar");
			
		}
		finally {
			System.out.println("Mohapatra");
			return 5;
		}
		
		
	}
}
