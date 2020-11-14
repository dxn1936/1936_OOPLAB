package exercise12_B;

public class Student {
	private Integer rollNo;
	private String studentName;
	private String Address;
	
	public Student() {			//constructor
		this.rollNo =-1;
		this.studentName ="";
		this.Address = "";
	}
	
	public Student(Integer rollNo, String studentName, String address) {		//constructor
		this.rollNo = rollNo;
		this.studentName = studentName;
		this.Address = address;
	}

	
	public Integer getRollNo() {
		return rollNo;
	}

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
}
