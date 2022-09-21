package com.practice;

public class ReverseStringFirstWay {
	public static void main(String[] args) {
		String str = "APIPOTHI";

		ReverseStringFirstWay.getReverseString(str);

	}

	private static void getReverseString(String str) {

		String userinput = str;
		System.out.println("***-Before Reverse-***");
		System.out.println(userinput);
		String outPut = "";

		for (int i = 0; i < userinput.length(); i++) {
			outPut = outPut + userinput.charAt(userinput.length() - 1 - i);
		}

		System.out.println("***-After Reverse-***");
		System.out.println(outPut);

	}
}
