package com.epam.ta.fundamentals.task1;

public class Hometask6 {

	private static final String WRONG_ARGS_AMOUNT = "Wrong amount of arguments. \nProgram usage:\nRun with: <int_num> <int_num> <int_num>";
	private static final String NOT_INT_ARG = "Argument should be an integer number. \nProgram usage:\nRun with: <int_num> <int_num> <int_num>";
	private static final String EXPLANATION = "Calculation using numbers: ";
	private static final String RESULT = "Max and min number sum: ";

	public static void main(String[] args) {

		if (args.length != 3) {
			System.out.println(WRONG_ARGS_AMOUNT);
		}

		long num1 = 0;
		long num2 = 0;
		long num3 = 0;

		try {
			num1 = Long.parseLong(args[0]);
			num2 = Long.parseLong(args[1]);
			num3 = Long.parseLong(args[2]);

			System.out.println(EXPLANATION + num1 + ", " + num2 + ", " + num3);

			System.out.println(RESULT + calcMaxAndMinSumm(num1, num2, num3));

		} catch (NumberFormatException e) {
			System.out.println(NOT_INT_ARG);
		}

	}

	private static long calcMaxAndMinSumm(long num1, long num2, long num3) {

		long result = 0;
		if (num1 > num2) {
			if (num1 > num3) {
				if (num2 > num3) {
					result = num1 + num3;
				} else {
					result = num1 + num2;
				}
			} else {
				result = num3 + num2;
			}
		} else {
			if (num2 > num3) {
				if (num1 > num3) {
					result = num2 + num3;
				} else {
					result = num2 + num1;
				}
			} else {
				result = num3 + num1;
			}
		}
		return result;
	}
}
