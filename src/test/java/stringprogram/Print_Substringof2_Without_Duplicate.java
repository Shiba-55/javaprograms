package stringprogram;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class Print_Substringof2_Without_Duplicate {

	/**
	 * Write a program
	 * to print substring of length 2 and
	 * remove duplicates  using collection
	 */
	@Test
	public void substring1() {
		String s="My name is shiba shankar and litan".replaceAll(" ", "");
		LinkedHashSet<Character> lhs= new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			
			lhs.add(s.charAt(i));
		}
		String sb="";
		for (Character ch : lhs) {
			sb=sb+ch;
		}
		for (int i = 0; i < sb.length()-1;) {
			for (int j = i; j <= i+1; j++) {
				System.out.print(sb.charAt(j));
			}
			i=i+2;
			System.out.print(" ");
		}
	}
}
