package exercise12_B;
import java.util.*;
public class Course extends Dept {
	private Integer courseID;
	private String courseName;
	private Boolean isSelfFunded;
	private Float Fees;	//year
	private Integer courseDuration; //years
	private List <Student> enrolled = new ArrayList<Student>();
	
	public Course() {			//constructor
		super();
		this.courseID = -1;
		this.courseName ="";
		this.isSelfFunded = null;
		this.Fees = 0f;
		this.courseDuration = 0;
		this.enrolled = null;
	}
	
	public Course(String uniName, Integer collegeID, String collegeName, Integer deptID, String deptName, Integer courseID,
			String courseName, Boolean isSelfFunded, float fees, Integer courseDuration, List<Student> enrolled) {		//constructor
		super(uniName, collegeID, collegeName, deptID, deptName);
		this.courseID = courseID;
		this.courseName = courseName;
		this.isSelfFunded = isSelfFunded;
		this.Fees = fees;
		this.courseDuration = courseDuration;
		this.enrolled = new ArrayList<Student>(enrolled);
	}

	void display() //to display the no of students enrolled in each course in the university and the affiliated colleges
	{
		System.out.println("No of students in "+courseName+" course :- "+enrolled.size());
		for(Student itr:enrolled)
		{
			System.out.println(itr.getStudentName());
		}
		System.out.println();
	}
	
	void display2() //to display the no of students enrolled in each course in the university
	{
		
		Integer i=0;
		System.out.println("\nCourse Name :-"+courseName);
		for(int j=0;j<enrolled.size();j++)
		{
			if(getCollegeID()==0)
			i++;
		}
		System.out.println("No of Students Enrolled in "+courseName+" :- "+i);
		
		for(int j=0;j<enrolled.size();j++)
		{
			if(getCollegeID()==0)
			System.out.println((j+1)+") "+enrolled.get(j).getStudentName());
		}
		
	}
	
	void uniRevenue()  //to calculate the revenue generated by university filtered by each course along with the course fees and all the courses available
	{
		Integer i=0;
		System.out.println("\nCourse Name :-"+courseName+"|Yearly Fees :-"+Fees+"|Duration :- "+getCourseDuration()+" years");
		
		for(int j=0;j<enrolled.size();j++)
		{
			if(getCollegeID()==0)
			i++;
		}
		System.out.println("No of Students Enrolled in "+courseName+" :- "+i);
		System.out.println("Total Revenue Generated :- "+i*Fees*getCourseDuration());
	}

	//getters and setters
	public Integer getCourseID() {
		return courseID;
	}

	public void setCourseID(Integer courseID) {
		this.courseID = courseID;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Boolean getIsSelfFunded() {
		return isSelfFunded;
	}

	public void setIsSelfFunded(Boolean isSelfFunded) {
		this.isSelfFunded = isSelfFunded;
	}

	public Float getFees() {
		return Fees;
	}

	public void setFees(Float fees) {
		Fees = fees;
	}

	public Integer getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(Integer courseDuration) {
		this.courseDuration = courseDuration;
	}

	public List<Student> getEnrolled() {
		return enrolled;
	}

	public void setEnrolled(List<Student> enrolled) {
		this.enrolled = enrolled;
	}
}