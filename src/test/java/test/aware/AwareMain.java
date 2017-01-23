package test.aware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Test;

/**
 * 自动装载BeanFactory等接口
 * @author Administrator
 *
 */
public class AwareMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aware/aware.xml");
		Test test = (Test) ctx.getBean("test");
		test.testAware();
	}

}
