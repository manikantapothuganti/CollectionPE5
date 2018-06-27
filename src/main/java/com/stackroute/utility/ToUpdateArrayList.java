package com.stackroute.utility;

import java.util.ArrayList;

public class ToUpdateArrayList {
	public ArrayList<String> updatingArrayList(ArrayList<String>inputList,String replacedWith, String replacingWord )
	{
		inputList.set(inputList.indexOf(replacedWith),replacingWord);
		return inputList;
	}
	

}
