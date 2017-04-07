package test.springmybatis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mybatis.UserMapper;

public class UserServiceTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis/spring-mybatis.xml");
		UserMapper userDao = (UserMapper) context.getBean("userMapper");
		System.out.println(userDao.getUser(1));
	}
}
