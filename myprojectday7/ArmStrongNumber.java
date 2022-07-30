package myprojectday7;

public class ArmStrongNumber {

	public static void main(String[] args) {
		int num = 153;
		int a= num,r,sum=0;
		while(num>0) {
			r=num%10;
			num=num/10;
			sum=sum+r*r*r;
		}
		if(a==sum) {
			System.out.println("Amg strong");
		}else {
			System.out.println("Not An AmgStrong");
		}

	}

}
