package Programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementsArray {

	public static void main(String[] args) {

		String [] elem = {"Tom","Peter","David","David","Peter","Tom","Lisa"};
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		for(String s: elem) {
			if(map.containsKey(s)) {
				map.put(s, map.get(s)+1);
			}
			else {
				map.put(s,1);
			}
		}
      // printing the duplicates elem's
		//first way
		
	/*	Iterator<Entry<String, Integer>> it = map.entrySet().iterator();
		while(it.hasNext()) {
			Entry<String, Integer> entry = it.next();
	         if(entry.getValue() > 1) {
	           System.out.println(entry.getKey() + " found " + entry.getValue() + " times");
	      }
		}
		*/
		
		//second way
		
		Set<Entry<String, Integer>> entry = map.entrySet();
		 for(Entry<String, Integer> e : entry) {
			 if(e.getValue() > 1) {
				System.out.println(e.getKey() + " found " + e.getValue() + " times"); 
			 }
			 
		 }
		
	}

}
