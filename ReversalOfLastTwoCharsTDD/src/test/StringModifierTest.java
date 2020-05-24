package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.StringModifier;

class StringModifierTest {
	
	StringModifier sm = new StringModifier();

	@Test
	void testWith2Chars() {
		assertEquals("BA",sm.reverseLast2Chars("AB"));
	}
	
	@Test
	void testWith4Chars() {
		assertEquals("ABDC",sm.reverseLast2Chars("ABCD"));
	}
	
	@Test
	void testWith10Chars() {
		assertEquals("ABCDEFGHJI",sm.reverseLast2Chars("ABCDEFGHIJ"));
	}
	

}
