package com.vti.exam.businesslayers;

import java.sql.SQLException;

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
public interface ILoginService {
	/**
	 * This method is Login Service
	 *
	 * @Description
	 * @author: LQ Huy
	 * @create_date: Mar 27, 2020
	 * @version: 1.0
	 * @throws SQLException 
	 * @modifer: LQ Huy
	 * @modifer_date: Mar 27, 2020
	 */
	boolean login(LoginForms iplogin) throws SQLException;

}
