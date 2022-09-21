package com.practice;

public class FindCharIndex {
	
	public static void main(String[] args) {

		String str = "VIJAYKUMARPANDEY";
		int index = 9;

		FindCharIndex.getChar(str, index);

	}

	private static void getChar(String str, int index) {

		String userString = str;
		int userIndex = index;

		System.out.println("User String- " + userString + " -User Index- " + userIndex);

		char[] chaarArray = userString.toCharArray();

		for (int i = 0; i < chaarArray.length; i++) {

			if (i == userIndex) {

				System.out.println("Character->" + chaarArray[i] + "-at Index->" + i);
			}

		}

	}
	
	
	

}
