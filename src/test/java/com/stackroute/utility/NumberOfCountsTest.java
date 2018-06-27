package com.stackroute.utility;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberOfCountsTest {

	@Test
	public void testNumberOfString() {
		//Arrange
		String expected = new String("{one=5, two=2, three=2}");
		NumberOfCounts noc = new NumberOfCounts();
		
		//Act
		String actual= noc.toFindCounts(new String("“one one -one___two,,three,one @three*one?two”"));
		//assert
		assertEquals(expected, actual);
	}

}
