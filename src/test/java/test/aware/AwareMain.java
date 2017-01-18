package test.aware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Test;

public class AwareMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aware.xml");
		Test test = (Test) ctx.getBean("test");
		test.testAware();
	}

}
