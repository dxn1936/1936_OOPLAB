package studetails;
import java.util.*;

public class studentdetails {
	String name;
	Integer RollNo;
	List<Double> sem1 = new ArrayList<Double>();
	List<Double> sem2 = new ArrayList<Double>();
	List<Double> sem3 = new ArrayList<Double>();
	
	public studentdetails(Integer RollNo, String name, List<Double> sem1, List<Double> sem2, List<Double> sem3) {
		this.RollNo = RollNo;
		this.name = name;
		this.sem1 = new ArrayList<Double>(sem1);
		this.sem2 = new ArrayList<Double>(sem2);
		this.sem3 = new ArrayList<Double>(sem3);
	}
}
