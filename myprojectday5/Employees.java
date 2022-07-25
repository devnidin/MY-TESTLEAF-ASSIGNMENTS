package myprojectday5;

public class Employees {
	public void printEmployeeName(String name){
		System.out.println("Emp name "+name);
	}
 public void printEmployeeId(int id) {
	 System.out.println("Emp id "+id);
 }
 public void printEmployeeAddresslocation(String address) {
	 System.out.println("Emp address "+address);
 }
 
 public void printEmployeeSalary(double salary) {
	 System.out.println("Emp salary "+salary);
 }
 public void printEmployeeMobileNumber(long mobnum) {
	 System.out.println("Emp Number "+mobnum);
 }

 
 public static void main(String[] args) {
		Employees emp= new Employees();
		emp.printEmployeeName("Deva");
		emp.printEmployeeId(1001);
		emp.printEmployeeAddresslocation("Chennai");
		emp.printEmployeeSalary(25000.75);
		emp.printEmployeeMobileNumber(9854582569L);
		

	}

}
