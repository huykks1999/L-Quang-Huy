package com.vti.exam.businesslayers;

import com.vti.exam.datalayer.IDao;

import java.sql.SQLException;

import com.vti.exam.datalayer.Dao;
import com.vti.exam.form.LoginForms;

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
public class LoginService implements ILoginService {
	
	private IDao IUserDao;
	
	/**
	 * 
	 */
	public LoginService() {
		IUserDao = new Dao();
	}
	
	/**
	 * This method is login service
	 *
	 * @Description
	 * @author: LQ Huy
	 * @create_date: Mar 27, 2020
	 * @version: 1.0
	 * @throws SQLException 
	 * @modifer: LQ Huy
	 * @modifer_date: Mar 27, 2020
	 *@see com.vti.exam.businesslayers.ILoginService#login(com.vti.exam.form.LoginForms)
	 */
	@Override
	public boolean login(LoginForms iplogin) throws SQLException{
		int i = IUserDao.CheckLogin(iplogin);
		if(i==1) {
			return true;
		}else {
			System.out.println("Email or password not exacly!!");
		}
		
		return false;
		
	}

}
