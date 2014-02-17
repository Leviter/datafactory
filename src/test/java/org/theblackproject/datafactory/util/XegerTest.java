package org.theblackproject.datafactory.util;

import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.assertTrue;

public class XegerTest {

	private static final Pattern LOWER_CASE = Pattern.compile("\\p{Lu}");
	private static final Pattern UPPER_CASE = Pattern.compile("\\p{Ll}");
	private static final Pattern DECIMAL_DIGIT = Pattern.compile("\\p{Nd}");

	@Test
	public void testGenerateARandom20CharacterLengthStringWithAtLeastALowerCaseCharacterAndUpperCaseCharacterAndADigit(){
		Xeger xeger = new Xeger("@[0-9]{1}@&@[A-Za-z]{1}@&[0-9a-zA-Z]{20}");
		String generatedString = xeger.generate();
		assertTrue("Should contain at least a digit", containsDigit(generatedString));
		assertTrue("Should contain at least an upper case or lower case Character", containsUpperCase(generatedString) || containsLowerCase(generatedString) );
		assertTrue("Length must be 20", generatedString.length() == 20);
	}


	private static boolean containsDigit(final String str) {
		return DECIMAL_DIGIT.matcher(str).find();
	}

	private static boolean containsUpperCase(final String str) {
		return UPPER_CASE.matcher(str).find();
	}

	private static boolean containsLowerCase(final String str) {
		return LOWER_CASE.matcher(str).find();
	}
}
