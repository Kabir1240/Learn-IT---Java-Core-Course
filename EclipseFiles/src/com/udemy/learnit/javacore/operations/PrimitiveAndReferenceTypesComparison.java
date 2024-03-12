package com.udemy.learnit.javacore.operations;

import java.util.Arrays;

public class PrimitiveAndReferenceTypesComparison {
	
	public static void main(String[] args) {
		int int1 = 128;
		int int2 = 128;
		
		System.out.println("int1 == int2: " + (int1 == int2));		// true
		System.out.println("1 == 2: " + (1 == 2));					// false
		
		// 'A' is the 65th character in unicode
		System.out.println("65 == 'A': " + (65 == 'A'));			// true
		
		Integer i = 128;
		Integer i2 = 128;
		
		// Integer types reference the value, so you're not comparing the value, you're comparing the reference
		System.out.println("i == i2: " + (i == i2));				// false
		
		// Works for values from -128 to 127. Due to integer pool... a bit confusing
		Integer i3 = 127;
		Integer i4 = 127;
		System.out.println("i3 == i4: " + (i3 == i4));		// true
		
		// not recommended anymore, thats why its crossed out. ctrl + left click to find out why
		// False, because here we specifically create 2 new objects
		Integer i5 = new Integer(127);
		Integer i6 = new Integer(127);
		System.out.println("i5 == i6: " + (i5 == i6));		// false
		
		// better to do it like this. Doesn't create new objects (unless outside of integer pool)
		Integer i7 = Integer.valueOf(127);
		Integer i8 = Integer.valueOf(127);
		System.out.println("i7 == i8: " + (i7 == i8));		// true
		
		// better, more consistent way to compare
		System.out.println("i.equals(i2): " + i.equals(i2));	// true
		
		// arrays are reference types
		int[] arr1 = {1, 2, 3};
		int[] arr2 = {1, 2, 3};
		
		System.out.println("arr1 == arr2: " + (arr1 == arr2));			// false
		System.out.println("arr1.equals(arr2): " + arr1.equals(arr2)); 	// false
		System.out.println("Arrays.equals(arr1, arr2): " + Arrays.equals(arr1, arr2));	// true
		
		// now point to same object
		arr1 = arr2;
		System.out.println(arr1 == arr2);				// true
		
	}

}