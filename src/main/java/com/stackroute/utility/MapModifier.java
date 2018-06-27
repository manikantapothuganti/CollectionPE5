package com.stackroute.utility;

import java.util.HashMap;

public class MapModifier {
	public HashMap<String, String>toModify(HashMap<String, String> inputMap){
		if(!inputMap.get("val1").isEmpty())
		{
			inputMap.put("val2", inputMap.get("val1"));
			inputMap.put("val1", "");
		}
		return inputMap;
	}
}
