package dependency_injection;

public class Student {
	private String studentName;
	private int id;
	
	//Setter injection 
//	public void setId(int id) {
//		this.id = id;
//	}
//	
//	public void setStudentName(String studentName) {
//		this.studentName = studentName;
//	}
	
	//constructor injection
	public Student(String studentName, int id) {
		this.studentName = studentName;
		this.id = id;
	}
	
	public void displayStudentInfo() {
		System.out.println("Student name is: "+studentName+" and id is "+id);
	}

	
}
