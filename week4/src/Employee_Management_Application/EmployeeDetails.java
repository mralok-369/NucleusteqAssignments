package Employee_Management_Application;

import java.io.Serializable;

public class EmployeeDetails implements Serializable{
	int empId;
	String empName;
	int salary;
	
	public EmployeeDetails(int empId, String empName, int salary) {
		// TODO Auto-generated constructor stub
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	
	// toString() method to display content of employee in string format
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return empId+" "+empName+" "+salary;
	}
	
}
