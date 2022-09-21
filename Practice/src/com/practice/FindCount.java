package com.practice;

public class FindCount {
	
	public static void main(String[] args) {

		String str = "APIPOTHI";
		char character = 'I';

		FindCount.getOccurance(str, character);

	}

	private static void getOccurance(String str, char character) {

		String userString = str;
		char userChar = character;
		int counter = 0;

		System.out.println("-User String-" + userString + "-User Charecter->" + userChar);

		char[] userCharacter = userString.toCharArray();

		for (int i = 0; i < userCharacter.length; i++) {

			if (userCharacter[i] == userChar) {
				counter++;
			}

		}

		System.out.println("Character " + userChar + " Occurs " + counter + " Times");
	}

}
