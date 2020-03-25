package Entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class User {

	
	private String Account;
	private String First_name;
	private String Last_name;
	private String Email;
	private static List<User> users = new ArrayList<>();

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String Account, String First_name, String Last_name, String Email) {
		this.Account = Account;
		this.Email = Email;
		this.First_name = First_name;
		this.Last_name = Last_name;
	}

	public String getAccount() {
		return Account;
	}

	public void setAccount(String account) {
		Account = account;
	}

	public String getFirst_name() {
		return First_name;
	}

	public void setFirst_name(String first_name) {
		First_name = first_name;
	}

	public String getLast_name() {
		return Last_name;
	}

	public void setLast_name(String last_name) {
		Last_name = last_name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
	

	public static List<User> getUsers() {
		return users;
	}

	public static void setUsers(List<User> users) {
		User.users = users;
	}


	public static void CreateUser() {

		users.clear();
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		java.sql.PreparedStatement myPreStmt = null;

		String dbUrl = "jdbc:mysql://localhost:3306/Trainees?useSSL=false";
		String user = "root";
		String pass = "liverpool123";
		// in();

		try {
			myConn = DriverManager.getConnection(dbUrl, user, pass);
			myStmt = myConn.createStatement();
			myRs = myStmt.executeQuery("select * from information");

			while (myRs.next()) {
				User.users.add(new User(myRs.getString("Account"), myRs.getString("first_name"),
						myRs.getString("last_name"), myRs.getString("email")));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


}
