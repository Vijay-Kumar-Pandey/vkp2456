package com.practice;

public class ReverseStringThirdWay {

	public static void main(String[] args) {

		String str = "APIPOTHI";

		ReverseStringThirdWay.getReverseString(str);

	}

	private static void getReverseString(String str) {

		String inputString = str;

		System.out.println("***-Before Reverse-***");
		System.out.println(inputString);

		StringBuffer sb = new StringBuffer();
		sb.append(inputString);

		StringBuffer output = sb.reverse();
		System.out.println("***-After Reverse-***");
		System.out.println(output);

	}
	
}
