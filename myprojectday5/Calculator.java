package myprojectday5;

public class Calculator {
 
	public void add() {
		int a=20;
		int b=35;
		int c=a+b;
		System.out.println(c);
	}
	public void sub() {
		int a=22;
		int b=18;
		int c=a-b;
		System.out.println(c);
		
	}
	public void mul() {
		double a=25.5;
		double b=15.5;
		double c=a*b;
		System.out.println(c);
	}
	public void div() {
		double a=9.8;
		double b=.4;
		double c=a%b;
		System.out.println(c);
	}
	
	
	public static void main(String[] args) {
	Calculator calc= new Calculator();
	calc.add();
	calc.sub();
	calc.mul();
	calc.div();

	}

}
