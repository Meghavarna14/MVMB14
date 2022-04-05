package studenttree;

public class Student1 implements Comparable{
	
	private String sName;
	private int sId;
	private int sAge;
	public Student1(String sName, int sId, int sAge) {
		super();
		this.sName = sName;
		this.sId = sId;
		this.sAge = sAge;
	}
	public Student1() {
		super();
	}
	@Override
	public String toString() {
		return "Student1 [sName=" + sName + ", sId=" + sId + ", sAge=" + sAge + "]";
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public int getsAge() {
		return sAge;
	}
	public void setsAge(int sAge) {
		this.sAge = sAge;
	}
	
	@Override
	public int compareTo(Object o) {
		Student1 student1=(Student1) o;
		if (this.sAge > student1.sAge)
			return 1;
		else if (this.sAge < student1.sAge)
			return -1;
		return 0;
	
	}
}
