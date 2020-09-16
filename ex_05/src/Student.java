
public class Student extends User{
	public String course;
	public String year;
	
	public Student() {
		super();
		course = "";
		year = "";
	}
	
	public Student(Integer id, String first_name, String last_name, String date_of_birth, String gender, String contact_no , String course, String year) {
		super(id,first_name,last_name,date_of_birth,gender,contact_no );
		this.course = course;
		this.year = year;

	}
}
