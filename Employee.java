package day11;

public class Employee {
	 private String empName;
	 private int empid;
	 private String department;
	
	public Employee() {
	
	}
	public Employee(String empName,int empid,String department) {
		
		this.empName=empName;
		this.empid=empid;
		this.department=department;
		
	}
	public String getEmpName() {
		return empName;
	}
	public int getEmpId() {
		return empid;
		
	}
	public String getDepartment() {
		return department;
		
	}
    void  setEmpName(String empName) {
    	this.empName =empName;
    }
    void  setEmpId(int empid) {
    	this.empid =empid;
    }
    void  setDepartment(String department ) {
    	this.department =department;
    }
    public String toString() {
    	return "Your Employee Name is:"+ empName+"\n Your Employee Id:"+empid+"\n Employee department:"+ department;
    }
    
}
