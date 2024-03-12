package com.udemy.learnit.javacore.ExpressionTypes;

public class ExpressionTypes {

	public static void main(String[] args) {
		byte b = 1;
		short s = 1;
		int i = 1;
		long l = 1;

		float f = 1.0F;
		double d = 1.0;

		char c = 1;
		
		// any operations between byte, short or int is automatically an int
		int intExpressionType = b + b;
		int intExpressionType2 = s + s;
		int intExpressionType3 = b + i + c;
		
		// This doesn't apply to long. Long operations remain long
		long longExpressionType = i + l;
		
		// float operations always result in float. Unless double is involved
		float floatExpressionType = l + f;

		// double operations result in double.
		double doubleExpressionType = f + d;


		System.out.println(10 / 3); // 3
		System.out.println(10.0 / 3); // 3.3333333333333335
		
		// this is how string concatenations work
		System.out.println("Hello " + 1); // Hello 1
		System.out.println("Hello " + null); // Hello null
	}

}
