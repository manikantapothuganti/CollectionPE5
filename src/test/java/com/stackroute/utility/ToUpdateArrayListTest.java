package com.stackroute.utility;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class ToUpdateArrayListTest {

	@Test
	public void test() {
		//arrange
		ToUpdateArrayList tua = new ToUpdateArrayList();
		ArrayList<String> expected = new ArrayList<>();
		expected.add("Kiwi");
		expected.add("Grape");
		expected.add("Mango");
		
		ArrayList<String> inputList = new ArrayList<>();
		inputList.add("Apple");
		inputList.add("Grape");
		inputList.add("Mango");
		
		//Act
		ArrayList<String> actual = tua.updatingArrayList(inputList,"Apple","Kiwi");
		
		//Assert
		assertEquals(expected, actual);
		
	}

}
