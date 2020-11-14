package exercise_12A;

public class Employee {
	private Integer empID;
	private String empName;
	private String gender;
	private String designation;
	private Double salary;
	private Boolean isPremanent;
	private Integer contractDuration; // months
	
	public Employee() {
		this.empID = null;
		this.empName = null;
		this.gender = null;
		this.designation = null;
		this.salary = null;
		this.isPremanent = null;
		this.contractDuration = null;
	}

	public Employee(Integer empID, String empName,String gender,String designation, Double salary, Boolean isPremanent, Integer contractDuration) {
		this.empID = empID;
		this.empName = empName;
		this.gender = gender;
		this.designation = designation;
		this.salary = salary;
		this.isPremanent = isPremanent;
		this.contractDuration = contractDuration;
	}

	//getters n setters
	public Integer getEmpID() {
		return empID;
	}

	public void setEmpID(Integer empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Boolean getIsPremanent() {
		return isPremanent;
	}

	public void setIsPremanent(Boolean isPremanent) {
		this.isPremanent = isPremanent;
	}

	public Integer getContractDuration() {
		return contractDuration;
	}

	public void setContractDuration(Integer contractDuration) {
		this.contractDuration = contractDuration;
	}

}
