package BackEnd_Business_Layer;

import BackEnd_Data_Layer.IUserDao;
import BackEnd_Data_Layer.UserDao;
import Entity.User;

public class UserService implements IUserService {

	IUserDao UserDao = new UserDao();

	/**
	 * This method is returns the user corresponding to the function
	 *
	 * @Description
	 * @author: LQ Huy
	 * @create_date: Mar 25, 2020
	 * @version: 1.0
	 * @throws Exception 
	 * @modifer: 
	 * @modifer_date:
	 */
	@Override
	public User GetUser(String Account, String First_name, String Last_name, String Email) throws Exception {

		for (int i = 0; i < User.getUsers().size(); i++) {
			User users = User.getUsers().get(i);
			if (users.getAccount().equals(Account) && users.getFirst_name().equals(First_name)
					&& users.getLast_name().equals(Last_name) && users.getEmail().equals(Email)) {
				System.out.println("Welcome " + users.getFirst_name() + " " + users.getLast_name()
						);

				return users;

			}
		}

		for (int i = 0; i < User.getUsers().size(); i++) {
			User users = User.getUsers().get(i);
			if (users.getAccount().equals(Account)) {
				throw new Exception("Error:Information not exacly and account is duplicate!!!, please input again");
			}
		}

		User users = new User(Account, First_name, Last_name, Email);

		return users;
	}

	/**
	 * This method is Update Information Database
	 *
	 * @Description
	 * @author: LQ Huy
	 * @create_date: Mar 25, 2020
	 * @version: 1.0
	 * @modifer: 
	 * @modifer_date:
	 */
	@Override
	public boolean UpdateInformationDatabase(int Case, User user)  {
		boolean result = UserDao.UpdateInformationDatabase(Case, user);

		return result;

	}

	/**
	 * This method is Insert Informartion Database
	 *
	 * @Description
	 * @author: LQ Huy
	 * @create_date: Mar 25, 2020
	 * @version: 1.0
	 * @modifer: 
	 * @modifer_date:
	 */
	@Override
	public boolean InsertInformartionDatabase(User user) {

		boolean result = UserDao.InsertInformartionDatabase(user);

		return result;

	}
}
