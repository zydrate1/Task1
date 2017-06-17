package com.epam.ta.fundamentals.task1;

public class Hometask4 {

	private static final String WRONG_ARGS_AMOUNT = "Wrong amount of arguments. \nProgram usage:\nRun with: <x_coord> <y_coord>";
	private static final String NOT_INT_ARG = "Argument should be an integer number. \nProgram usage:\nRun with: <x_coord> <y_coord>";

	public static void main(String[] args) {

		if (args.length != 2) {
			System.out.println(WRONG_ARGS_AMOUNT);
			return;
		}

		int x = 0;
		int y = 0;
		try {
			x = Integer.parseInt(args[0]);
			y = Integer.parseInt(args[1]);

			System.out.println(isDotInArea(x, y));

			// delete comment to use second variant
			// System.out.println(isDotInAreaUsingArrays(x, y));

		} catch (NumberFormatException e) {
			System.out.println(NOT_INT_ARG);
		}
	}

	// first variant
	private static boolean isDotInArea(int x, int y) {
		boolean isDotInArea = false;
		if ((x >= -2 && x <= 2 && y > 0 && y <= 4) || (x >= -4 && x <= 4 && y >= -3 && y <= 0)) {
			isDotInArea = true;
		}
		return isDotInArea;
	}

	// additional variant
	private static boolean isDotInAreaUsingArrays(int x, int y) {

		int[] xCoords = { -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, -4, -3, -2, -1, 0, 1, 2,
				3, 4, -4, -3, -2, -1, 0, 1, 2, 3, 4, -4, -3, -2, -1, 0, 1, 2, 3, 4, -4, -3, -2, -1, 0, 1, 2, 3, 4 };
		int[] yCoords = { 4, 4, 4, 4, 4, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -2, -2, -2, -2, -2, -2, -2, -2, -2, -3, -3, -3, -3, -3, -3, -3, -3, -3 };
		boolean isDotInArea = false;

		for (int i = 0; i < xCoords.length; i++) {
			if (x == xCoords[i] && y == yCoords[i]) {
				isDotInArea = true;
			}
		}
		return isDotInArea;
	}

}
