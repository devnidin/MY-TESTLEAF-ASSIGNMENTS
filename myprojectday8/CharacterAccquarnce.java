package myprojectday8;

public class CharacterAccquarnce {

	public static void main(String[] args) {
		String Str="welcome to chennai";
		char[] charArray = Str.toCharArray();
		int count=0;
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i]=='c') {
				count=count+1;
			}
		}
			

	System.out.println(count);
	
	}

}
