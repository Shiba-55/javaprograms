package stringprogram;

import java.util.Iterator;

import org.testng.annotations.Test;

public class Insert_a_string_into_middle_of_string_array {

	@Test
	public void insert() {
		String s="I am Shankar Mohapatra litan abc";
		String str[]=s.split(" ");
		String str1[]=new String [str.length+1];
		for (int i = 0; i < str1.length; i++) {
			if (i == str.length/2) {
				str1[i]="Shiba";
			}
			else if(i < str1.length/2) {
				str1[i]=str[i];
			}
			else {
				str1[i]=str[i-1];
			}
		}
		for (String s2 : str1) {
			System.out.print(s2+" ");
		}
	}
}
