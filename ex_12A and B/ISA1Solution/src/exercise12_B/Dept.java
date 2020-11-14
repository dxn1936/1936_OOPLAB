package exercise12_B;

public class Dept extends College {
	private Integer deptID;
	private String deptName;
	
	public Dept() {		//constructor
		super();
		this.deptID = -1;
		this.deptName ="";
	}
	
	public Dept(String name, Integer collegeID, String collegeName, Integer deptID, String deptName) {	//constructor
		super(name, collegeID, collegeName);
		this.deptID = deptID;
		this.deptName = deptName;
	}

	
	public Integer getDeptID() {
		return deptID;
	}

	public void setDeptID(Integer deptID) {
		this.deptID = deptID;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
}
