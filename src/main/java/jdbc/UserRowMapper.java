package jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper {

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		User person = new User(rs.getInt("id"), rs.getString("name"), 
				rs.getInt("age"), rs.getString("sex"));
		return person;
	}

}
