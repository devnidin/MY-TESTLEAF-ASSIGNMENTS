package oops;

public class Students {

	
		public void getStudentDetails(int id) {
			System.out.println(id);
		}
		
		public void getStudentDetails(int id,String name) {
			System.out.println(id);
			System.out.println(name);
		}
		
		public void getStudentDetails(int id,String name,String email) {
			System.out.println(id);
			System.out.println(name);
			System.out.println(email);
		}
		public void getStudentDetails(int id, String name, String email,long number) {
			System.out.println(id);
			System.out.println(name);
			System.out.println(email);
			System.out.println(number);
		}
		
		public static void main(String[] args) {
			Students std=new Students();
			std.getStudentDetails(101);
			std.getStudentDetails(101, "Nidin dev");
			std.getStudentDetails(101, "Nidin Dev", "nidin@gmail.com");
			std.getStudentDetails(101, "Nidin Dev", "nidin@gmail.com", 1234567890l);
		}
}

