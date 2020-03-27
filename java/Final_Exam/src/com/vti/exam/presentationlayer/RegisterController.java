package com.vti.exam.presentationlayer;

import java.sql.SQLException;

import com.vti.exam.businesslayers.IRegisterService;
import com.vti.exam.businesslayers.RegisterService;
import com.vti.exam.form.RegisterEmployeesForms;
import com.vti.exam.form.RegisterManagersForms;

import Validate.ValidateFields;
import Validate.ValidateFunction;

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
public class RegisterController {

	private ValidateFunction ValidateFuction;
	private IRegisterService RegisterService;
	private ValidateFields ValidateFields;

	/**
	 * 
	 * 
	 */
	public RegisterController() {

		ValidateFuction = new ValidateFunction();
		RegisterService = new RegisterService();
		ValidateFields = new ValidateFields();
	}

	/**
	 * This method is Register of Managers validate fields
	 *
	 * @Description
	 * @author: LQ Huy
	 * @create_date: Mar 27, 2020
	 * @version: 1.0
	 * @throws Exception 
	 * @modifer: LQ Huy
	 * @modifer_date: Mar 27, 2020
	 */
	public boolean RegisterManagers(String First_name, String Last_name, String Email, String Phone, String Password,
			int ExpInYear) throws Exception {
		Phone = ValidateFields.handlingPhone(Phone);
		if (ValidateFuction.ValidateRegisterManagerss(Email, Password, Phone, ExpInYear)) {
			RegisterManagersForms ipmanagers = new RegisterManagersForms(First_name, Last_name, Phone, Email, Password,
					ExpInYear);
			boolean result = RegisterService.RegisterManagers(ipmanagers);
			return result;
		}

		return false;

	}

	/**
	 * This method is Register of Employees validate fields
	 *
	 * @Description
	 * @author: LQ Huy
	 * @create_date: Mar 27, 2020
	 * @version: 1.0
	 * @throws Exception 
	 * @modifer: LQ Huy
	 * @modifer_date: Mar 27, 2020
	 */
	public boolean RegisterEmployees(String First_name, String Last_name, String Email, String Phone, String Password,
			String ProjectName, String ProSkill) throws Exception {

		Phone = ValidateFields.handlingPhone(Phone);
		if (ValidateFuction.ValidateRegisterEmployees(Email, Password, Phone, ProSkill, ProjectName)) {
			RegisterEmployeesForms ipemployees = new RegisterEmployeesForms(First_name, Last_name, Phone, Email,
					Password, ProjectName, ProSkill);
			boolean result = RegisterService.RegisterEmployees(ipemployees);
			return result;
		}
		return false;

	}

}
