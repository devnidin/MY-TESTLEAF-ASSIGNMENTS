package oops;

public class Student extends Department {

	public void studentName() {
	System.out.println("Nidin Dev");
	}
	
	public void studentDept() {
	System.out.println("CSE");
	}
	
	public void StudentId() {
		System.out.println(142);
	}
	public static void main(String[] args) {
		Student std=new Student();
		std.collegeName();
		std.collegeCode();
		std.collegeRank();
		std.deptName();
		std.studentName();
		std.studentDept();
		std.StudentId();
	}
}


