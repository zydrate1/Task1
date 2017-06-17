package com.epam.ta.fundamentals.task1;

import java.util.Map.Entry;
import java.util.TreeMap;

public class Hometask7 {

	private static final String WRONG_ARGS_AMOUNT = "Wrong amount of arguments. \nProgram usage:\nRun with: <int_start> <int_end> <int_step>";
	private static final String NOT_INT_ARG = "Argument should be an integer number. \nProgram usage:\nRun with: <int_start> <int_end> <int_step>";
	private static final String EXPLANATION = "Calculation using numbers: ";
	private static final String RESULT = "Number after transformation: ";

	public static void main(String[] args) {

		if (args.length != 3) {
			System.out.println(WRONG_ARGS_AMOUNT);
			return;
		}
		double start = 0;
		double end = 0;
		double step = 0;
		TreeMap<Double, Double> funcMap = null;

		try {
			start = Double.parseDouble(args[0]);
			end = Double.parseDouble(args[1]);
			step = Double.parseDouble(args[2]);
		} catch (NumberFormatException e) {
			System.out.println(NOT_INT_ARG);
			return;
		}

		funcMap = createFunctionMap(start, end, step);
		printMap(funcMap);
	}

	private static TreeMap<Double, Double> createFunctionMap(double start, double end, double step) {
		TreeMap<Double, Double> funcMap = new TreeMap<>();
		for (double i = start; i <= end; i += step) {
			System.out.println(i + "v");
			double funcValue = (Math.pow(Math.sin(i), 2)) - Math.cos(i * 2);
			funcMap.put(i, funcValue);
		}
		return funcMap;
	}

	private static void printMap(TreeMap<Double, Double> map) {
		System.out.println(map.size());
		if (map.size() > 0) {
			System.out.println("**********************************************");
			for (Entry<Double, Double> entry : map.entrySet()) {
				System.out.printf("**  %10f" + "   **   % .16f" + "   **\n", entry.getKey(), entry.getValue());
			}
			System.out.println("**********************************************");
		}
	}
}
