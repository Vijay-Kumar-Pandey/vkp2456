package com.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class FindDuplicateCharacterInString {
	
	public static void main(String[] args) {

		String str = "APIPOTHI";

		Map<Character, Integer> map = FindDuplicateCharacterInString.getRepeted(str);

		Set<Character> setOfkey = map.keySet();

		Iterator<Character> itr = setOfkey.iterator();

		while (itr.hasNext()) {

			Character key = itr.next();
			Integer value = map.get(key);

			if(value>1){
				System.out.println(" Character "+ key +" Repeat "+value+" Times Of Input String "+str);
			}
			
		}
	}

	private static Map<Character, Integer> getRepeted(String str) {

		String userInput = str;
		System.out.println("User Input-> " + userInput);

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		char[] charArray = userInput.toCharArray();

		for (int i = 0; i < charArray.length; i++) {

			if (map.containsKey(charArray[i]) == true) {

				map.put(charArray[i], map.get(charArray[i]) + 1);
			} else {
				map.put(charArray[i], 1);
			}

		}
		return map;

	}

}
