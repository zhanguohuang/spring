package autowired;

public class BaseBean implements IBaseBean {

	@Override
	public void test() {
		System.out.println(this.getClass().getName() + " : " 
				+ new Exception().getStackTrace()[0].getMethodName());
	}
}
