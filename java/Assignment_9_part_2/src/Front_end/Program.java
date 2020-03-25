package Front_end;

import java.util.Scanner;

import BackEnd_Presentation_Layer.UserController;
import Entity.User;
import Template.ScannerUtil;

/**
 * This class is main program
 *
 * @Description
 * @author: LQ Huy
 * @create_date: Mar 25, 2020
 * @version: 1.0
 * @modifer: LQ Huy
 * @modifer_date:Mar 25, 2020
 */
public class Program {

	
	
	public static void main(String[] args)  {
		String Account;

		String First_name;

		String Last_name;

		String Email;

		UserController UserController = new UserController();
		Scanner sc = new Scanner(System.in);

		// input information of user
		User user = null;
		while (true) {
			User.CreateUser();
			boolean check1;
			do {
				check1 = false;
				System.out.println("\n\nPlease input your information:: ");
				System.out.print("Account: ");
				Account = ScannerUtil.readString(sc, "");
				System.out.print("First name: ");
				First_name = ScannerUtil.readString(sc, "");
				System.out.print("Last name: ");
				Last_name = ScannerUtil.readString(sc, "");
				System.out.print("Email: ");
				Email = ScannerUtil.readString(sc, "");

				// validate information input

				try {

					user = UserController.GetUser(Account, First_name, Last_name, Email);
				} catch (Exception e) {
					System.out.println(e.getMessage());
					check1 = true;
				}
			} while (check1);

			int checkLap = 1;
			
			//Program to change database information
			
			do {
				checkLap = 1;
				
				
				// in case information of user not in database
				
				if (User.getUsers().contains(user)) {
					int i = User.getUsers().indexOf(user);

					int check3 = 1;
					do {
						User.CreateUser();
						user = User.getUsers().get(i);
						check3 = 1;
						int check2 = 1;
						do {
							check2 = 1;
							System.out.println("What do you want to edit: ");
							System.out.println("1. Account: ");
							System.out.println("2. First_name: ");
							System.out.println("3. Last_name: ");
							System.out.println("4. Email: ");
							int Case = ScannerUtil.readInt(sc, "Information must is integer, please input again: ");
							UserController.UpdateInformationDatabase(Case, user);
							if (Case != 1 && Case != 2 && Case != 3 && Case != 4) {
								System.out.println("Error: Integer must in 1->4, please input again");
								check2 = 0;
							}

						} while (check2 == 0);
						int check = 1;
						do {
							check = 1;
							System.out.println("\nAre you want to continue edit information: ");
							System.out.println("1.Yes");
							System.out.println("2.No");
							int decide = ScannerUtil.readInt(sc, "Error input: it must be integer");

							switch (decide) {
							case 1:
								System.out.println("Ok, please input what you want to edit: ");
								check3 = 0;
								break;
							case 2:
								System.out.println("Goodbye");
								break;

							default:
								System.out.println("Error input: integer must is 1 or 2, please input again");
								check = 0;
							}

						} while (check == 0);
					} while (check3 == 0);

				}

				// in case user not in database
				if (!User.getUsers().contains(user)) {
					int checkSua = 1;
					int check11 = 1;
					do {
						check11 = 1;
						System.out.println("User not exists, are you want to add it to database?");
						System.out.println("1.Yes");
						System.out.println("2.No");
						int Case = ScannerUtil.readInt(sc, "Error input: it must be integer");
						switch (Case) {
						case 1:
							User.getUsers().add(user);
							UserController.InsertInformartionDatabase(user);
							break;

						case 2:
							System.out.println("Ok, goodbye");
							checkSua = 0;
							break;
						default:
							System.out.println("Integer must is 1 or 2, please input again!");
							check11 = 0;
						}
					} while (check11 == 0);
					int check12 = 1;
					if (checkSua == 1) {
						do {
							check12 = 1;
							System.out.println("\nAre you want to continue edit information: ");
							System.out.println("1.Yes");
							System.out.println("2.No");
							int decide = ScannerUtil.readInt(sc, "Error input: it must be integer");

							switch (decide) {
							case 1:
								checkLap = 0;
								break;
							case 2:
								System.out.println("Goodbye");
								break;

							default:
								System.out.println("Error input: integer must is 1 or 2, please input again");
								check12 = 0;
							}

						} while (check12 == 0);
					}
				}
			} while (checkLap == 0);
		}

	}

}
