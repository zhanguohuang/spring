package aop;

public class TestBean {

	private String testStr = "testStr";

	public String getTestStr() {
		return testStr;
	}

	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}
	
	/**
	 * @description 此方法中可能封装着某些核心业务
	 */
	public void test() {
		System.out.println("test");
	}

}
