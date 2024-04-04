package com.udemy.learnit.javacore.codingExercises;

public class CE7SimpleNumberCalculator {

	public static void main(String[] args) {
        if (args[0].contains(".") || args[1].contains(".")){
            double d1 = Double.parseDouble(args[0]);
            double d2 = Double.parseDouble(args[1]);
            System.out.println(d1+d2);
        }
        
        else{
            int d1 = Integer.parseInt(args[0]);
            int d2 = Integer.parseInt(args[1]);
            System.out.println(d1+d2);
        }
	}

}
