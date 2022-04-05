package employee;

public class Employee1 {
private String eName;
private int eId;
private int eAge;
private int esalary;
public Employee1() {
	super();
}
public Employee1(String eName, int eId, int eAge) {
	super();
	this.eName = eName;
	this.eId = eId;
	this.eAge = eAge;
}
public void Employee(String eName, int eId, int eAge) {
	super();
	this.eName = eName;
	this.eId = eId;
	this.eAge = eAge;
}
@Override
public String toString() {
	return "Employee [eName=" + eName + ", eId=" + eId + ", eAge=" + eAge + "]";
}

}
