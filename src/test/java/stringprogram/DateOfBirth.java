package stringprogram;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class DateOfBirth {

	@Test
	public void dob() {
		String s="My dob is 1-05-1995";
		String str[]=s.split("\\s+");
		for (String dob : str) {
			if (dob.charAt(0)>='0' && '9'>=dob.charAt(0)) {
				System.out.println(dob);
			}
		}
	}
	
	@Test
	public void countDuplicate() {
		String name="abcd abcd abcd abcd litan shiba litan shankar shiba";
		String str[]=name.split("\\s+");
		
		ArrayList<String> al=new ArrayList<>();
		for (String string : str) {
			int count=0;
			for (int i = 0; i < str.length; i++) {
				if (string.equals(str[i])) {
					count++;
				}
			}
			if (count>1 && !(al.contains(string+">>"+count))) {
				al.add(string+">>"+count);
			}
		}
		for (String string : al) {
			System.out.println(string);
		}
	}
}
