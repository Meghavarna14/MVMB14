package abstractclass;

public abstract class App {
	public static void main(String[] args) {
		Android android = new Miui();
		android.runOs();
		android.openOs();
		android.security();
		android.powerOn();

	}
}
