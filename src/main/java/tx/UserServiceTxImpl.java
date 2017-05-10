package tx;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.User;

public class UserServiceTxImpl implements UserServiceTx {

	private JdbcTemplate jdbcTemplate;
	
	//property name="dataSource" 会调用此方法
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public void save(User user) throws Exception {
		// TODO Auto-generated method stub
		jdbcTemplate.update("insert into user(name, age, sex) values(?,?,?)", 
				new Object[] {user.getName(), user.getAge(), user.getSex()}, 
				new int[] {java.sql.Types.VARCHAR, java.sql.Types.INTEGER, java.sql.Types.VARCHAR});
		//test tx spring只对RuntimeException进行回滚
		throw new RuntimeException("error");
	}

}
