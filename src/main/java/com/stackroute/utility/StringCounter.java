package com.stackroute.utility;

import java.util.HashMap;
import java.util.Map;

public class StringCounter {
	public String stringCounter(String array[]) {
		Map<String,Boolean> results = new HashMap<>();
		
		for (String string : array) {
			if(results.containsKey(string)) {
				results.put(string, true );
			}else {
				results.put(string, false);
			}
		}
		return results.toString();
	}

}
