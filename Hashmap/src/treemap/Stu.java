package treemap;

public class Stu {

	private int sId;
	private String sName;
	private int sAge;
	public Stu() {
		super();
	}
	public Stu(int sId, String sName, int sAge) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sAge = sAge;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getsAge() {
		return sAge;
	}
	public void setsAge(int sAge) {
		this.sAge = sAge;
	}
	@Override
	public String toString() {
		return "Stu [sId=" + sId + ", sName=" + sName + ", sAge=" + sAge + "]";
	}
	
	}


