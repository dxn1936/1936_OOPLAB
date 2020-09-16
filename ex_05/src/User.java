
public class User {
	public Integer id;
	public String first_name;
	public String last_name;
	public String date_of_birth;
	public String gender;
	public String contact_no;
	
public User() {
	id = 1;
	first_name = "";
	last_name = "";
	date_of_birth = "";
	gender = "";
	contact_no = "";
}
	
	public User(Integer id, String first_name, String last_name, String date_of_birth, String gender, String contact_no ){
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.date_of_birth = date_of_birth;
		this.gender = gender;
		this.contact_no = contact_no;
	
	}
	
	
	public static void getFirst_Name(User U1[]) {
		for(int i=0;i<U1.length;i++) {
			
			System.out.println(U1[i].first_name);
		
		}
	
		
	}
}
