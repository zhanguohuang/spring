package springmvc;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author zgh
 * @description 自定义listener
 */
public class MyDataContextListener implements ServletContextListener {

	private ServletContext context = null;
	
	public MyDataContextListener() {
		
	}
	
	@Override
	public void contextInitialized(ServletContextEvent event) {
		this.context = event.getServletContext();
		//可以将自己的逻辑记录在属性中
		this.context.setAttribute("myData", "this is myData");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		this.context = null;
	}

}
