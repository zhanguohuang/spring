package test.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import listener.TestEvent;

public class ListenerMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("listener/listener.xml");
		TestEvent event = new TestEvent("hello", "msg");
		context.publishEvent(event);
	}

}
