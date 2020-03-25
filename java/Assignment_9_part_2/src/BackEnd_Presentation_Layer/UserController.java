package BackEnd_Presentation_Layer;

import BackEnd_Business_Layer.IUserService;
import BackEnd_Business_Layer.UserService;
import BackEnd_Data_Layer.IUserDao;
import BackEnd_Data_Layer.UserDao;
import Entity.User;

public class UserController {

	IUserService UserService = new UserService() ;
	IUserDao Dao = new UserDao();

	/**
	 * This method is validateAccount
	 *
	 * @Description
	 * @author: LQ Huy
	 * @create_date: Mar 25, 2020
	 * @version: 1.0
	 * @modifer: 
	 * @modifer_date:
	 */
	boolean validateAccount(String Account) {
		return true;

	}

	/**
	 * This method is validateFirstName
	 *
	 * @Description
	 * @author: LQ Huy
	 * @create_date: Mar 25, 2020
	 * @version: 1.0
	 * @modifer: 
	 * @modifer_date:
	 */
	boolean validateFirstName(String First_name) {
		return true;

	}

	/**
	 * This method is validateLastName
	 *
	 * @Description
	 * @author: LQ Huy
	 * @create_date: Mar 25, 2020
	 * @version: 1.0
	 * @modifer: 
	 * @modifer_date:
	 */
	boolean validateLastName(String Last_name) {
		return true;

	}

	/**
	 * This method is validateEmail
	 *
	 * @Description
	 * @author: LQ Huy
	 * @create_date: Mar 25, 2020
	 * @version: 1.0
	 * @modifer: 
	 * @modifer_date:
	 */
	boolean validateEmail(String email) {
		return true;

	}

	
	
	/**
	 * This method is validate information input
	 *
	 * @Description
	 * @author: LQ Huy
	 * @create_date: Mar 25, 2020
	 * @version: 1.0
	 * @modifer: 
	 * @modifer_date:
	 */
	public User GetUser(String Account, String First_name, String Last_name, String Email) throws Exception {
		UserController validate = new UserController();
		if (!validate.validateAccount(Account)) {
			System.out.println("Error: error Input Account");
		}

		if (!validate.validateFirstName(First_name)) {
			System.out.println("Error: error Input First_name");
		}

		if (!validate.validateLastName(Last_name)) {
			System.out.println("Error: error Input Last_name");

		}

		if (!validate.validateLastName(Email)) {
			System.out.println("Error: error Input Last_name");

		}
		if ((!validate.validateAccount(Account)) || (!validate.validateFirstName(First_name))
				|| (!validate.validateLastName(Last_name)) || (!validate.validateLastName(Email))) {
			throw new Exception("Please input again: ");
		}

		User user = UserService.GetUser(Account, First_name, Last_name, Email);
		return user;

	}

	
	/**
	 * This method is update information database and print it
	 *
	 * @Description
	 * @author: LQ Huy
	 * @create_date: Mar 25, 2020
	 * @version: 1.0
	 * @modifer: 
	 * @modifer_date:
	 */
	public boolean UpdateInformationDatabase(int Case, User user)  {
		boolean result = UserService.UpdateInformationDatabase(Case, user);
		if (result) {
			System.out.println("\nUpdate informaton database successful!!");
			System.out.println("Database after update: \n");
			Dao.in();

		} else {
			System.out.println("Update informaton database failed!!");
		}

		return result;
	}

	/**
	 * This method is insert information database and print it
	 *
	 * @Description
	 * @author: LQ Huy
	 * @create_date: Mar 25, 2020
	 * @version: 1.0
	 * @modifer: 
	 * @modifer_date:
	 */
	
	
	public boolean InsertInformartionDatabase(User user) {

		boolean result = UserService.InsertInformartionDatabase(user);
		
		if (result) {
			System.out.println("\nInsert informaton database successful!!");
			System.out.println("Database after insert: \n");
			Dao.in();

		} else {
			System.out.println("Insert informaton database failed!!");
		}

		
		return result;

	}

}
