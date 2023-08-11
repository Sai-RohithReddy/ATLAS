package com.b.simple.design.business.text;

public class TextHelper {

	public String swapLastTwoCharacters(String str) {
		int length = str.length();

		if (length < 2)
			return str;

		char lastChar = str.charAt(length - 1);
		char secondLastCahr = str.charAt(length - 2);

		String restOfTheString = str.substring(0, length - 2);

		return restOfTheString + lastChar + secondLastCahr;
	}

	public String truncateAInFirst2Positions(String str) {

		if (str.length() < 2)
			return str.replaceAll("A", "");

		String first2Characters = str.substring(0, 2);
		String first2CharactersUpdate = first2Characters.replaceAll("A", "");
		String restOfTheStrng = str.substring(2);

		return first2CharactersUpdate + restOfTheStrng;
	}
}
