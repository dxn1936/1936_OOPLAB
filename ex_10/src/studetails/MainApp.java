package studetails;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;
public class MainApp {
public static void main(String[] args) {
		
		Double a1,a2,a3;
		String name;
		Integer RollNo,count;
		Scanner a = new Scanner(System.in);
		Map<Integer,studentdetails> stu = new TreeMap<Integer,studentdetails>();
		List<Double> sem1 = new ArrayList<Double>();
		List<Double> sem2 = new ArrayList<Double>();
		List<Double> sem3 = new ArrayList<Double>();
		System.out.println("Enter the number of students: ");
		count = a.nextInt();
		studentdetails student[] = new studentdetails[count];
		for(int j=0; j<count; j++) {
			System.out.println("Information of Student " + ++j);
			j=j-1;
			System.out.println("Roll No: ");
			RollNo = a.nextInt();
			System.out.println("Name: ");
			name = a.next();
			for(int i=1; i<=3; i++) {
				System.out.println("Enter Marks for Semester" +i);
				System.out.println("Enter marks in Subject1: ");
				a1 = a.nextDouble();
				System.out.println("Enter marks in Subject2: ");
				a2 = a.nextDouble();
				System.out.println("Enter marks in Subject3: ");
				a3 = a.nextDouble();
				if(i==1) {
					sem1.add(a1);
					sem1.add(a2);
					sem1.add(a3);
				}
				else if(i==2) {
					sem2.add(a1);
					sem2.add(a2);
					sem2.add(a3);
				}
				else {
					sem3.add(a1);
					sem3.add(a2);
					sem3.add(a3);
				}
			}
			student[j] = new studentdetails(RollNo, name, sem1, sem2, sem3);
			stu.put(RollNo, student[j]);
			sem1.clear();
			sem2.clear();
			sem3.clear();
		}
		
		System.out.println("Roll No\tName\tSemester 1\tSemester 2\tSemester 3");
		for(Map.Entry<Integer,studentdetails> entry:stu.entrySet()){ 
	        studentdetails b=entry.getValue();
	        System.out.println(b.RollNo+"\t"+b.name+"\t"+b.sem1+"\t"+b.sem2+"\t"+b.sem3);   
	    }
		a.close();
	}
}
