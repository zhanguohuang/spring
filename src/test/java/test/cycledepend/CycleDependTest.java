package test.cycledepend;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class CycleDependTest {

	public static void main(String[] args) {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("cycledepend/cycledepend.xml"));
		bf.getBean("testA");
	}
}
