package BackEnd_Business_Layer;

import Entity.User;

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
public interface IUserService {
	User GetUser(String Account, String First_name, String Last_name, String Email) throws Exception;
	boolean UpdateInformationDatabase(int Case, User user);
	boolean InsertInformartionDatabase(User user);
}
