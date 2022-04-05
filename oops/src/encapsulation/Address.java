package encapsulation;

public class Address {
	private int houseNumber;
	private String streatName;
	private String city;
	private String state;

	public Address() {
		super();
	}

	public Address(int houseNumber, String streatName, String city, String state) {
		super();
		this.houseNumber = houseNumber;
		this.streatName = streatName;
		this.city = city;
		this.state = state;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getStreatName() {
		return streatName;
	}

	public void setStreatName(String streatName) {
		this.streatName = streatName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}



