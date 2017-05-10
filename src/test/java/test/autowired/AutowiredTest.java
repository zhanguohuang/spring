package test.autowired;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import autowired.AutowiredBean;

public class AutowiredTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("autowired/autowired.xml");
		AutowiredBean bean = (AutowiredBean) ctx.getBean("autowiredBean");
		bean.invodeBase();
	}
}
