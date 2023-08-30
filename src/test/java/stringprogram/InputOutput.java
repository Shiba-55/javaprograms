package stringprogram;

import org.testng.annotations.Test;

public class InputOutput {

	@Test
	public void a() {
		String str="a4b3cd2";
		for (int i = 1; i < str.length(); i++) {
			
			char x=str.charAt(i);
			int b = 0;
			char c=str.charAt(i-1);
			if(x>='0' && '9'>=x) {
				 b=Character.getNumericValue(x);
			}
			else
				b=1;
			
				
			//	if(!((c>='0') && ('9'>=c))){
			//if(!Character.isDigit(c)) {
				if(Character.isLetter(c)) {
			for (int j = 1; j <=b; j++) {
				System.out.print(c);
			
			}
			}
			
			}
			
		}
	
	@Test
	public void b() {
		String str="";
	
		for (char j2 = 'a'; j2 <='z'; j2++) {
			
			if(j2=='a'|| j2=='e' || j2=='i' || j2=='o'||j2=='u') {
				str=str+j2;
			}
		}
		//System.out.println(str);
		for(int i=1;i<=5;i++) {
			for (int j = 0; j <i; j++) {
				System.out.print(str.charAt(j)+" ");
			}
			System.out.println();
		}
	}
	
}
