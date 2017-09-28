package Person;

public class Student extends Person {
	
	private String school;
	private String schoolName;
	
	
	public Student(String name, int age, String nationality) {
		super(name, age, nationality);
		// TODO Auto-generated constructor stub
	}


	public Student(String name, int age, String nationality, String school,
			String schoolName) {
		super(name, age, nationality);
		this.school = school;
		this.schoolName = schoolName;
	}


	public String getSchool() {
		return school;
	}


	public void setSchool(String school) {
		this.school = school;
	}


	public String getSchoolName() {
		return schoolName;
	}


	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
		
	

}
