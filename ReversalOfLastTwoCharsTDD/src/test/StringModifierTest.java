package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.StringModifier;

class StringModifierTest {

	@Test
	void testWith2Chars() {
		StringModifier sm = new StringModifier();
		assertEquals("BA",sm.reverseLast2Chars("AB"));
	}

}
