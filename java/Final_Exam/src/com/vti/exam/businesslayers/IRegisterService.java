package com.vti.exam.businesslayers;

import java.sql.SQLException;

import com.vti.exam.form.RegisterEmployeesForms;
import com.vti.exam.form.RegisterManagersForms;

/**
 * This class is
 *
 * @Description
 * @author: LQ Huy
 * @create_date: Mar 27, 2020
 * @version: 1.0
 * @modifer: LQ Huy
 * @modifer_date:Mar 27, 2020
 */
public interface IRegisterService {
	/**
	 * This method is Register of managers 
	 *
	 * @Description
	 * @author: LQ Huy
	 * @create_date: Mar 27, 2020
	 * @version: 1.0
	 * @throws SQLException 
	 * @throws Exception 
	 * @modifer: LQ Huy
	 * @modifer_date: Mar 27, 2020
	 */
	public boolean RegisterManagers(RegisterManagersForms ipmanagers) throws Exception;
	
	
	/**
	 * This method is register of employees
	 *
	 * @Description
	 * @author: LQ Huy
	 * @create_date: Mar 27, 2020
	 * @version: 1.0
	 * @throws SQLException 
	 * @throws Exception 
	 * @modifer: LQ Huy
	 * @modifer_date: Mar 27, 2020
	 */
	public boolean RegisterEmployees(RegisterEmployeesForms ipemployees) throws Exception ;
}
