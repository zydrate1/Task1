package com.epam.ta.fundamentals.task1;

public class Hometask8 {

	private static final String WRONG_ARGS_AMOUNT = "Wrong amount of arguments. \nProgram usage:\nRun with: <array_int_num_1> ...<array_int_num_n> <division_int_num>";
	private static final String NOT_INT_ARG = "Argument should be an integer number. \nProgram usage:\nRun with: <array_int_num_1> ...<array_int_num_n> <division_int_num>";
	private static final String EXPLANATION = "Calculation array: ";
	private static final String RESULT = "Summ of elements multiple by ";

	public static void main(String[] args) {

		if (args.length < 2) {
			System.out.println(WRONG_ARGS_AMOUNT);
		} else {

			long[] arr = new long[args.length - 1];
			long division = 0;
			long summ = 0;
			try {

				for (int i = 0; i < arr.length; i++) {
					arr[i] = Long.parseLong(args[i]);
				}
				division = Long.parseLong(args[args.length - 1]);

				printArray(arr, division);
				System.out.println(RESULT + division + ": " + calcSumm(arr, division));

			} catch (NumberFormatException e) {
				System.out.println(NOT_INT_ARG);
			}
		}

	}

	private static long calcSumm(long[] arr, long division) {
		long summ = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % division == 0) {
				summ += arr[i];
			}
		}
		return summ;
	}

	private static void printArray(long[] arr, long division) {
		System.out.println(EXPLANATION);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
