package stringprogram;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.testng.annotations.Test;


public class Vowel_Count_Descending {

	/**
	 * Input: Mrudula, Chat, Zoom 
	 * Output:
	 * Mrudula - 3
	 * Zoom - 2
	 * Chat - 1

	 */
	@Test
	public void count() {
		String s[]= {"Mrudula", "Chat", "Zoom"};
		TreeMap<Integer, String> hm= new TreeMap<Integer, String>(Comparator.reverseOrder());
		for (int i = 0; i < s.length; i++) {
			char ch []=s[i].toLowerCase().toCharArray();
			int count=0;
			for (int j = 0; j < ch.length; j++) {
				if ("aeiou".contains(""+ch[j])) {
					count++;
				}
			}
			hm.put(count, s[i]);
		}
		for (Map.Entry<Integer, String> entry : hm.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			System.out.println(entry.getValue()+" - "+entry.getKey());
		}
	}
}
