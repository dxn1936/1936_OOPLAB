
public class Mainclass {
static float total;
	
	public static void main(String args[]) {
		
		Student student1 = new Student(100, "Darshan", "Naik", "18|05|1998", "male", "8182029020", "CS", "2nd year");
		
		TeachingStaff teacher1 = new TeachingStaff(200,"Jarret","Fernandes","10|07|1990","male","7864509322", "Comp. Sci. & Tech","MCA","Asst. Professor",100000);
		
		NonTeachingstaff nonteacher1 = new NonTeachingstaff(300,"Raju","Rastogi","02|04|1988","male","8020402689", "Comp. Sci. & Tech","Clark",50000);
		
		
		System.out.println("First Name Of Users Only:");
		User U1[] = {student1,teacher1,nonteacher1};
		User.getFirst_Name(U1);
		
		System.out.println("\n************************************************************");
		
		System.out.println("Total salary university needs to pay:");
		Staff U2[] = {teacher1, nonteacher1};
		Staff.getTotal_Salary(U2);
		
		
	}
}
