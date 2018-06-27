package com.stackroute.utility;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCounterTest {

	@Test
	public void testStringCounter() {
		String expected ="{a=true, b=true, c=false, d=true}";
		StringCounter sc = new StringCounter();
		String actual=sc.stringCounter(new String[]{"a","a","a","b","b","c","d","d"});
		assertEquals(expected, actual);
	}

}
