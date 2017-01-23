package listener;

import org.springframework.context.ApplicationEvent;

/**
 * 定义了一个事件
 * @author Administrator
 *
 */
public class TestEvent extends ApplicationEvent {

	public String msg;
	
	public TestEvent(Object source, String msg) {
		super(source);
		this.msg = msg;
	}
	
	public void print() {
		System.out.println(msg);
	}
}
