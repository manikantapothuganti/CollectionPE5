package com.stackroute.utility;

import java.util.HashMap;
import java.util.Map;

public class NumberOfCounts {

	public String toFindCounts(String string) {
		Map<String,Integer> counter = new HashMap<>();
		String words[] = string.trim().split("\\W|_");
		for (String strings : words) {
			if(counter.containsKey(strings)&& !strings.isEmpty()) {
				counter.put(strings, counter.get(strings)+1);
			}else if(!strings.isEmpty()) {
				counter.put(strings,1);
			}
		}
		return counter.toString();
		
	}
}
