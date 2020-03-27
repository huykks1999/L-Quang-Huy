package com.vti.exam.presentationlayer;

import java.sql.SQLException;

import com.vti.exam.businesslayers.*;
import com.vti.exam.form.LoginForms;

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
public class LoginController {

	private ValidateFunction ValidateFunction;

	private ILoginService LoginService;

	/**
	 * 
	 */
	public LoginController() {
		ValidateFunction = new ValidateFunction();
		LoginService = new LoginService();
	}

	/**
	 * This method is login controller
	 *
	 * @Description
	 * @author: LQ Huy
	 * @create_date: Mar 27, 2020
	 * @version: 1.0
	 * @throws Exception 
	 * @modifer: LQ Huy
	 * @modifer_date: Mar 27, 2020
	 */
	public boolean login(String Email, String Password) throws Exception {
		if(ValidateFunction.ValidateLogin(Email, Password)) {
			LoginForms iplogin =  new LoginForms(Email, Password);
			boolean result = LoginService.login(iplogin);
			return result;
		}
		return false;

	}
}
