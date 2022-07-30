package myprojectday7;

import java.util.Arrays;

public class AnaGram {

	public static void main(String[] args) {
		String text1="stops";
		String text2="potss";
		if(text1.length()!=text2.length())
		{
			System.out.println("IF LENGTH IS DIFFERENT IT CAN'T BE ANAGRAM");
		}else {
			char[]ch1=text1.toCharArray();
			char[]ch2=text2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if(Arrays.equals(ch1, ch2)) {
		System.out.println("BOTH ARE ANAGRAM");
		}
			else {
				System.out.println("BOTH ARE NOT ANAGRAM");
		}

	}

}
}