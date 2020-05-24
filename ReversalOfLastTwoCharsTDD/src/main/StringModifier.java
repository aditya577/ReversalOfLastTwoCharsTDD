package main;

public class StringModifier {

	public String reverseLast2Chars(String str) {
		char firstChar = str.charAt(0);
		char secondChar = str.charAt(1);
		
		return ""+secondChar+firstChar;
	}

}
