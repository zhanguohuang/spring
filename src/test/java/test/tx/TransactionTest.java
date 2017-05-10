package test.tx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jdbc.User;
import tx.UserServiceTx;

public class TransactionTest {

	public static void main(String[] args) throws Exception {
		ApplicationContext act = new ClassPathXmlApplicationContext("transaction/transaction.xml");
		UserServiceTx service = (UserServiceTx) act.getBean("userServiceTx");
		User user = new User();
		user.setName("张三ccc");
		user.setAge(20);
		user.setSex("男");
		service.save(user);
	}
}
