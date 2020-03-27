package com.vti.exam.utils;

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
public class Constants {

	
	// MySQL
		public static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/QuanLy?autoReconnect=true&useSSL=false&characterEncoding=latin1&relaxAutoCommit=true";
		public static final String DRIVER_SQL_NAME = "com.mysql.cj.jdbc.Driver";
		public static final String DATABASE_USERNAME = "root";
		public static final String DATABASE_PASSWORD = "liverpool123";

		// declare message for connect database
		public static final String ERROR_CONNECT_DATABASE_STR = "Error! connect database.";
		public static final String ERROR_DISCONNECT_DATABASE_STR = "Error! disconnect database.";
		public static final int ERROR_CONNECT_DATABASE_INT = -1;
		public static final int ERROR_SQL_EXCEPTION_INT = -2;
		public static final String ERROR_DRIVER_NAME = "Error! driver name.";
		public static final String SUCCESS = "Success!";
		public static final String ERROR = "Error";

		// scanner
		public static final String ERROR_VALIDATE_INT = "Invalid value, Please input interger: ";
		public static final String ERROR_VALIDATE_FLOAT = "Invalid value, Please input float: ";
		public static final String ERROR_VALIDATE_DOUBLE = "Invalid value, Please input double: ";
		public static final String ERROR_VALIDATE_STRING = "Invalid value, Please input string: ";

		// validate by regular expression
		public static final String PATTERN_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		public static final String PATTERN_PASSWORD = "^(?=.*[a-z])(?=.*[A-Z])[a-zA-Z\\d]{6,12}$";
		public static final String PATTERN_STRING = "[A-z0-9]{1,}";
		public static final String PATTERN_PHONE = "^[0-9]{9,12}$";

		// candidate type
		public static final int CANDIDATE_FRESHER_TYPE = 0;
		public static final int CANDIDATE_EXPERIENCE_TYPE = 1;

}
