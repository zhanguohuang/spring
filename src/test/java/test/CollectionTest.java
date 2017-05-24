package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionTest {

	private static final String[] classPath = {"aop/aop.xml", "autowired/autowired.xml", "aware/aware.xml", 
			"component/component.xml", "cycledepend/cycledepend.xml", "factory/beanFactory.xml", 
			"listener/listener.xml", "lookup/lookupTest.xml", "postprocess/postprocess.xml"};
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext(classPath);
		String[] beanNames = app.getBeanDefinitionNames();
		System.out.println("-=-=-=-=-show all beanName-=-=-=-=-");
		for(String beanName : beanNames) {
			System.out.println(beanName);
		}
		app.close();
	}
}
