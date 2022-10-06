package Repetative_Program;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repetative {

	public static void main(String[] args) {
       String s = "API TESTING MANUAL TESTING AUTOMATION TESTING REST API TESTING";
      Map<String, Integer> m = new HashMap<String, Integer>();
       String[] all_Words = s.split(" ");
    //   System.out.println(all_Words);       
       for (String word : all_Words) {
	//	System.out.println(word);
		
		if (m.containsKey(word)) {
			
			  Integer value = m.get(word);  
			  m.put(word, value+1);	
		}
		else {
			m.put(word, 1);
			
			//{ api = 1 testing = 1 manual = 1 testing = 1  api = 2 }
		}
	}
      System.out.println(m); 
      Set<Entry<String, Integer>> entrySet = m.entrySet();
      for (Entry<String, Integer> entry : entrySet) {
		if (entry.getValue()>1) {
			System.out.println(entry);
		}
	}
      
	}
	
	                
          
	}
//output  
//  API = 2 
//  TESTING = 4