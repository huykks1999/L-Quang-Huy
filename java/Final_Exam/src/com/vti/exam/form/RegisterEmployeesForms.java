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
public class RegisterEmployeesForms {
	String First_name;
	String Last_name;
	String Phone;
	String Email;
	String Password;
	String ProjectName;
	String ProSkill;

	/**
	 * 
	 */
	public RegisterEmployeesForms() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructer
	 * @param: 
	 */
	public RegisterEmployeesForms(String first_name, String last_name, String phone, String email,String Password, String projectName,
			String proSkill) {
		this.First_name = first_name;
		this.Last_name = last_name;
		this.Email = email;
		this.Phone = phone;
		this.Password = Password;
		this.ProjectName = projectName;
		this.ProSkill = proSkill;
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
	 * @return the Last_name
	 */
	public String getLast_name() {
		return Last_name;
	}

	/**
	 * @param Last_name the Last_name to set
	 */
	public void setLast_name(String last_name) {
		this.Last_name = last_name;
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
	 * @return the ProjectName
	 */
	public String getProjectName() {
		return ProjectName;
	}

	/**
	 * @param ProjectName the ProjectName to set
	 */
	public void setProjectName(String projectName) {
		this.ProjectName = projectName;
	}

	/**
	 * @return the ProSkill
	 */
	public String getProSkill() {
		return ProSkill;
	}

	/**
	 * @param ProSkill the ProSkill to set
	 */
	public void setProSkill(String proSkill) {
		this.ProSkill = proSkill;
	}

	/**
	 * @return the Password
	 */
	public String getPassword() {
		return Password;
	}

	/**
	 * @param Password the Password to set
	 */
	public void setPassword(String password) {
		this.Password = password;
	}

}
