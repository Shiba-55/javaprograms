package stringprogram;

import org.testng.annotations.Test;

public class PrimeNumberAndPalindrome {

	@Test
	public void primeAndpalindrome() {
		int num=33;
		int a=num;
		int rev=0;
		boolean flag=false;
		while(num>0) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if (a==rev) {
			int count=0;
			for (int i = 2; i < a; i++) {
				if(a%i == 0) {
					count++;
				}
			}
			if(count==0) {
				flag=true;
			}
		}
		if (flag) {
			System.out.println(a+" is a Prime and Palindrome number");
		}else
			System.out.println(a+" is not a Prime and Palindrome number");
		
	}
}
