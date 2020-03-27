package com.vti.exam.form;

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
public class RegisterManagersForms {
	private String First_name;
	private String last_name;
	private String Phone;
	private String Email;
	private String Password;
	private int ExpInYear;
	
	/**
	 * 
	 */
	public RegisterManagersForms() {
		// TODO Auto-generated constructor stub
	}
	
	public RegisterManagersForms(String first_name, String last_name, String phone, String email,String password, int ExpInYear) {
		this.First_name = first_name;
		this.last_name = last_name;
		this.Email = email;
		this.Phone = phone;
		this.Password = password;
		this.ExpInYear = ExpInYear;
	}
	
	/**
	 * @return the First_name
	 */
	public String getFirst_name() {
		return First_name;
	}
	/**
	 * @param First_name the First_name to set
	 */
	public void setFirst_name(String first_name) {
		this.First_name = first_name;
	}
	/**
	 * @return the last_name
	 */
	public String getLast_name() {
		return last_name;
	}
	/**
	 * @param last_name the last_name to set
	 */
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	/**
	 * @return the Phone
	 */
	public String getPhone() {
		return Phone;
	}
	/**
	 * @param Phone the Phone to set
	 */
	public void setPhone(String phone) {
		this.Phone = phone;
	}
	/**
	 * @return the Email
	 */
	public String getEmail() {
		return Email;
	}
	/**
	 * @param Email the Email to set
	 */
	public void setEmail(String email) {
		this.Email = email;
	}
	/**
	 * @return the expInYear
	 */
	public int getExpInYear() {
		return ExpInYear;
	}
	/**
	 * @param expInYear the expInYear to set
	 */
	public void setExpInYear(int expInYear) {
		ExpInYear = expInYear;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return Password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		Password = password;
	}
	
}
