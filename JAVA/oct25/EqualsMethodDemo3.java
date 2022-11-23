package oct25;

import java.util.Objects;

class Employee2 {
	private int empId;
	private String empName;

	Employee2(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee2 [empId=" + empId + ", empName=" + empName + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(empId, empName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee2 other = (Employee2) obj;
		return empId == other.empId && Objects.equals(empName, other.empName);
	}

}

public class EqualsMethodDemo3 {

	public static void main(String[] args) {
		Employee2 e1 = new Employee2(10, "king");
		Employee2 e2 = e1;
		Employee2 e3 = new Employee2(10, "king");
		Employee2 e4 = new Employee2(11, "Queen");

		System.out.println(e1.equals("ab"));
		System.out.println(e1.equals(e3));
		System.out.println(e1.equals(e4));
	}

}
