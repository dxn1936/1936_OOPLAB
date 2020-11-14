/*
 * 
Exercise_12-A: HR_System
Consider a HRM (Human Resource) System for employees of a software company. Employees belong to department: executive, HR, finance or project. A project team is formed of developers, tester(s) and manager(s). Employee can be on contract or permanent.
For project employees: your system should display project details like team members list along with their salaries, project budget & project start & end date, for each project asked by user. Optionally user can ask to show of all projects without giving list.
The system should allow to calculate total salary of each department filtered by whether contract/permanent and/or male/female. By default consider all employees if filters not specified.

 * 
 */
package exercise_12A;

public class MainApp {
public static void main(String[] args) {
		
		Employee e1 = new Employee(101, "Rahul","M","Tester", 15000d, true, 0),
				e2 = new Employee(102, "Ankita","F","Developer", 17000d, true, 0),
				e3 = new Employee(103, "Soham","M","Manager", 25000d, true, 0),
				e5 = new Employee(103, "Rani","F","Manager", 27000d, false, 12),
				e4 = new Employee(104, "Sujata","F","Manager", 19000d, false, 6);
			
		
		Dept d1 = new Dept(501, "HR"),
				d2 = new Dept(502, "Executive");
		
		d1.addEmpToDept(e4);
		
		d2.addEmpToDept(e1);
		d2.addEmpToDept(e2);
		d2.addEmpToDept(e3);
		d2.addEmpToDept(e5);
		
		d1.displayDept();

		d2.displayDept();
		
		Project p1 = new Project("E-Commerce Website", 901, 30000d, "09-02-2020", "18-19-2020", d2);
		
		p1.addEmpToProj(e3);
		p1.addEmpToProj(e2);
		
		p1.displayProjDetails();
		
		System.out.println("----------");
		System.out.println("Salary of all employees in " + d2.getDeptName() + " department:" + d2.calculateSalaryOfEmpInDept());
		System.out.println("Salary of male employees in " + d2.getDeptName() + " department:" + d2.calculateSalaryOfEmpInDept("male"));
		System.out.println("Salary of female employees in " + d2.getDeptName() + " department:" + d2.calculateSalaryOfEmpInDept("female"));
		System.out.println("Salary of permanent employees in " + d2.getDeptName() + " department:" + d2.calculateSalaryOfEmpInDept("permanent"));
		System.out.println("Salary of contract employees in " + d2.getDeptName() + " department:" + d2.calculateSalaryOfEmpInDept("contract"));
		System.out.println("----------");
	}
}
