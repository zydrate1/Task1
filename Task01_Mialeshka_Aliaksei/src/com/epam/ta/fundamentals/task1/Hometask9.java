package com.epam.ta.fundamentals.task1;
import java.util.ArrayList;
import java.util.List;

public class Hometask9 {

	private static final String WRONG_ARGS_AMOUNT = "Wrong amount of arguments. \nProgram usage:\nRun with: <array1_int_num_1> ...<array1_int_num_n> <.> <array2_int_num_1> ...<array2_int_num_n> <int_num>";
	private static final String NOT_INT_ARG = "Argument should be an integer number. \nProgram usage:\nRun with: <array_int_num_1> ...<array_int_num_n> <division_int_num>";
	private static final String INITIAL = "Initial array ";
	private static final String RESULT = "Result array: ";
	private static final String INDEX = "Array1 insertion index: ";
	private static final String ERROR_INDEX = "Insert index should be positive number and be less than array1 size.";

	public static void main(String[] args) {

		if (args.length < 4) {
			System.out.println(WRONG_ARGS_AMOUNT);
		} else {
			List<String> argList = new ArrayList<>();
			int dotPlace = 0;
			for (int i = 0; i < args.length; i++) {
				argList.add(args[i]);
			}
			for (int i = 0; i < argList.size(); i++) {
				if (argList.get(i).equals(".")) {
					dotPlace = i;
				}
			}

			int[] arr1 = new int[dotPlace];
			int[] arr2 = new int[argList.size() - dotPlace - 2];
			int insertIndex = 0;

			try {
				for (int i = 0; i < arr1.length; i++) {
					arr1[i] = Integer.parseInt(argList.get(i));
				}
				for (int i = 0; i < arr2.length; i++) {
					arr2[i] = Integer.parseInt(argList.get(i + dotPlace + 1));
				}
				insertIndex = Integer.parseInt(argList.get(argList.size() - 1));
				if (insertIndex < 0 || insertIndex > arr1.length) {
					System.out.println(ERROR_INDEX);
					return;
				}
			} catch (NumberFormatException e) {
				System.out.println(NOT_INT_ARG);
				return;
			}

			System.out.print(INITIAL + "1: ");
			printArray(arr1);

			System.out.print("\n" + INITIAL + "2: ");
			printArray(arr2);

			System.out.print("\n" + INDEX + insertIndex + "\n");

			System.out.print("\n" + RESULT);
			printArray(generateResultArray(arr1, arr2, insertIndex));
			System.out.println();
		}
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	private static int[] generateResultArray(int[] arr1, int[] arr2, int insertIndex) {
		int[] resultArray = new int[arr1.length + arr2.length];
		for (int i = 0; i < insertIndex; i++) {
			resultArray[i] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			resultArray[i + insertIndex] = arr2[i];
		}
		for (int i = 0 + insertIndex; i < arr1.length; i++) {
			resultArray[i + arr2.length] = arr1[i];
		}
		return resultArray;
	}

}
