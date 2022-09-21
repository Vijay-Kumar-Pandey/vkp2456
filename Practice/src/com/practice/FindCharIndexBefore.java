package com.practice;

public class FindCharIndexBefore {
	
	public static void main(String[] args) {

		String str = "APIPOTHI";
		int index = 5;

		FindCharIndexBefore.getChar(str, index);

	}

	private static void getChar(String str, int index) {

		String userString = str;
		int userIndex = index;

		System.out.println("User Input->" + userString + "-User Index->" + userIndex);

		char[] userCharacter = userString.toCharArray();

		for (int i = 0; i < userCharacter.length; i++) {

			if (i == userIndex - 1) {

				System.out.println("Character->" + userCharacter[i] + "-at Index->" + i);
			}

		}

	}

}
