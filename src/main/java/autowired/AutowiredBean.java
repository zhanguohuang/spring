package autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class AutowiredBean {

	@Autowired
	private IBaseBean baseBean;
	
	public void invodeBase() {
		baseBean.test();
	}
}
