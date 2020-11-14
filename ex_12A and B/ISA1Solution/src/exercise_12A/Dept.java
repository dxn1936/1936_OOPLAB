package exercise_12A;
import java.util.*;
public class Dept {
	private Integer DeptID;
	private String deptName;
	private ArrayList<Employee> employeeList;
	
	public Dept() {
		this.DeptID = null;
		this.deptName = null;
		this.employeeList = new ArrayList<Employee>();

	}

	public Dept(Integer deptID, String deptName) {
		this.DeptID = deptID;
		this.deptName = deptName;
		this.employeeList = new ArrayList<Employee>();
	}
	
	public void addEmpToDept(Employee emp) {
		this.employeeList.add(emp);
	}
	
	void displayDept() {
		System.out.println("HRM_System");
		System.out.println("\n**********");
		System.out.println("Department name: " + this.deptName);
		int i=1;
		for(Employee e: this.employeeList) {
			System.out.println("Emp " + i + " "+ e.getEmpName());
			i++;
		}
	}
	
	public Double calculateSalaryOfEmpInDept() {
			
		Double maleEmpsSalary=0d,
			femaleEmpsSalary=0d,
			contractEmpsSalary=0d,
			permanentEmpsSalary=0d;
		
		for(Employee emp: this.employeeList) {
			if(emp.getGender() == "M")
				maleEmpsSalary = maleEmpsSalary + emp.getSalary();
			else if(emp.getGender() == "F")
				femaleEmpsSalary += emp.getSalary();
			
			if(emp.getIsPremanent() == true)
				permanentEmpsSalary += emp.getSalary();
			else
				contractEmpsSalary += emp.getSalary();			
		}		
		return permanentEmpsSalary + contractEmpsSalary;
	}
	
	public Double calculateSalaryOfEmpInDept(String filter) {
		
		Double maleEmpsSalary=0d,
			femaleEmpsSalary=0d,
			contractEmpsSalary=0d,
			permanentEmpsSalary=0d;
		
		for(Employee emp: this.employeeList) {
			if(emp.getGender() == "M")
				maleEmpsSalary = maleEmpsSalary + emp.getSalary();
			else if(emp.getGender() == "F")
				femaleEmpsSalary += emp.getSalary();
			
			if(emp.getIsPremanent() == true)
				permanentEmpsSalary += emp.getSalary();
			else
				contractEmpsSalary += emp.getSalary();		
		}
		
		if(filter == "all")
			return permanentEmpsSalary+contractEmpsSalary;
		else if(filter == "male")
			return maleEmpsSalary;
		else if(filter == "female")
			return femaleEmpsSalary;
		else if(filter == "contract")
			return contractEmpsSalary;
		else if(filter == "permanent")
			return permanentEmpsSalary;
		
		return null;
	}
	

	public Integer getDeptID() {
		return DeptID;
	}

	public void setDeptID(Integer deptID) {
		DeptID = deptID;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public ArrayList<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(ArrayList<Employee> employeeList) {
		this.employeeList = employeeList;
	}
}
