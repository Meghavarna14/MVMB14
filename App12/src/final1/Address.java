package final1;

public class Address {
	String city;
	String State;

	public Address() {
		super();
	}

	public Address(String city, String state) {
		super();
		this.city = city;
		State = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

}
