
public class TeachingStaff extends Staff {
	public String qualification ;
	public String designation;
	
	public TeachingStaff() {
		super();
		qualification = "" ;
		designation = "";
	}
	
	public TeachingStaff(Integer id, String first_name, String last_name, String date_of_birth, String gender, String contact_no,String Department,String qualification,String designation, float Salary) {
		super(id,first_name,last_name,date_of_birth,gender,contact_no,Department,Salary );
		this. qualification = qualification;
		this.designation = designation;
	}

}
