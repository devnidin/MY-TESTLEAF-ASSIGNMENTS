package myprojectday7;

public class FibonacciSeries {

	public static void main(String[] args) {
	int range=8;
	int first=0;
	int second=1;
	int sum=0;
	System.out.println(first);
	System.out.println(second);
			for (int i = 1; i <=range; i++) {
				sum=first+second;
				first=second;
				second=sum;
				System.out.println(sum);
			}
		}

	}

 
