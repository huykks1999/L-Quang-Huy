import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class thu {

	public static void main(String[] args) {
		String Fields = "Account";
		String resultFields = "vl100";
		String point = "Account";
		String resultPoint = "vl01";

		System.out.println("\n" + Fields);
		System.out.println(resultFields);
		System.out.println(point);
		System.out.println(resultPoint + "\n");

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

			myPreStmt = myConn.prepareStatement("update Information set Account = ? Where Account = ?");
			myStmt.executeUpdate("update Information set " + Fields + " ='" + resultFields + "' Where " + point + " = '"
					+ resultPoint + "'");
			// myPreStmt.setString(1, Fields);
			myPreStmt.setString(1, resultFields);
			// myPreStmt.setString(3, point);
			myPreStmt.setString(2, resultPoint);

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
