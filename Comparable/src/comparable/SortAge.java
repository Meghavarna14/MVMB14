package comparable;

import java.util.Arrays;
import java.util.Comparator;

public class SortAge {
	public static void main(String[] args) {
		Employee[] employees = { new Employee(1, "EName01", 22, 10000), new Employee(2, "EName02", 18, 12000),
				new Employee(3, "EName03", 25, 9000), new Employee(4, "EName04", 23, 10000) };

		// Arrays.sort(employees, new CompareEmployeeBasedOnSalary());
		Comparator comparatorAge = (o1, o2) -> {
			Employee employee1 = (Employee) o1;
			Employee employee2 = (Employee) o2;
			if (employee1.geteAge() > employee2.geteAge())
				return 1;
			else if (employee1.geteAge() < employee2.geteAge())
				return -1;
			return 0;
		};

		Comparator comparatorSalary = (o1, o2) -> {
			Employee employee1 = (Employee) o1;
			Employee employee2 = (Employee) o2;
			if (employee1.geteSalary() > employee2.geteSalary())
				return 10;
			else if (employee1.geteSalary() < employee2.geteSalary())
				return -10;
			return 0;
		};

		Arrays.sort(employees, comparatorSalary);

		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}

}