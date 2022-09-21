package com.practice;

public class ReverseStringSeventhWay {
	
	public static void main(String[] args) {

		String str = "APIPOTHI";

		ReverseStringSeventhWay.getReverseString(str);

	}

	private static void getReverseString(String str) {

		String inputString = str;
		System.out.println("***-Before Reverse-***");
		System.out.println(inputString);

		byte[] inputAsByteArray = inputString.getBytes();
		String outout = "";

		for (int i = 0; i < inputAsByteArray.length; i++) {

			char c = (char) inputAsByteArray[inputAsByteArray.length - i - 1];
			outout = outout + c;

		}
		System.out.println("Output String : " + outout);

	}
}
