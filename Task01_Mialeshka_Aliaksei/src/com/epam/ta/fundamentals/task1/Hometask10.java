package com.epam.ta.fundamentals.task1;

public class Hometask10 {

	private static final String WRONG_ARGS_AMOUNT = "Wrong amount of arguments. \nProgram usage:\nRun with: <int_matrix_size>";
	private static final String NOT_INT_ARG = "Argument should be an integer number. \nProgram usage:\nRun with: <int_matrix_size>";
	private static final String EXPLANATION = "Calculation for matrix with size: ";

	public static void main(String[] args) {

		if (args.length != 1) {
			System.out.println(WRONG_ARGS_AMOUNT);
			return;
		}
		int matrix_size = 0;
		try {
			matrix_size = Integer.parseInt(args[0]);
			if (matrix_size < 0) {
				System.out.println(NOT_INT_ARG);
				return;
			}
		} catch (NumberFormatException e) {
			System.out.println(NOT_INT_ARG);
			return;
		}

		System.out.println(EXPLANATION + matrix_size + "\n");
		int matrix[][] = generateMatrix(matrix_size);
		printMatrix(matrix);

	}

	private static int[][] generateMatrix(int matrix_size) {
		int matrix[][] = new int[matrix_size][matrix_size];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i % 2 == 0) {
					matrix[i][j] = j + 1;
				} else {
					matrix[i][j] = matrix_size - j;
				}
			}
		}
		return matrix;
	}

	private static void printMatrix(int matrix[][]) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("%3d ", matrix[i][j]);
			}
			System.out.println();
		}
	}

}
