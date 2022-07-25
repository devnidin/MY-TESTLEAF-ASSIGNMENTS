package myprojectday5;

public class Calculator1 {
 public int add(int a, int b){
 int c=a+b;
 return c;
 }
 public void sub(int add,int b) {
	 int c=add-b;
	 System.out.println(c);
 }
	public static void main(String[] args) {
		Calculator1 calc= new Calculator1();
		int add = calc.add(50, 10);
		System.out.println(add);
		calc.sub(add, 30);

	}

}
