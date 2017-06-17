package com.epam.ta.fundamentals.task1;

public class Hometask5 {

	private static final String WRONG_ARGS_AMOUNT = "Wrong amount of arguments. \nProgram usage:\nRun with: <int_num> <int_num> <int_num>";
	private static final String NOT_INT_ARG = "Argument should be an integer number. \nProgram usage:\nRun with: <int_num> <int_num> <int_num>";
	private static final String EXPLANATION = "Calculation using numbers: ";
	private static final String RESULT = "Number after transformation: ";

	public static void main(String[] args) {

		if (args.length != 3) {
			System.out.println(WRONG_ARGS_AMOUNT);
			return;
		}

		long num1 = 0;
		long num2 = 0;
		long num3 = 0;

		try {
			num1 = Long.parseLong(args[0]);
			num2 = Long.parseLong(args[1]);
			num3 = Long.parseLong(args[2]);

			System.out.println(EXPLANATION + num1 + ", " + num2 + ", " + num3);

			num1 = transformNumber(num1);
			num2 = transformNumber(num2);
			num3 = transformNumber(num3);

			System.out.println(RESULT + num1 + ", " + num2 + ", " + num3);

		} catch (NumberFormatException e) {
			System.out.println(NOT_INT_ARG);
		}
	}

	private static long transformNumber(long num) {
		if (num > 0) {
			num = (long) Math.pow(num, 2);
		} else {
			num = (long) Math.pow(num, 4);
		}
		return num;
	}
}
