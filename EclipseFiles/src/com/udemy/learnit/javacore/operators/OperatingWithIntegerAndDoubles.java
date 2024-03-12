package com.udemy.learnit.javacore.operators;
import java.math.BigDecimal;
import java.math.RoundingMode;


public class OperatingWithIntegerAndDoubles {
	public static void main(String[] args) 
	{
		// problems of using integers and doubles
		int i = 20;
		System.out.println(i + "/" + 3 + " = " + i/3 + " no rounding and no decimal places for int division");
		System.out.println(i + "/" + 3 + " = " + ((double)i/3) + " too many trailing decimal places for doubles"); 
		System.out.println("\nUsing BigDecimal...");
		// BigDecimal Usage
		BigDecimal rideFee = BigDecimal.valueOf(20).setScale(2);
		BigDecimal nPeople = BigDecimal.valueOf(3);
		// Not adding RoundingMode gives arithmetic exception
		BigDecimal chargePerPerson = rideFee.divide(nPeople, RoundingMode.HALF_UP);
		System.out.println(chargePerPerson);
		
		// Another example
		System.out.println("\nSubtracting Example");
		double d = 3.1;
		double d2 = 1.21;
		System.out.println(d + " - " + d2 + " = " + (d - d2) + " with doubles");
		
		BigDecimal d3 = BigDecimal.valueOf(d).setScale(2);
		BigDecimal d4 = BigDecimal.valueOf(d2).setScale(2);
		
		System.out.println(d3 + " - " + d4 + " = " + d3.subtract(d4) + " with BigDecimal");
	}
}
