package abstractclass;

public class Miui extends Android {

	@Override
	public void runOs() {
		System.out.println("runOs()");
	}

	@Override
	public void openOs() {
		System.out.println("openOs()");
	}

	@Override
	public void security() {
		System.out.println("security()");
	}

//	@Override
//	public void powerOn() {
//		System.out.println("powerOn is overridden!");
//	}
}
