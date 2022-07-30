package myprojectday7;

public class FindIntersection {

	public static void main(String[] args) {
		int[] num= {3,2,11,4,6,7};
		int[] numb= {1,2,8,4,9,7};
		System.out.println("THE INTERSECTIONS ARE:");
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < numb.length; j++) {
				if(num[i]==numb[j]) {
					System.out.println(numb[j]);
				}
			}
		}

	}

}
