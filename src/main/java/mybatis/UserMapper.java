package mybatis;

/**
 * @description mybatis dao
 */
public interface UserMapper {

	public void insertUser(User user);
	
	public User getUser(Integer id);
	
}
