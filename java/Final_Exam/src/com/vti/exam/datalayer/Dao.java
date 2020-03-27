package com.vti.exam.datalayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.vti.exam.form.LoginForms;
import com.vti.exam.form.RegisterEmployeesForms;
import com.vti.exam.form.RegisterManagersForms;
import com.vti.exam.utils.Constants;

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
public class Dao implements IDao {

	/**
	 * This method is check for login
	 *
	 * @Description
	 * @author: LQ Huy
	 * @create_date: Mar 27, 2020
	 * @version: 1.0
	 * @throws SQLException 
	 * @modifer: LQ Huy
	 * @modifer_date: Mar 27, 2020
	 *@see com.vti.exam.datalayer.IDao#CheckLogin(com.vti.exam.form.LoginForms)
	 */
	@Override
	public int CheckLogin(LoginForms iplogin) throws SQLException {

		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		PreparedStatement myPreStmt = null;
		int i = 0;

		try {
			myConn = DriverManager.getConnection(Constants.CONNECTION_STRING, Constants.DATABASE_USERNAME,
					Constants.DATABASE_PASSWORD);
			myStmt = myConn.createStatement();

			myPreStmt = myConn.prepareStatement("select * from Managers where email = ? and password = ?");
			myPreStmt.setString(1, iplogin.getEmail());
			myPreStmt.setString(2, iplogin.getPassword());
			myRs = myPreStmt.executeQuery();
			while (myRs.next()) {
				i++;
			}
			myPreStmt = myConn.prepareStatement("select * from employees where email = ? and password = ?");
			myPreStmt.setString(1, iplogin.getEmail());
			myPreStmt.setString(2, iplogin.getPassword());
			myRs = myPreStmt.executeQuery();
			while (myRs.next()) {
				i++;
			}
			return i;

		} catch (SQLException e) {
			System.out.println("Error in query database!!");
			System.out.println(e);
		}finally {
			myConn.close();
			myPreStmt.close();
			myRs.close();
			myStmt.close();
		}

		return 0;

	}

	/**
	 * This method is check for register of managers
	 *
	 * @Description
	 * @author: LQ Huy
	 * @create_date: Mar 27, 2020
	 * @version: 1.0
	 * @throws SQLException 
	 * @modifer: LQ Huy
	 * @modifer_date: Mar 27, 2020
	 *@see com.vti.exam.datalayer.IDao#CheckRegisterManagers(com.vti.exam.form.RegisterManagersForms)
	 */
	@Override
	public int CheckRegisterManagers(RegisterManagersForms ipmanagers) throws SQLException {

		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		PreparedStatement myPreStmt = null;
		int i = 0;

		try {
			myConn = DriverManager.getConnection(Constants.CONNECTION_STRING, Constants.DATABASE_USERNAME,
					Constants.DATABASE_PASSWORD);
			myStmt = myConn.createStatement();

			myPreStmt = myConn.prepareStatement(
					"INSERT INTO Managers  (Email, Password,FirstName, LastName, Phone,ExpInYear ) values(?,?,?,?,?,?) ");
			myPreStmt.setString(1, ipmanagers.getEmail());
			myPreStmt.setString(2, ipmanagers.getPassword());
			myPreStmt.setString(3, ipmanagers.getFirst_name());
			myPreStmt.setString(4, ipmanagers.getLast_name());
			myPreStmt.setString(5, ipmanagers.getPhone());
			myPreStmt.setInt(6, ipmanagers.getExpInYear());
			i = myPreStmt.executeUpdate();
			return i;

		} catch (SQLException e) {
			System.out.println("Error in query database!!");
			System.out.println(e);
		}finally {
			myConn.close();
			myPreStmt.close();
			myRs.close();
			myStmt.close();
		}

		return 0;

	}

	/**
	 * This method is check for register of employees
	 *
	 * @Description
	 * @author: LQ Huy
	 * @create_date: Mar 27, 2020
	 * @version: 1.0
	 * @throws SQLException 
	 * @modifer: LQ Huy
	 * @modifer_date: Mar 27, 2020
	 *@see com.vti.exam.datalayer.IDao#CheckRegisterEmployees(com.vti.exam.form.RegisterEmployeesForms)
	 */
	@Override
	public int CheckRegisterEmployees(RegisterEmployeesForms ipemployees) throws SQLException {
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		PreparedStatement myPreStmt = null;
		int i = 0;

		try {
			myConn = DriverManager.getConnection(Constants.CONNECTION_STRING, Constants.DATABASE_USERNAME,
					Constants.DATABASE_PASSWORD);
			myStmt = myConn.createStatement();

			myPreStmt = myConn.prepareStatement(
					"INSERT INTO Employees  (Email, Password,FirstName, LastName, Phone,proskills, projectname ) values(?,?,?,?,?,?,?) ");
			myPreStmt.setString(1, ipemployees.getEmail());
			myPreStmt.setString(2, ipemployees.getPassword());
			myPreStmt.setString(3, ipemployees.getFirst_name());
			myPreStmt.setString(4, ipemployees.getLast_name());
			myPreStmt.setString(5, ipemployees.getPhone());
			myPreStmt.setString(6, ipemployees.getProSkill());
			myPreStmt.setString(7, ipemployees.getProjectName());

			i = myPreStmt.executeUpdate();
			return i;

		} catch (SQLException e) {
			System.out.println("Error in query database!!");
			System.out.println(e);
		}finally {
			myConn.close();
			myPreStmt.close();
			myRs.close();
			myStmt.close();
		}


		return 0;

	}

	/**
	 * This method is check email of register exists or no
	 *
	 * @Description
	 * @author: LQ Huy
	 * @create_date: Mar 27, 2020
	 * @version: 1.0
	 * @throws SQLException 
	 * @modifer: LQ Huy
	 * @modifer_date: Mar 27, 2020
	 *@see com.vti.exam.datalayer.IDao#CheckEmail(java.lang.String)
	 */
	@Override
	public int CheckEmail(String Email) throws SQLException {
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		PreparedStatement myPreStmt = null;
		int i = 0;

		try {
			myConn = DriverManager.getConnection(Constants.CONNECTION_STRING, Constants.DATABASE_USERNAME,
					Constants.DATABASE_PASSWORD);
			myStmt = myConn.createStatement();

			myPreStmt = myConn.prepareStatement("select * from managers where email = ?");
			myPreStmt.setString(1, Email);
			myRs = myPreStmt.executeQuery();
			while (myRs.next()) {
				i++;
			}

			myPreStmt = myConn.prepareStatement("select * from employees where email = ?");
			myPreStmt.setString(1, Email);
			myRs = myPreStmt.executeQuery();
			while (myRs.next()) {
				i++;
			}
			return i;
		} catch (SQLException e) {
			System.out.println("Error in query database!!");
			System.out.println(e);
		}finally {
			myConn.close();
			myPreStmt.close();
			myRs.close();
			myStmt.close();
		}
		return 0;

	}

}
