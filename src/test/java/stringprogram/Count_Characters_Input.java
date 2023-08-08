package stringprogram;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class Count_Characters_Input {

	/**
	 * input: "Malyalam"
	 * output: m:2a:4l:2y:1
	 */
	@Test
	public void count() {
		String s="Malyalam".toLowerCase();
		LinkedHashMap<Character, Integer> hm=new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (hm.containsKey(s.charAt(i))) {
				hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
			}
			else {
				hm.put(s.charAt(i), 1);
			}
		}
		for ( Entry<Character, Integer> a : hm.entrySet()) {
			System.out.print(a.getKey()+":"+a.getValue());
		}
		System.out.println();
	}
}
