package test.component;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import component.ComponentBean;

public class ComponentTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext act = new ClassPathXmlApplicationContext("component/component.xml");
		ComponentBean service = (ComponentBean) act.getBean("componentBean");
		service.service();
	}
}
