package Validate;

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
public class ValidateFunction {
	private ValidateFields ValidateFields;

	/**
	 * 
	 */
	public ValidateFunction() {
		ValidateFields = new ValidateFields();

	}

	/**
	 * This method is form of validate for login function
	 *
	 * @Description
	 * @author: LQ Huy
	 * @create_date: Mar 27, 2020
	 * @version: 1.0
	 * @modifer: LQ Huy
	 * @modifer_date: Mar 27, 2020
	 */
	public boolean ValidateLogin(String Email, String Password) {
		if (!ValidateFields.ValidateEmail(Email)) {
			return false;
		}

		return true;

	}

	/**
	 * This method is form of validate for register of employees function  
	 *
	 * @Description
	 * @author: LQ Huy
	 * @create_date: Mar 27, 2020
	 * @version: 1.0
	 * @modifer: LQ Huy
	 * @modifer_date: Mar 27, 2020
	 */
	public boolean ValidateRegisterEmployees(String Email, String Password, String Phone, String ProSkill,
			String ProjectName) {
		boolean check = true;
		if (!ValidateFields.ValidateEmail(Email)) {
			check = false;
		}

		if (!ValidateFields.ValidatePhone(Phone)) {
			check = false;
		}

		if (!ValidateFields.ValidateProjectName(ProjectName)) {
			check = false;
		}

		return check;

	}

	/**
	 * This method is form of validate for register of managers function  
	 *
	 * @Description
	 * @author: LQ Huy
	 * @create_date: Mar 27, 2020
	 * @version: 1.0
	 * @modifer: LQ Huy
	 * @modifer_date: Mar 27, 2020
	 */
	public boolean ValidateRegisterManagerss(String Email, String Password, String Phone, int ExpInYear) {
		boolean check = true;
		if (!ValidateFields.ValidateEmail(Email)) {
			check = false;
		}

		if (!ValidateFields.ValidatePhone(Phone)) {
			check = false;
		}

		if (!ValidateFields.ValidateExpInYear(ExpInYear)) {
			check = false;
		}

		return check;

	}

}
