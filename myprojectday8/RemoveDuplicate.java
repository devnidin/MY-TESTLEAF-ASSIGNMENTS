package myprojectday8;

public class RemoveDuplicate {
	public static void main(String[] args) {
		String text="We learn java basics as part of java sessions in java week1";
		String[] split=text.split(text);
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
	}
}
