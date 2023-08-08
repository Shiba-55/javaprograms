package stringprogram;

import java.util.Iterator;

import org.testng.annotations.Test;

public class Pattern1 {

	/**
	 * A
	 * A   B
	 * A   B   C
	 * A   B   C   D
	 * A   B   C   D   E
	 */
	@Test
	public void pattern() {
		for (int i = 0; i < 5; i++) {
			char ch='A';
			for (int j = 0; j <= i; j++) {
				System.out.print(ch+++"  ");
			}
			System.out.println();
			
		}
	}
}
