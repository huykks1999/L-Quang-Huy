package com.vti.exam.datalayer;

import java.sql.SQLException;

import com.vti.exam.form.LoginForms;
import com.vti.exam.form.RegisterEmployeesForms;
import com.vti.exam.form.RegisterManagersForms;

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
public interface IDao {
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
	 */
	int CheckLogin(LoginForms iplogin) throws SQLException;
	
	
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
	 */
	public int CheckRegisterManagers(RegisterManagersForms ipmanagers) throws SQLException ;
	
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
	 */
	public int CheckRegisterEmployees(RegisterEmployeesForms ipemployees) throws SQLException;
	
	
	
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
	 */
	public int CheckEmail(String Email) throws SQLException;

}
