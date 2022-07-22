package myprojectday4;

public class Whatsapp {
public void whatsappText() {
	System.out.println("whatsapp TextMessage");
}
private void whatsappCall() {
	System.out.println("whatsapp Call");
	}
protected void whatsappPayment() {
	System.out.println("Payments");
}
void whatsappVideoCall( ) {
	System.out.println("Video call");
}
	public static void main(String[] args) {
		Whatsapp app= new Whatsapp();
		app.whatsappText();
		app.whatsappCall();
		app.whatsappPayment();
		app.whatsappVideoCall();

	}

}
