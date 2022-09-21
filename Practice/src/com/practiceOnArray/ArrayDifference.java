package com.practiceOnArray;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayDifference {
	
	public static void main(String[] args) {

		Integer[] Array_One = { 1, 2, 3, 4, 5, 6, 7, 8 };
		Integer[] Array_Two = { 5, 6, 7, 8 };

		ArrayDifference.getDiff(Array_One, Array_Two);

	}

	private static void getDiff(Integer[] array_One, Integer[] array_Two) {

		Integer[] firstArray = array_One;
		Integer[] secondArray = array_Two;

		System.out.println("User Input");
		System.out.println(Arrays.toString(firstArray));
		System.out.println(Arrays.toString(secondArray));

		List<Integer> firstList = Arrays.asList(firstArray);
		List<Integer> SecondList = Arrays.asList(secondArray);

		System.out.println("List Element");
		System.out.println(firstList);
		System.out.println(SecondList);

		Set<Integer> firstSet = new HashSet<Integer>(firstList);

		firstSet.removeAll(SecondList);
		System.out.println("After Remove from Set");
		System.out.println(firstSet);

	}

}
