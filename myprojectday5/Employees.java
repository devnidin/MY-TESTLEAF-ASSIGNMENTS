package myprojectday5;

public class Employees {
	public void printEmployeeDetails(String name, int id, String address, double salary, long num){
		System.out.println("Emp name "+name);
		System.out.println("Emp id "+id);
		System.out.println("Emp address "+address);
		System.out.println("Emp salary "+salary);
		System.out.println("Emp Number "+num);
 }

 
 public static void main(String[] args) {
		Employees emp= new Employees();
		emp.printEmployeeDetails("Nidin", 1001, "Chennai", 35000.5, 9854586240L);
		

	}

}
