package com.stackroute.utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SetSorter {
	public ArrayList<String> toSortSet(String[] names) {
		Set<String> sortSet = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		sortSet.addAll(Arrays.asList(names));
		ArrayList<String> sortToList = new ArrayList<String>(sortSet);
		return sortToList;
	}

}
