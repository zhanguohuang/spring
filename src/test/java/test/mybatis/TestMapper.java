package test.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import mybatis.User;
import mybatis.UserMapper;

public class TestMapper {

	static SqlSessionFactory sqlSessionFactory = null;
	
	static {
		sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
	}
	
	@Test
	public void testAdd() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			User user = new User("tom", new Integer(5));
			userMapper.insertUser(user);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}
	
	@Test
	public void getUser() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			User user = userMapper.getUser(1);
			System.out.println("name: " + user.getName() + "; age: " + user.getAge());
		} finally {
			sqlSession.close();
		}
	}
}
