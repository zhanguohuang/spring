package jdbc;

/**
 * create table 'user' (
 * 'id' int(11) not null auto_increment,
 * 'name' varchar(255) default null,
 * 'age' int(11) default null,
 * 'sex' varchar(255) default null,
 * primary key('id')
 * ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
 *
 */
public class User {

	private int id;
	private String name;
	private int age;
	private String sex;
	
	public User() {}
	
	public User(int id, String name, int age, String sex) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
}
