package com.stackroute.utility;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MapModifierTest {

	private MapModifier mapManipulator;

	@Before
	public void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		mapManipulator = new MapModifier();

	}

	@After
	public void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		mapManipulator = null;

	}
	
	@Test
	public void testManipulateMap1() {
		HashMap<String, String> inputMap = new HashMap<String,String>();
		inputMap.put("val1","");
		inputMap.put("val2","C++");
		HashMap<String, String> expectedMap = new HashMap<String,String>();
		expectedMap.put("val1","");
		expectedMap.put("val2","C++");
		assertEquals(expectedMap, mapManipulator.toModify(inputMap));
	}
	
	@Test
	public void testManipulateMap2() {
		HashMap<String, String> inputMap = new HashMap<String,String>();
		inputMap.put("val1","java");
		inputMap.put("val2","C++");
		HashMap<String, String> expectedMap = new HashMap<String,String>();
		expectedMap.put("val1","");
		expectedMap.put("val2","java");
		assertEquals(expectedMap, mapManipulator.toModify(inputMap));
	}

}
