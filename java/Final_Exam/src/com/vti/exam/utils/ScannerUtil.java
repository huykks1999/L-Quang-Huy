package com.vti.exam.utils;

import java.util.Scanner;

/**
 * This class is enter input from Trainee
 * 
 * @author NNDuy
 * @version 1.0
 * @Date Oct 06, 2019
 */

public class ScannerUtil {

	/**
	 * This method is enter input Integer.
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: Dec 6, 2019
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: Dec 6, 2019
	 * @param scanner - use Scanner to enter
	 * @param errorMessage - Error Message
	 * @return int - it is a number from user input
	 */
	public static int readInt(Scanner scanner) {
		while (true) {
			try {
				return Integer.parseInt(scanner.nextLine());
			} catch (Exception e) {
				showError(Constants.ERROR_VALIDATE_INT);
			}
		}
	}

	/**
	 * This method is enter input float.
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: Dec 6, 2019
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: Dec 6, 2019
	 * @param scanner - use Scanner to enter
	 * @param errorMessage - Error Message
	 * @return double - it is a number from user input
	 */
	public static double readDouble(Scanner scanner) {
		while (true) {
			try {
				return Double.parseDouble(scanner.nextLine());
			} catch (Exception e) {
				showError(Constants.ERROR_VALIDATE_DOUBLE);
			}
		}
	}

	/**
	 * This method is enter input float.
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: Dec 6, 2019
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: Dec 6, 2019
	 * @param scanner - use Scanner to enter
	 * @param errorMessage - Error Message
	 * @return float - it is a number from user input
	 */
	public static float readFloat(Scanner scanner) {
		while (true) {
			try {
				return Float.parseFloat(scanner.nextLine());
			} catch (Exception e) {
				showError(Constants.ERROR_VALIDATE_FLOAT);
			}
		}
	}

	/**
	 * This method is enter input String.
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: Dec 6, 2019
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: Dec 6, 2019
	 * @param scanner - use Scanner to enter
	 * @param errorMessage - Error Message
	 * @return String - it is a number from user input
	 */
	public static String readString(Scanner scanner) {
		while (true) {
			
				String result = scanner.nextLine().trim();
				if (result != null & !result.isEmpty()) {
					return result;
				}
		
		}
	}

	/**
	 * This method show error message when validating.
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: Dec 24, 2019
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: Dec 24, 2019
	 * @param message - Error message
	 */
	private static void showError(String message) {
		System.out.println("Error: " + message);
	}

}
