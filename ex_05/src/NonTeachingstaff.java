
public class NonTeachingstaff extends Staff{
public String Post;
	
	public NonTeachingstaff() {
		super();
		Post = "";
	}
	
	public NonTeachingstaff(Integer id, String first_name, String last_name, String date_of_birth, String gender, String contact_no,String Department,String Post,float Salary) {
		super(id,first_name,last_name,date_of_birth,gender,contact_no,Department,Salary);
		this.Post = Post;
	}

}
