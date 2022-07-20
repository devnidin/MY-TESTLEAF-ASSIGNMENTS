package task1;

public class Newcar {

	public void switchOn() {
		System.out.println("Turn on the car");
	}
	public void applyBreak() {
		System.out.println("Press Break");
	}
	public void applyClutch() {
		System.out.println("Press Clutch");
	}
	public void applyGear() {
	System.out.println("Apply Gear");
	}
	public void switchOnAc() {
		System.out.println("Turn on the AC");
	}
	public void applyAcclerator() {
		System.out.println("Go for a drive");
	}
	public static void main(String[] args) {
		Newcar car1= new Newcar();
				car1.switchOn();
				car1.applyBreak();
				car1.applyClutch();
				car1.applyGear();
				car1.switchOnAc();
				car1.applyAcclerator();

	}

}
