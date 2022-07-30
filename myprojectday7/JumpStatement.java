package myprojectday7;

public class JumpStatement {

	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
			if(i==3) {
				System.out.println("three");
				continue;
			}
			System.out.println(i);
		}

	}

}
