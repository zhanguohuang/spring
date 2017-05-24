package test.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.TestBean;

public class AOPMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aop/aop.xml");
		TestBean bean = (TestBean) ctx.getBean("testBean");
		bean.test();
	}

}
