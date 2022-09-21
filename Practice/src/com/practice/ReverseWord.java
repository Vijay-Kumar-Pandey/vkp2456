package com.practice;

public class ReverseWord {
	
	public static void main(String[] args) {

		String str = "I LOVE API POTHI";

		ReverseWord.getReverseWord(str);

	}

	private static void getReverseWord(String str) {

		String inputString = str;
		System.out.println("***-Before Reverse-***");
		System.out.println(inputString);

		String wordArray[] = inputString.split(" ", inputString.length());
		String output = "".trim();

		for (int i = wordArray.length - 1; i >= 0; i--) {

			output = output + wordArray[i]+" ";

		}
		
		System.out.println("***-After Reverse-***");
		System.out.println(output);

	}

}
