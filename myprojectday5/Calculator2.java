package myprojectday5;

public class Calculator2 {

public int add(int a, int b) {
	int c=a+b;
	return c;
}

public void sub(int add, int e) {
	int f=add-e;
	System.out.println(f);
	
}
public void mul(int add, double g) {
	double h=add*g;
	System.out.println(h);

}
public void div(int  add,double y) {
double z=add%y;
System.out.println(z);
}
public static void main(String[] args) {
	Calculator2 calc= new Calculator2();
	int add = calc.add(20, 20);
	System.out.println(add);
	calc.sub(add, 10);
	calc.mul(add, 20.5);
	calc.div(add, 2.5);
}



}
