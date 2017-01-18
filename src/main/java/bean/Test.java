package bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

import bean.Hello;

public class Test implements BeanFactoryAware {

	private BeanFactory beanFactory;
	
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}
	
	public void testAware() {
		Hello hello = (Hello) beanFactory.getBean("hello");
		hello.say();
	}
}
