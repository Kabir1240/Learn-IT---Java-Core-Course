package com.udemy.learnit.javacore.codingExercises;
import java.util.Scanner;

public class CE16RotateMatrix {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Please, enter matrix size: ");
		int size = in.nextInt();
		double[][] matrix = generateMatrix(size);

		System.out.println("How you want to rotate matrix:" + System.lineSeparator() +
				"\t1 - 90" + System.lineSeparator() +
				"\t2 - 180" + System.lineSeparator() +
				"\t3 - 270");
		int mode = in.nextInt();

		System.out.println(System.lineSeparator() + "Base matrix:" + System.lineSeparator());
		printMatrixToConsole(matrix);
		System.out.println();

		if (rotateMatrix(matrix, mode)) {
			printMatrixToConsole(matrix);
		}
	}
	
	private static double[][] generateMatrix(int size) {
		double[][] matrix = new double[size][size];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = Double.valueOf(Integer.toString(i) + "." 
						+ Integer.toString(j));
			}
		}
		return matrix;
	}
	
	private static void printMatrixToConsole(double[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	private static boolean rotateMatrix(double[][] matrix, int mode) {
		switch (mode) {
			case 1:
				System.out.println("90 degrees rotated:" + System.lineSeparator());
				rotate90(matrix);
				break;
			case 2:
				System.out.println("180 degrees rotated:" + System.lineSeparator());
				rotate180(matrix);
				break;
			case 3:
				System.out.println("270 degrees rotated:" + System.lineSeparator());
				rotate270(matrix);
				break;
			default:
				System.out.println("You selected non-existing mode!");
				return false;
			}
		return true;
	}
	
	public static void rotate90(double[][] matrix) {
		int matrixLength = matrix[1].length;
		double[][] rotatedMatrix = new double[matrixLength][matrixLength];
		int currentColumn = 0;
		for (int row = matrixLength - 1; row >= 0; row--) 
		{
			for (int index = 0; index < matrixLength; index++) 
			{
				rotatedMatrix[index][currentColumn] = matrix[row][index];
			}
			currentColumn++;
		}
		
		for (int i = 0; i < matrixLength; i++) {
			matrix[i] = rotatedMatrix[i];
		}
	}

	public static void rotate180(double[][] matrix) {
		int matrixLength = matrix[1].length;
		double[][] rotatedMatrix = new double[matrixLength][matrixLength];
		int currentRow = 0;
		int currentColumn = 0;
		for (int row = matrixLength - 1; row >= 0 ; row --) {
			currentColumn = 0;
			for (int column = matrixLength - 1; column >= 0; column --) {
				rotatedMatrix[currentRow][currentColumn] = matrix[row][column];
				currentColumn ++;
			}
			currentRow ++;
		}
		
		for (int i = 0; i < matrixLength; i++) {
			matrix[i] = rotatedMatrix[i];
		}
	}

	public static void rotate270(double[][] matrix) {
		int matrixLength = matrix[1].length;
		double[][] rotatedMatrix = new double[matrixLength][matrixLength];
		int currentColumn = 0;
		int currentRow = matrixLength - 1;
		for (int row = 0; row < matrixLength; row ++) {
			currentRow = matrixLength - 1;
			for (int column = 0; column < matrixLength; column ++) {
				rotatedMatrix[currentRow][currentColumn] = matrix[row][column];
				currentRow --;
			}
			currentColumn ++;
		}
		for (int i = 0; i < matrixLength; i++) {
			matrix[i] = rotatedMatrix[i];
		}
	}
}