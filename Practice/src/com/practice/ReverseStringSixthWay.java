package com.practice;

public class ReverseStringSixthWay {
	
	public static void main(String[] args) {

		String str = "APIPOTHI";

		ReverseStringSixthWay.getReverseString(str);

	}

	private static void getReverseString(String str) {

		String inputString = str;
		System.out.println("***-Before Reverse-***");
		System.out.println(inputString);

		StringBuffer sb = new StringBuffer();

		for (int i = inputString.length() - 1; i >= 0; i--) {

			sb = sb.append(inputString.charAt(i));

		}

		System.out.println("***-After Reverse-***");
		System.out.println(sb);
	}

}
