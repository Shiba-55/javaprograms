package stringprogram;

import org.testng.annotations.Test;

public class InputPattern {

	/**
	 * input: "aabbaa"
	 * output: aa ab bb ba aa
	 */
	@Test
	public void input() {
		String input= "aabbaa";
		char ch[]=input.toLowerCase().toCharArray();
		for (int i = 0; i < ch.length-1; i++) {
			for (int j = i; j <= i+1; j++) {
				System.out.print(ch[j]);
			}
			System.out.print(" ");
		}
		System.out.println();
		System.out.println("aa ab bb ba aa");
	}
}
