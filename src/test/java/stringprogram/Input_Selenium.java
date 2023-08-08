package stringprogram;

import org.testng.annotations.Test;

public class Input_Selenium {

	/**
	 * input: "Selenium"
	 * output: s se sel sele selen seleni seleniu selenium
	 */
	@Test
	public void input() {
		String input= "Selenium";
		char ch[]=input.toLowerCase().toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print(ch[j]);
			}
			System.out.print(" ");
		}
	}
}
