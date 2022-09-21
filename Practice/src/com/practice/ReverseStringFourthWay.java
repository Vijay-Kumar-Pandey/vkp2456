package com.practice;

public class ReverseStringFourthWay {
	
	public static void main(String[] args) {
		String str = "APIPOTHI";

		ReverseStringFourthWay.getReverseString(str);

	}

	private static void getReverseString(String str) {

		String inputString = str;
		System.out.println("***-Before Reverse-***");
		System.out.println(inputString);

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(inputString);

		StringBuilder output = stringBuilder.reverse();
		System.out.println("***-After Reverse-***");
		System.out.println(output);
	}

}
