package test.factory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import factory.Car;

public class FactoryBeanTest {

	public static void main(String[] args) {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("factory/beanFactory.xml"));
		Object factoryBean = bf.getBean("&car");
		Car car = (Car) bf.getBean("car");
		System.out.println(car.getBrand());
	}
}
