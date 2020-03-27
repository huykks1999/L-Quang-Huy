package Validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
public class ValidateFields {

	/**
	 * This method is
	 *
	 * @Description
	 * @author: LQ Huy
	 * @create_date: Mar 26, 2020
	 * @version: 1.0
	 * @modifer: LQ Huy
	 * @modifer_date: Mar 26, 2020
	 */

	/**
	 * This method is validate phone input
	 *
	 * @Description
	 * @author: LQ Huy
	 * @create_date: Mar 27, 2020
	 * @version: 1.0
	 * @modifer: LQ Huy
	 * @modifer_date: Mar 27, 2020
	 */
	public boolean ValidatePhone(String Phone) {

		int size = Phone.length();
		Pattern pattern = Pattern.compile("^[0-9]*$");
		Matcher matcher = pattern.matcher(Phone);
		if (!matcher.matches()) {
			System.out.println("Error: Phone number must have only number!! ");
			return false;
		}

		if (size < 9 || size > 12) {
			System.out.println("Phone number must hava 9-12 number");
			return false;

		}

		return true;

	}

	/**
	 * This method is validate email input
	 *
	 * @Description
	 * @author: LQ Huy
	 * @create_date: Mar 27, 2020
	 * @version: 1.0
	 * @modifer: LQ Huy
	 * @modifer_date: Mar 27, 2020
	 */
	public boolean ValidateEmail(String Email) {

		if (!Pattern
				.compile(
						"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")
				.matcher(Email).matches()) {
			System.out.println("Enter incorrect email format");
			return false;
		}

		return true;

	}

	/**
	 * This method is validate ExpInYear input
	 *
	 * @Description
	 * @author: LQ Huy
	 * @create_date: Mar 27, 2020
	 * @version: 1.0
	 * @modifer: LQ Huy
	 * @modifer_date: Mar 27, 2020
	 */
	public boolean ValidateExpInYear(int expInYear) {
		if (expInYear < 0 || expInYear > 20) {
			System.out.println("Error: ExpInYear must is 0 -> 20 ");
			return false;
		}
		return true;

	}

	/**
	 * This method is validate project name input
	 *
	 * @Description
	 * @author: LQ Huy
	 * @create_date: Mar 27, 2020
	 * @version: 1.0
	 * @modifer: LQ Huy
	 * @modifer_date: Mar 27, 2020
	 */
	public boolean ValidateProjectName(String ProjectName) {
		return true;

	}


	/**
	 * This method is handling Phone number(delete space)
	 *
	 * @Description
	 * @author: LQ Huy
	 * @create_date: Mar 27, 2020
	 * @version: 1.0
	 * @modifer: LQ Huy
	 * @modifer_date: Mar 27, 2020
	 */
	public String handlingPhone(String phone) {

		while (phone.indexOf("  ") != -1) {

			phone = phone.replaceAll(" ", "");
			System.out.println(phone);

		}
		return phone;

	}

}
