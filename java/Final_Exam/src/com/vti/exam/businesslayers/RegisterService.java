package com.vti.exam.businesslayers;

import java.sql.SQLException;

import com.vti.exam.datalayer.*;
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
public class RegisterService implements IRegisterService {

	private IDao Dao;

	/**
	 * 
	 */
	public RegisterService() {
		Dao = new Dao();
	}

	/**
	 * This method is Register of managers Controller and check email exists
	 *
	 * @Description
	 * @author: LQ Huy
	 * @create_date: Mar 27, 2020
	 * @version: 1.0
	 * @throws SQLException 
	 * @modifer: LQ Huy
	 * @modifer_date: Mar 27, 2020
	 *@see com.vti.exam.businesslayers.IRegisterService#RegisterManagers(com.vti.exam.form.RegisterManagersForms)
	 */
	@Override
	public boolean RegisterManagers(RegisterManagersForms ipmanagers) throws Exception {
		int y = Dao.CheckEmail(ipmanagers.getEmail());
		if (y == 1) {
			System.out.println("Error: Email had exist!!");
			return false;
		}
		int i = Dao.CheckRegisterManagers(ipmanagers);
		if (i == 1) {
			return true;
		}
		return false;

	}

	/**
	 * This method is Register of employees Controller and check email exists
	 *
	 * @Description
	 * @author: LQ Huy
	 * @create_date: Mar 27, 2020
	 * @version: 1.0
	 * @throws SQLException 
	 * @modifer: LQ Huy
	 * @modifer_date: Mar 27, 2020
	 *@see com.vti.exam.businesslayers.IRegisterService#RegisterEmployees(com.vti.exam.form.RegisterEmployeesForms)
	 */
	@Override
	public boolean RegisterEmployees(RegisterEmployeesForms ipemployees) throws Exception {
		int y = Dao.CheckEmail(ipemployees.getEmail());
		if (y == 1) {
			System.out.println("Error: Email had exist!!");
			return false;
		}
		int i = Dao.CheckRegisterEmployees(ipemployees);
		if (i == 1) {
			return true;
		}
		return false;

	}

}
