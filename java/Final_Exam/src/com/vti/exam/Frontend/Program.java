package com.vti.exam.Frontend;

import java.util.Scanner;

import com.vti.exam.function.Function;
import com.vti.exam.utils.ScannerUtil;

/**
 * This class is
 *
 * @Description
 * @author: LQ Huy
 * @create_date: Mar 25, 2020
 * @version: 1.0
 * @modifer: LQ Huy
 * @modifer_date:Mar 25, 2020
 */
public class Program {

	/**
	 * This method is font end
	 *
	 * @Description
	 * @author: LQ Huy
	 * @create_date: Mar 25, 2020
	 * @version: 1.0
	 * @modifer:
	 * @modifer_date:
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Function function = new Function();
		while (true) {
			System.out.println("\nWelcome!!");
			System.out.println("Please choose the function: ");
			System.out.println("1. Login: ");
			System.out.println("2. Register: ");

			int x = ScannerUtil.readInt(sc);
			switch (x) {
			case 1:
				function.login();
				break;

			case 2:

				function.register();
				break;

			default:
			}

		}
	}

}
