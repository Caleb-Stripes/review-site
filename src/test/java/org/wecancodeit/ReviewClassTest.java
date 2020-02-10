package org.wecancodeit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReviewClassTest {

	Review underTest = new Review(5, "Twinky",5.12, "Sport", "Steepest climb in the RRG.");
	
	@Test
	public void idGetterShouldReturnLong() {
		long result = underTest.getId();
		assertEquals(5, result);
	}
	
	@Test
	public void titleGetterShouldReturnString() {
		String result = underTest.getTitle();
		assertEquals("Twinky", result);
	}
	
	@Test
	public void categoryShouldReturnString() {
		String result = underTest.getCategory();
		assertEquals("Sport", result);
	}
	
	public void contentShouldReturnString() {
		String result = underTest.getContent();
		assertEquals("Steepest climb in the RRG.", result);
	}
	
	public void gradeShouldReturnDouble() {
		double result = underTest.getGrade();
		assertEquals(5.12, result);
	}

}
