package com.practice;

public class ReverseStringFifthWay {
	
	public static void main(String[] args) {

		String str = "APIPOTHI";

		ReverseStringFifthWay.getReverseString(str);

	}

	private static void getReverseString(String str) {

		String inputString = str;
		System.out.println("***-Before Reverse-***");
		System.out.println(inputString);

		StringBuilder stringBuilder = new StringBuilder();

		for (int i = inputString.length() - 1; i >= 0; i--) {

			stringBuilder.append(inputString.charAt(i));

		}

		System.out.println("***-After Reverse-***");
		System.out.println(stringBuilder);

	}

}
