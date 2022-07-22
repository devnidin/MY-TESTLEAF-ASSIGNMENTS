package myprojectday4;

public class Smartphone {
int ramSize=8;
long imeiNumber=2501254558452L;
boolean isCharged=true;
String brandName="Samsung";
String modelName="Galaxy s21 Ultra";
double mobilePrice=79999.99;
public static void main(String[] args) {
	Smartphone phone=new Smartphone();
	System.out.println("ramsize "+phone.ramSize);
	System.out.println("IMEI "+phone.imeiNumber);
	System.out.println("IS CHARGED "+phone.isCharged);
	System.out.println("BRAND NAME "+phone.brandName);
	System.out.println("MOBILE PRICE "+phone.mobilePrice);
}

}
