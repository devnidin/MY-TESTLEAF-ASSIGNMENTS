package oops;

public class Desktop extends Computer {
	public void desktopsize() {
		System.out.println("windows 64");
	}
	public static void main(String[] args) {
		Desktop desk=new Desktop();
		desk.windows();
		desk.desktopsize();
	}

}
