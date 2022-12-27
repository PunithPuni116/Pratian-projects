package asssignmentHashMap;

import java.util.HashMap;
import java.util.Map;

public class StringUtility {
	
	HashMap<String,Integer>map=new HashMap<>();
	
	
	public int uniqueCharacterCount(String s) {
		int count=0;
		HashMap<String,Integer>map1=new HashMap<>();
		if(map.containsKey(s))
			return map.get(s);
		
		for(int i=0;i<s.length();i++) {
			String s1=Character.toString(s.charAt(i));
				map1.put(s1, 0);
		}
		
		
		count=map1.size();
		map.clear();
		map.put(s, count);
		return count;
	}
	
}
