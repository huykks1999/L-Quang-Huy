import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

	static List<Trainees> trainees = new ArrayList<>();

	static void in() {

		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		java.sql.PreparedStatement myPreStmt = null;

		String dbUrl = "jdbc:mysql://localhost:3306/trainees?useSSL=false";
		String user = "root";
		String pass = "liverpool123";

		try {
			myConn = DriverManager.getConnection(dbUrl, user, pass);
			myStmt = myConn.createStatement();

			myRs = myStmt.executeQuery("select * from information");
			while (myRs.next()) {
				System.out.println(
						myRs.getInt("id") + " | " + myRs.getString("Account") + " | " + myRs.getString("first_name")
								+ " , " + myRs.getString("last_name") + " , " + myRs.getString("email"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	static void UpdateSet(String Fields, String resultFields, String point, String resultPoint) {

		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		java.sql.PreparedStatement myPreStmt = null;

		String dbUrl = "jdbc:mysql://localhost:3306/trainees?useSSL=false";
		String user = "root";
		String pass = "liverpool123";

		try {
			myConn = DriverManager.getConnection(dbUrl, user, pass);
			myStmt = myConn.createStatement();

			myStmt.executeUpdate("update Information set " + Fields + " ='" + resultFields + "' Where " + point + " = '"
					+ resultPoint + "'");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	static void AddNewInformation() {

		trainees.clear();
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		java.sql.PreparedStatement myPreStmt = null;

		String dbUrl = "jdbc:mysql://localhost:3306/trainees?useSSL=false";
		String user = "root";
		String pass = "liverpool123";
		// in();

		try {
			myConn = DriverManager.getConnection(dbUrl, user, pass);
			myStmt = myConn.createStatement();
			myRs = myStmt.executeQuery("select * from information");

			while (myRs.next()) {
				trainees.add(new Trainees(myRs.getString("Account"), myRs.getString("first_name"),
						myRs.getString("last_name"), myRs.getString("email")));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static void UpdateInsert(String Account, String first_name, String last_name, String email) {
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		java.sql.PreparedStatement myPreStmt = null;

		String dbUrl = "jdbc:mysql://localhost:3306/trainees?useSSL=false";
		String user = "root";
		String pass = "liverpool123";

		try {
			myConn = DriverManager.getConnection(dbUrl, user, pass);
			myStmt = myConn.createStatement();

			myStmt.executeUpdate(
					"insert into information(Account, first_name,last_name, email) values(" + "'" + Account + "'" + ","
							+ "'" + first_name + "'" + "," + "'" + last_name + "'" + "," + "'" + email + "'" + ") ");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		// List<Trainees> trainees = new ArrayList<>();

		String Account;
		String First_name = null;
		String Last_name = null;
		String Email = null;
		Scanner sc = new Scanner(System.in);
		String Fields;

		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		java.sql.PreparedStatement myPreStmt = null;

		String dbUrl = "jdbc:mysql://localhost:3306/trainees?useSSL=false";
		String user = "root";
		String pass = "liverpool123";
		// in();

		try {
			myConn = DriverManager.getConnection(dbUrl, user, pass);
			myStmt = myConn.createStatement();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		AddNewInformation();
		int CheckNhap = 1;
		System.out.println("Mời bạn nhập vào thông tin : ");
		do {
			CheckNhap = 1;

			System.out.print("Account: ");
			Account = sc.nextLine();
			if (Account.equals("")) {
				System.out.println("Account không được để trống, xin mời nhập lại thông tin: ");
				CheckNhap = 0;
				continue;

			}
			System.out.print("First_name: ");
			First_name = sc.nextLine();
			if (First_name.equals("")) {
				System.out.println("First_name không được để trống, xin mời nhập lại thông tin: ");
				CheckNhap = 0;
				continue;

			}
			System.out.print("Last_name: ");
			Last_name = sc.nextLine();
			if (Last_name.equals("")) {
				System.out.println("Last_name không được để trống, xin mời nhập lại thông tin: ");
				CheckNhap = 0;
				continue;

			}
			System.out.print("Email: ");
			Email = sc.nextLine();
			if (Email.equals("")) {
				System.out.println("Email không được để trống, xin mời nhập lại thông tin: ");
				CheckNhap = 0;
				continue;

			}
		} while (CheckNhap == 0);
		int CheckLon = 1;
		int checkThoat = 1;
		do {
			CheckLon = 1;
			for (int i = 0; i < trainees.size(); i++) {
				Trainees trainees2 = trainees.get(i);

				if (trainees2.Account.equals(Account) && trainees2.First_name.equals(First_name)
						&& trainees2.Last_name.equals(Last_name) && trainees2.Email.equals(Email)) {
					checkThoat = 0;
					System.out.println("Xin chào " + trainees2.First_name + " " + trainees2.Last_name);

					System.out.print("Bạn có muốn sửa thông tin nào không? yes/no ");
					int checkDo1 = 1;
					do {
						checkDo1 = 1;
						String check = sc.nextLine();

						if (check.equals("yes") || check.equals("Yes")) {

							System.out.print("Nhập trường bạn muốn sửa(Account / First name / Last name / Email): ");
							int checkDo2 = 1;
							do {
								trainees2 = trainees.get(i);
								Fields = sc.nextLine();
								checkDo2 = 1;

								if (Fields.equals("Account") || Fields.equals("account")) {
									int CheckSua = 1;
									System.out.print("Bạn muốn sửa \"" + trainees2.Account + "\" thành: ");
									String setValueAccount = null;
									int checkDo3 = 1;
									do {

										checkDo3 = 1;
										setValueAccount = sc.nextLine();

										// check xem có bị null hay không:
										if (setValueAccount.equals("")) {
											checkDo3 = 0;
										}

										// check xem account có phải mới hay không
										if (trainees2.Account.equals(setValueAccount)) {

											System.out.print(
													"Đây vẫn là Account cũ của bạn, bạn có muốn nhập lại? yes/no ");
											int checkDo4;
											do {
												checkDo4 = 1;
												String checkAccount = sc.nextLine();
												if (checkAccount.equals("yes") || checkAccount.equals("Yes")) {
													System.out.print(
															"Bạn muốn sửa \"" + trainees2.Account + "\" thành: ");
													checkDo3 = 0;
												} else if (checkAccount.equals("no") || checkAccount.equals("No")) {
													System.out
															.print("Bạn có muốn sửa thông tin nào nữa không? yes/no ");
													CheckSua = 0;
													checkDo1 = 0;
												} else {
													System.out.print(
															"Bạn đã nhập sai, xin mời bạn nhập lại quết định: yes/no ");
													checkDo4 = 0;
												}
											} while (checkDo4 == 0);
										}

										// check xem account mới này có bị trùng với cái cũ hay không
										for (Trainees trainees3 : trainees) {

											if (trainees3.Account.equals(setValueAccount) && trainees3 != trainees2) {
												System.out.println("Account của bạn đã bị trùng, xin mời nhập lại: ");
												System.out.print("Bạn muốn sửa \"" + trainees2.Account + "\" thành: ");
												checkDo3 = 0;
											}
										}

									} while (checkDo3 == 0);
									if (CheckSua == 1) {
										UpdateSet("Account", setValueAccount, "Account", trainees2.Account);
										AddNewInformation();

										// hỏi xem tiếp tục ko
										System.out.print(
												"Đã sửa thông tin thành công, bạn có muốn tiếp tục sửa không? yes/no ");
									}
									int checkDo5;
									do {
										checkDo5 = 1;

										String checkNext = sc.nextLine();
										if (checkNext.equals("yes") || checkNext.equals("Yes")) {
											System.out.print(
													"Nhập tên trường bạn muốn sửa(Account / First name / Last name / Email): ");
											checkDo2 = 0;
										} else if (checkNext.equals("no") || checkNext.equals("No")) {
											// checkDo2 = 1;
											// checkDo1 = 1;
											// break;

										} else {
											System.out
													.print("Bạn đã nhập sai, xin mời bạn nhập lại quyết định: yes/no ");
											checkDo5 = 0;
										}
									} while (checkDo5 == 0);

								} else if (Fields.equals("First_name") || Fields.equals("first name")
										|| Fields.equals("first_name") || Fields.equals("First name")) {
									int checkSua = 1;

									System.out.print("Bạn muốn sửa \"" + trainees2.First_name + "\" thành: ");
									String SetValueFirstName = null;
									int checkDo31 = 1;
									do {
										checkDo31 = 1;
										SetValueFirstName = sc.nextLine();

										// check sao cho khác null
										if (SetValueFirstName.equals("")) {
											checkDo31 = 0;
										}

										// check nếu cái ng dùng nhập vào giống với cái cũ
										if (trainees2.First_name.equals(SetValueFirstName)) {

											System.out.print(
													"Đây vẫn là First_name cũ của bạn, bạn có muốn nhập lại? yes/no ");
											int checkDo41 = 1;
											do {
												checkDo41 = 1;
												String checkAccount = sc.nextLine();
												if (checkAccount.equals("yes") || checkAccount.equals("Yes")) {
													System.out.print(
															"Bạn muốn sửa \"" + trainees2.First_name + "\" thành: ");
													checkDo31 = 0;
												} else if (checkAccount.equals("no") || checkAccount.equals("No")) {
													System.out
															.print("Bạn có muốn sửa thông tin nào nữa không? yes/no ");
													checkSua = 0;
													checkDo1 = 0;
												} else {
													System.out.print(
															"Bạn đã nhập sai, xin mời bạn nhập lại quết định: yes/no ");
													checkDo41 = 0;
												}
											} while (checkDo41 == 0);
										}
									} while (checkDo31 == 0);
									if (checkSua == 1) {
										UpdateSet("First_name", SetValueFirstName, "Account", trainees2.Account);
										AddNewInformation();

										System.out.print(
												"Đã sửa thông tin thành công, bạn có muốn tiếp tục sửa không? yes/no ");
									}
									int checkDo51;
									do {
										checkDo51 = 1;

										String checkNext = sc.nextLine();
										if (checkNext.equals("yes") || checkNext.equals("Yes")) {
											System.out.print(
													"Nhập tên trường bạn muốn sửa(Account / First name / Last name / Email): ");
											checkDo2 = 0;
										} else if (checkNext.equals("no") || checkNext.equals("No")) {
											checkDo2 = 1;
											checkDo1 = 1;
											break;

										} else {
											System.out
													.print("Bạn đã nhập sai, xin mời bạn nhập lại quyết định: yes/no");
											checkDo51 = 0;
										}
									} while (checkDo51 == 0);

								} else if (Fields.equals("Last_name") || Fields.equals("last name")
										|| Fields.equals("last_name") || Fields.equals("Last name")) {

									int checkSua = 1;

									System.out.print("Bạn muốn sửa \"" + trainees2.Last_name + "\" thành: ");
									String SetValueLastName = null;
									int checkDo32 = 1;
									do {
										checkDo32 = 1;
										SetValueLastName = sc.nextLine();

										// check sao cho khác null
										if (SetValueLastName.equals("")) {
											checkDo32 = 0;
										}

										// check nếu cái nguoi dùng nhập vào giống với cái cũ
										if (trainees2.Last_name.equals(SetValueLastName)) {

											System.out.print(
													"Đây vẫn là Last_name cũ của bạn, bạn có muốn nhập lại? yes/no ");
											int checkDo42 = 1;
											do {
												checkDo42 = 1;
												String checkLastName = sc.nextLine();
												if (checkLastName.equals("yes") || checkLastName.equals("Yes")) {
													System.out.print(
															"Bạn muốn sửa \"" + trainees2.Last_name + "\" thành: ");
													checkDo32 = 0;
												} else if (checkLastName.equals("no") || checkLastName.equals("No")) {
													System.out
															.print("Bạn có muốn sửa thông tin nào nữa không? yes/no ");
													checkSua = 0;
													checkDo1 = 0;
												} else {
													System.out.print(
															"Bạn đã nhập sai, xin mời bạn nhập lại quyết định: yes/no ");
													checkDo42 = 0;
												}
											} while (checkDo42 == 0);
										}
									} while (checkDo32 == 0);
									if (checkSua == 1) {
										UpdateSet("Last_name", SetValueLastName, "Account", trainees2.Account);
										AddNewInformation();

										System.out.print(
												"Đã sửa thông tin thành công, bạn có muốn tiếp tục sửa không? yes/no ");
									}
									int checkDo52;
									do {
										checkDo52 = 1;

										String checkNext = sc.nextLine();
										if (checkNext.equals("yes") || checkNext.equals("Yes")) {
											System.out.print(
													"Nhập tên trường bạn muốn sửa(Account / First name / Last name / email): ");
											checkDo2 = 0;
										} else if (checkNext.equals("no") || checkNext.equals("No")) {
											checkDo2 = 1;
											checkDo1 = 1;
											break;

										} else {
											System.out
													.print("Bạn đã nhập sai, xin mời bạn nhập lại quyết định: yes/no ");
											checkDo52 = 0;
										}
									} while (checkDo52 == 0);

								} else if (Fields.equals("email") || Fields.equals("Email")) {

									int checkSua = 1;

									System.out.print("Bạn muốn sửa \"" + trainees2.Email + "\" thành: ");
									String SetValueEmail = null;
									int checkDo33 = 1;
									do {
										checkDo33 = 1;
										SetValueEmail = sc.nextLine();

										// check sao cho khác null
										if (SetValueEmail.equals("")) {
											checkDo33 = 0;
										}

										// check nếu cái nguoi dùng nhập vào giống với cái cũ
										if (trainees2.Email.equals(SetValueEmail)) {

											System.out.print(
													"Đây vẫn là Email cũ của bạn, bạn có muốn nhập lại? yes/no ");
											int checkDo43 = 1;
											do {
												checkDo43 = 1;
												String checkEmail = sc.nextLine();
												if (checkEmail.equals("yes") || checkEmail.equals("Yes")) {
													System.out
															.print("Bạn muốn sửa \"" + trainees2.Email + "\" thành: ");
													checkDo33 = 0;
												} else if (checkEmail.equals("no") || checkEmail.equals("No")) {
													System.out
															.print("Bạn có muốn sửa thông tin nào nữa không? yes/no ");
													checkSua = 0;
													checkDo1 = 0;
												} else {
													System.out.print(
															"Bạn đã nhập sai, xin mời bạn nhập lại quyết định: yes/no ");
													checkDo43 = 0;
												}
											} while (checkDo43 == 0);
										}
									} while (checkDo33 == 0);
									if (checkSua == 1) {
										UpdateSet("Email", SetValueEmail, "Account", trainees2.Account);
										AddNewInformation();

										System.out.print(
												"Đã sửa thông tin thành công, bạn có muốn tiếp tục sửa không? yes/no ");
									}
									int checkDo53;
									do {
										checkDo53 = 1;

										String checkNext = sc.nextLine();
										if (checkNext.equals("yes") || checkNext.equals("Yes")) {
											System.out.print("Nhập tên trường bạn muốn sửa: ");
											checkDo2 = 0;
										} else if (checkNext.equals("no") || checkNext.equals("No")) {
											checkDo2 = 1;
											checkDo1 = 1;
											break;

										} else {
											System.out
													.print("Bạn đã nhập sai, xin mời bạn nhập lại quyết định: yes/no ");
											checkDo53 = 0;
										}
									} while (checkDo53 == 0);

								} else {
									System.out.print("Bạn đã nhập sai, xin mời nhập lại tên trường: ");
									checkDo2 = 0;
								}
							} while (checkDo2 == 0);
						} else if (check.equals("no") || check.equals("No")) {

						} else {
							System.out.println("Bạn đã nhập sai, xin mời nhập lại: ");
							System.out.print("Bạn có muốn sửa thông tin nào không? yes/no:");
							checkDo1 = 0;
						}
					} while (checkDo1 == 0);
				}

			}

			if (checkThoat == 0) {
				continue;
			}

			System.out.print("Tài khoản của bạn chưa có trong database, hãy kiểm "
					+ "tra lại và cho biết bạn có muốn thêm thông tin mới vào danh sách không:yes/no: ");
			int check = 1;
			do {
				check = 1;
				String decide = sc.nextLine();
				if (decide.equals("yes") || decide.equals("Yes")) {

					UpdateInsert(Account, First_name, Last_name, Email);
					System.out.println("\nĐã thêm phành công thông tin của bạn vào cơ sở dữ liệu : \n");
					AddNewInformation();
					CheckLon = 0;

				} else if (decide.equals("no") || decide.equals("No")) {
					CheckLon = 1;
				} else {
					System.out.print("Bạn đã nhập sai, mời bạn nhập lại quyết định: (yes/no) ");
					check = 0;
				}

			} while (check == 0);

		} while (CheckLon == 0);

		System.out.println("\nTạm biệt ,sau đây là danh sách cuối cùng: \n");
		in();
	}

}
