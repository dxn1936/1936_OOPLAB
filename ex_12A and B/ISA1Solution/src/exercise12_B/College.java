package exercise12_B;

public class College extends University{
	private Integer collegeID;
	private String collegeName;
	
	public College() {				//constructor
		super();
		this.collegeID = -1;
		this.collegeName ="";
	}
	
	public College(String name, Integer collegeID, String collegeName) {		//constructor
		super(name);
		this.collegeID = collegeID;
		this.collegeName = collegeName;
	}

	public Integer getCollegeID() {
		return collegeID;
	}

	public void setCollegeID(Integer collegeID) {
		this.collegeID = collegeID;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
}
