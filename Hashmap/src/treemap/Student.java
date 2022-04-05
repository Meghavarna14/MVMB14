package treemap;

public class Student implements Comparable {

	private int sId;
	private String sName;
	private int sAge;

	public Student(int sId, String sName, int sAge) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sAge = sAge;
	}

	public Student() {
		super();
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
	public int compareTo(Object o) {
		Student student = (Student) o;
		if (this.sAge > student.sAge)

			return 1;
		if (this.sAge < student.sAge)
			return -1;
		return 0;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sAge=" + sAge + "]";
	}

}
