package com.vti.exam.function;

import java.util.Scanner;

import com.vti.exam.form.LoginForms;
import com.vti.exam.presentationlayer.LoginController;
import com.vti.exam.presentationlayer.RegisterController;
import com.vti.exam.utils.Constants;
import com.vti.exam.utils.ScannerUtil;

/**
 * This class is
 *
 * @Description
 * @author: LQ Huy
 * @create_date: Mar 26, 2020
 * @version: 1.0
 * @modifer: LQ Huy
 * @modifer_date:Mar 26, 2020
 */
public class Function {
	private LoginController LoginController;
	private RegisterController RegisterController;

	/**
	* 
	*/
	public Function() {
		LoginController = new LoginController();
		RegisterController = new RegisterController();
	}

	/**
	 * This method is login function
	 *
	 * @Description
	 * @author: LQ Huy
	 * @create_date: Mar 27, 2020
	 * @version: 1.0
	 * @modifer: LQ Huy
	 * @modifer_date: Mar 27, 2020
	 */
	public void login() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input for login: ");
		System.out.print("1. Email: ");
		String Email = ScannerUtil.readString(scanner);
		System.out.print("2. Password:");
		String Password = ScannerUtil.readString(scanner);

		boolean result = false;
		try {
			result = LoginController.login(Email, Password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (result) {
			System.out.println("Login Sucessful!!!");
		} else {
			System.out.println("Login Failer!!!");
		}

	}

	/**
	 * This method is register function
	 *
	 * @Description
	 * @author: LQ Huy
	 * @create_date: Mar 27, 2020
	 * @version: 1.0
	 * @modifer: LQ Huy
	 * @modifer_date: Mar 27, 2020
	 */
	public void register() {
		Scanner scanner = new Scanner(System.in);
		boolean result = false;
		System.out.println("Please input for register: ");
		System.out.print("1. First name: ");
		String First_name = ScannerUtil.readString(scanner);
		System.out.print("2. Last name: ");
		String Last_name = ScannerUtil.readString(scanner);
		System.out.print("3. Email: ");
		String Email = ScannerUtil.readString(scanner);
		System.out.print("4. Phone: ");
		String Phone = ScannerUtil.readString(scanner);
		System.out.print("5. Password: ");
		String Password = ScannerUtil.readString(scanner);
		boolean x = true;
		do {
			x = true;
			System.out.println("6. Position: ");
			System.out.println("1. Manager");
			System.out.println("2. Employee");
			int y = ScannerUtil.readInt(scanner);
			switch (y) {
			case 1:
				System.out.print("7. ExpInYear: ");
				int ExpInYear = ScannerUtil.readInt(scanner);
				try {
					result = RegisterController.RegisterManagers(First_name, Last_name, Email, Phone, Password,
							ExpInYear);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				x = false;
				break;
			case 2:
				System.out.println("7. ProSkill: ");
				String ProSkill = ScannerUtil.readString(scanner);
				System.out.println("8. ProjectName");
				boolean t = true;
				do {
					t = true;
					System.out.println("1.Testing System: ");
					System.out.println("2.CRM");
					System.out.println("3.TimeSheet");
					int z = ScannerUtil.readInt(scanner);
					switch (z) {
					case 1:
						try {
							result = RegisterController.RegisterEmployees(First_name, Last_name, Email, Phone, Password,
									"Testing System", ProSkill);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						t = false;
						break;
					case 2:
						try {
							result = RegisterController.RegisterEmployees(First_name, Last_name, Email, Phone, Password,
									"CRM", ProSkill);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						t = false;
						break;
					case 3:
						try {
							result = RegisterController.RegisterEmployees(First_name, Last_name, Email, Phone, Password,
									"TimeSheet", ProSkill);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						t = false;
						break;

					default:
						System.out.println("Yout must input 1,2 or 3, please input again: ");

					}

				} while (t);

				x = false;
				break;
			default:
				System.out.println("Error: you must input 1 or 2, please input again: ");
			}

		} while (x);

		if (result) {
			System.out.println("Register sucessfull, your information can use to login!! ");
		} else {
			System.out.println("Register Failed!!");
		}

	}

}
