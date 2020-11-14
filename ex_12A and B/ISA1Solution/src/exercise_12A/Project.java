package exercise_12A;
import java.util.ArrayList;
public class Project extends Dept{
	private String projectName;
	private Integer projectID;
	private Double projectBudget;
	private String projectStartDate;
	private String projectEndDate;
	private Dept projectDepartment;
	private ArrayList<Employee> projEmployees;
	
	public Project() {
		this.projectName = null;
		this.projectID = null;
		this.projectBudget = null;
		this.projectStartDate = null;
		this.projectEndDate = null;
		this.projectDepartment = null;
		this.projEmployees = new ArrayList<Employee>();
	}

	public Project(String projectName, Integer projectID, Double projectBudget, String projectStartDate,
			String projectEndDate, Dept d) {
		this.projectName = projectName;
		this.projectID = projectID;
		this.projectBudget = projectBudget;
		this.projectStartDate = projectStartDate;
		this.projectEndDate = projectEndDate;
		this.projectDepartment = d;
		this.projEmployees = new ArrayList<Employee>();
	}
	
	public void addEmpToProj(Employee emp) {
		this.projEmployees.add(emp);
	}
	
	public void displayProjDetails() {
		System.out.println("\n********************");
		System.out.println("Project Name: " + this.projectName);
		System.out.println("Project start date: " + this.projectStartDate);
		System.out.println("Project End date: " + this.projectEndDate);
		
		System.out.println("\nEmployees working on the project: ");
		int i=1;
		System.out.println("Sr.No. Name\tSalary");
		for(Employee e: this.projEmployees) {
			System.out.println("Emp " + i + " "+ e.getEmpName() + "\t" + e.getSalary());
			i++;
		}
		System.out.println();
		
		
		System.out.println("********************\n");
	}
	
	
	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Integer getProjectID() {
		return projectID;
	}

	public void setProjectID(Integer projectID) {
		this.projectID = projectID;
	}

	public Double getProjectBudget() {
		return projectBudget;
	}

	public void setProjectBudget(Double projectBudget) {
		this.projectBudget = projectBudget;
	}

	public String getProjectStartDate() {
		return projectStartDate;
	}

	public void setProjectStartDate(String projectStartDate) {
		this.projectStartDate = projectStartDate;
	}

	public String getProjectEndDate() {
		return projectEndDate;
	}

	public void setProjectEndDate(String projectEndDate) {
		this.projectEndDate = projectEndDate;
	}

	public Dept getProjectDepartment() {
		return projectDepartment;
	}

	public void setProjectDepartment(Dept projectDepartment) {
		this.projectDepartment = projectDepartment;
	}
}
