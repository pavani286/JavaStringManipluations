package Programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class StringOccurencesOfCharUsingMap {

	   public static void main(String[] args) {
		   
		   String str="5555555yyeerrrbbbsssjjj";
		   char[] c = str.toCharArray();
		   Map<Character,Integer> map = new HashMap<Character,Integer>();
		   
		   for(Character ch :c) {
			   if(map.containsKey(ch)) {
			   map.put(ch, map.get(ch)+1);
			                  }
			    else {
				   map.put(ch, 1);
			   }
		   }
		   
		   // print duplicates characters
		   Iterator<Entry<Character, Integer>> it1 = map.entrySet().iterator();
		      while(it1.hasNext()) {
		    	  Entry<Character, Integer> entry = it1.next();
			         if(entry.getValue() > 1) {
			           //System.out.println(entry.getKey() + " found " + entry.getValue() + " times");
			        	 System.out.print(entry.getKey()+""+entry.getValue() );
			      }
			    }
	  }
}




/*
 Set<Entry<Character, Integer>> duplicatechars =  map.entrySet();
		   for(Entry<Character, Integer> entry : duplicatechars){
		        if(entry.getValue() > 1) {
			           System.out.println(entry.getKey() + " found " + entry.getValue() + " times");
			      } 
			  }  */
