package stringprogram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class Occurance_Of_Words {

	@Test
	public void occur() {
		String s="My name is rishav it contains ri and shav";
		String[] str=s.split("\\s+");
		HashMap<String, Integer> hs =new HashMap<String, Integer>();
		for (int i = 0; i < str.length; i++) {
			if (hs.containsKey(str[i])) {
				hs.put(str[i],hs.get(str[i])+1);
			}
			else {
				hs.put(str[i], 1);
			}
		}
		for(Entry<String, Integer> sm:hs.entrySet()) {
		System.out.println(sm.getKey()+" :---->>>>: "+sm.getValue());
		}
	}
}
