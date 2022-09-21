package com.practice;

import java.util.HashMap;
import java.util.Map;


public class FindFirstRepeating {
	
	public static void main(String[] args) {

		String str = "APIPOTHI";
		FindFirstRepeating.getFirstRepetedChar(str);

	}

	private static void getFirstRepetedChar(String str) {

		String userInput = str;
		System.out.println("User Input->" + userInput);

		char[] userChar = userInput.toCharArray();

		Map<Character, Integer> occuranceMap = new HashMap<Character, Integer>();

		for (int i = 0; i < userChar.length; i++) {

			if (occuranceMap.containsKey(userChar[i])) {

				occuranceMap.put(userChar[i], occuranceMap.get(userChar[i]) + 1);

			} else {
				occuranceMap.put(userChar[i], 1);
			}
		}

		System.out.println("Character Occurance");
		System.out.println(occuranceMap);

		for (char charValue : userChar) {

			if (occuranceMap.get(charValue) > 1) {
				System.out.println("First repeated character in String  " + userInput +
									" is " + charValue
									+ " occurred " + occuranceMap.get(charValue)+" times");
				break;
			}
		}
	}

}
