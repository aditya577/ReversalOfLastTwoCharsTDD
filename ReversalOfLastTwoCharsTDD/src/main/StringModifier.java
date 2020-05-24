package main;

public class StringModifier {

	public String reverseLast2Chars(String str) {
		int len = str.length();
		
		if(len <= 1) return str;
		
		String strMinusLast2Chars = str.substring(0, len-2);
		
		char secondLastChar = str.charAt(len-2);
		char lastChar = str.charAt(len-1);
		
		return strMinusLast2Chars+lastChar+secondLastChar;
	}

}
