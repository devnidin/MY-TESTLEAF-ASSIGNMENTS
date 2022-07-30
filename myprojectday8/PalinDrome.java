package myprojectday8;

public class PalinDrome {

	public static void main(String[] args) {
		String text="NIDIN";
		String rev="";
		char[] charArray = text.toCharArray();
		for (int i =charArray.length-1 ; i>=0; i--) {
		rev=rev+charArray[i];	
		}
		if(text.equals(text)) {
			System.out.println("litteral"+"IS A PALINDROME");
		}else {
			System.out.println("litteral"+"NOT PALINDROME");
		}

	}

}
