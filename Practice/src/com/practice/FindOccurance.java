package com.practice;

public class FindOccurance {
	
	public static void main(String[] args) {

		String str = "APIPOTHI";
		char character = 'I';

		FindOccurance.getOccurance(str, character);

	}

	private static void getOccurance(String str, char character) {

		String userString = str;
		char userChar = character;
		String userCharStr = character + "";

		System.out.println("User Data");
		System.out.println("User String->" + userString + "-User Character->" + userChar);
		int lengthOfUserString = userString.length();
		// APIPOTHI - 8
		// APPOTH - 6
		// 'I' occuers (8-6) times
		// 'I' occuers (2) times

		String afterDeleteChar = userString.replace(userCharStr, "");
		int lengthAfterDelete = afterDeleteChar.length();
		int actualLength=lengthOfUserString-lengthAfterDelete;
		System.out.println("Number of Occurance of -"+userChar+" in "+userString+"="+actualLength);
		
		/*Start
		int count=userString.length()-userString.replace(userCharStr, "").length();
		System.out.println("Number of Occurance of -"+userChar+" in "+userString+"="+count);
		END*/
	}

}
