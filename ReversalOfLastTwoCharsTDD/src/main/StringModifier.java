package main;

public class StringModifier {

	public String reverseLast2Chars(String str) {
		int len = str.length();
		
		
		char secondLastChar = str.charAt(len-2);
		char lastChar = str.charAt(len-1);
		
		return ""+lastChar+secondLastChar;
	}

}
