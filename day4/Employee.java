package day4;

public class Employee {
	private int empId;
	private String empName;
	private String projectName;
	
	private int exp;
	
	private int salary;
	/*
	 *   trigger
	 *   if (exp is less than 3) :- salary should not be greater than 3000
	 *   
	 *   Salary > 20000 :- Error
	 * 
	 * */
	
	public Employee() {
		empId = -1;
		empName = " No Name Set";
		salary = -1;
		projectName = " No Project Allocate";
	}
	
	/*public Employee(int id)
	{
		empId = id;
	}*/
	
	
	public int getEmpId() {
		return empId;
	}

	public Employee(int empId, String empName, String projectName, int exp) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.projectName = projectName;
		this.exp = exp;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	/* Business Method / operation */
	public void workingOnProject()
	{
		// 1000 lines of code ...
		System.out.println("employee details------------------------------");
		System.out.println("employee id: "+empId);
		System.out.println("employee name: "+empName);
		System.out.println("working on project "+projectName);
		System.out.println("experience in years: "+exp);
		if (exp<3)
		{
			System.out.println("Salary is 2600");
		}
		else if (exp>=3)
		{
		System.out.println("salary is 8000");
	    } 
	
	}

}//end class


