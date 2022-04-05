package hashset;

public class Stu {
	private String sName;
	private int sId;
	private int sAge;

	public Stu() {
		super();
	}

	public Stu(String sName, int sId, int sAge) {
		super();
		this.sName = sName;
		this.sId = sId;
		this.sAge = sAge;
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
	public String toString() {
		return "ArrayList [sName=" + sName + ", sId=" + sId + ", sAge=" + sAge + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + sAge;
		result = prime * result + sId;
		result = prime * result + ((sName == null) ? 0 : sName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stu other = (Stu) obj;
		if (sAge != other.sAge)
			return false;
		if (sId != other.sId)
			return false;
		if (sName == null) {
			if (other.sName != null)
				return false;
		} else if (!sName.equals(other.sName))
			return false;
		return true;
	}

}


