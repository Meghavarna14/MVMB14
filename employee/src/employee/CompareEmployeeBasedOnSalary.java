package employee;

import java.util.Comparator;

public class CompareEmployeeBasedOnSalary implements Comparator {

		@Override
		public int compare(Object o1, Object o2) {
			Employee1 employee1 = (Employee1) o1;
			Employee1 employee2 = (Employee1) o2;
			if (employee1.geteSalary() > employee2.geteSalary())
				return 10;
			else if (employee1.geteSalary() < employee2.geteSalary())
				return -10;
			return 0;
		}

	}

}
