package bean_lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {

	private String name;
	private String roll_no;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(String roll_no) {
		this.roll_no = roll_no;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll_no=" + roll_no + "]";
	}
	@PostConstruct
	public void init() throws Exception{
		System.out.println("Bean is going through init process..");
	}
	@PreDestroy
	public void destroy() throws Exception{
		System.out.println("Bean is destroyed");
	}
}
