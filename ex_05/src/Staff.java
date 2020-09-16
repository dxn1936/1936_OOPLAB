
public class Staff extends User {
	public String department;
	public float salary;
	
	public Staff() {
		super();
		department = "";
		salary = 0 ;
	}
	
	public Staff(Integer id, String first_name, String last_name, String date_of_birth, String gender, String contact_no, String department, float salary) {
		super(id,first_name,last_name,date_of_birth,gender,contact_no );
		this.department = department;
		this.salary = salary;
  }
	
	public static void getTotal_Salary(Staff[] U2) {
		float total = 0;
		for(int i=0;i<U2.length;i++) 
		{
			total = total + U2[i].salary;
		}
			System.out.println(total);
		
		}
}
