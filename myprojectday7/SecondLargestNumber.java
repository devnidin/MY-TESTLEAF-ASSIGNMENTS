package myprojectday7;

import java.util.Arrays;

public class SecondLargestNumber {
	public static void main(String[] args) {
		int[] num= {1,5,4,7,8,3,0};
		Arrays.sort(num);
		int len=num.length;
		System.out.println(num[len-2]);
		
		
	}

}
