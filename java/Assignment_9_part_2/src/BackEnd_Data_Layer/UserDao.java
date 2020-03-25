package BackEnd_Data_Layer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import Entity.User;
import Template.ScannerUtil;

public class UserDao implements IUserDao{

	public static Object Dao;

	/**
	 * This method is Update Information in Database
	 *
	 * @Description
	 * @author: LQ Huy
	 * @create_date: Mar 25, 2020
	 * @version: 1.0
	 * @modifer: 
	 * @modifer_date:
	 */
	@Override
	public boolean UpdateInformationDatabase(int Case, User user) {

		String Fields = null;
		String resultFields = null;
		String point = "Account";
		String resultPoint = user.getAccount();
		Scanner sc = new Scanner(System.in);

		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		java.sql.PreparedStatement myPreStmt = null;

		String dbUrl = "jdbc:mysql://localhost:3306/trainees?useSSL=false";
		String user1 = "root";
		String pass = "liverpool123";

		try {
			switch (Case) {
			case 1:
				Fields = "Account";

				System.out.print("Bạn muốn sửa Account " + user.getAccount() + " thành:");
				int check = 1;
				do {
					check = 1;
				resultFields = ScannerUtil.readString(sc, "");
				
				
				for (int i = 0; i < User.getUsers().size(); i++) {
					User users = User.getUsers().get(i);
					if (users.getAccount().equals(resultFields)) {
						System.out.println("Error: account is duplicate!!!, please input again");
						check = 0;
					}
				}
				
				}while(check == 0);
				
				break;

			case 2:
				Fields = "first_name";

				System.out.print("Bạn muốn sửa First_name " + user.getFirst_name() + " thành:");
				resultFields = ScannerUtil.readString(sc, "");
				break;

			case 3:
				Fields = "last_name";

				System.out.print("Bạn muốn sửa Last_name " + user.getLast_name() + " thành:");
				resultFields = ScannerUtil.readString(sc, "");
				break;

			case 4:
				Fields = "email";

				System.out.print("Bạn muốn sửa Email " + user.getEmail() + " thành:");
				resultFields = ScannerUtil.readString(sc, "");
				break;
			}

			myConn = DriverManager.getConnection(dbUrl, user1, pass);
			myStmt = myConn.createStatement();

			myStmt.executeUpdate("update Information set " + Fields + " ='" + resultFields + "' Where " + point + " = '"
					+ resultPoint + "'");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// in();

		return true;

	}

	/**
	 * This method is Insert Informartion Database
	 *
	 * @Description
	 * @author: LQ Huy
	 * @create_date: Mar 25, 2020
	 * @version: 1.0
	 * @modifer: 
	 * @modifer_date:
	 */
	@Override
	public boolean InsertInformartionDatabase(User user) {

		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		java.sql.PreparedStatement myPreStmt = null;

		String Account = user.getAccount();
		String first_name = user.getFirst_name();
		String last_name = user.getLast_name();
		String email = user.getEmail();

		String dbUrl = "jdbc:mysql://localhost:3306/trainees?useSSL=false";
		String user1 = "root";
		String pass = "liverpool123";

		try {
			myConn = DriverManager.getConnection(dbUrl, user1, pass);
			myStmt = myConn.createStatement();

			myStmt.executeUpdate(
					"insert into information(Account, first_name,last_name, email) values(" + "'" + Account + "'" + ","
							+ "'" + first_name + "'" + "," + "'" + last_name + "'" + "," + "'" + email + "'" + ") ");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return true;

	}

	/**
	 * This method is print table in database
	 *
	 * @Description
	 * @author: LQ Huy
	 * @create_date: Mar 25, 2020
	 * @version: 1.0
	 * @modifer: 
	 * @modifer_date:
	 */
	@Override
	public void in() {

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
}