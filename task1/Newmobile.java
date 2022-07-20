package task1;

public class Newmobile {
  public void sendMessage() {
	  System.out.println("Text Someone");
  }
  public void shareDocument() {
	  System.out.println("Send Document"); 
  }
  public void Call() {
	  System.out.println("Call someone");
  }
 
	public static void main(String[] args) {
		Newmobile mobile= new Newmobile();
		mobile.sendMessage();
		mobile.shareDocument();
		mobile.Call();

	}

}
