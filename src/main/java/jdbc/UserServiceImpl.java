package jdbc;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserServiceImpl implements UserService{

	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public void save(User user) {
		jdbcTemplate.update("insert into user(name, age, sex) values(?, ?, ?)", 
				new Object[] {user.getName(), user.getAge(), user.getSex()}, 
				new int[] {java.sql.Types.VARCHAR, java.sql.Types.INTEGER, java.sql.Types.VARCHAR});
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getUsers() {
		List<User> list = jdbcTemplate.query("select * from user where age = ?", new Object[] {20}, 
				new int[]{java.sql.Types.INTEGER}, new UserRowMapper());
		return list;
	}

}
