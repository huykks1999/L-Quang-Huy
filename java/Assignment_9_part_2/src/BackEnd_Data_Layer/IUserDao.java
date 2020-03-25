package BackEnd_Data_Layer;

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
public interface IUserDao {
	boolean UpdateInformationDatabase(int Case, User user);

	boolean InsertInformartionDatabase(User user);

	void in();
}
