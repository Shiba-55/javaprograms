package stringprogram;

import org.testng.annotations.Test;

public class Vowel_Count {

	/**
	 * Write a java pgm for below scenario 
 	 * Input: Vijay, Vivek, Jawahar
 	 * Output: 
 	 * Vijay - 2
 	 * Vivek - 2
 	 * Jawahar - 3
	 */
	@Test
	public void count() {
		String s[]= {"Vijay","Vivek","Jawahar"};
		for (int i = 0; i < s.length; i++) {
			int count=0;
			char ch[]=s[i].toLowerCase().toCharArray();
			System.out.println(ch);
			for (int j = 0; j <ch.length  ; j++) {
				if (ch[j] == 'a' || ch[j] == 'e' || ch[j]=='i' || ch[j]=='o' || ch[j]=='u') {
					count++;
					System.out.println(ch[j]);
				}
			}
			System.out.println(s[i]+" - "+count);
		}
	}
}
