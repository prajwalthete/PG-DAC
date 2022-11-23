package oct25;

import java.util.Objects;

class Employee3 {
	private int empId;
	private String empName;

	public Employee3(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee3 [empId=" + empId + ", empName=" + empName + "]";
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
		Employee3 other = (Employee3) obj;
		return empId == other.empId && Objects.equals(empName, other.empName);
	}

}

public class EqualsMethodDemo4 {

	public static void main(String[] args) {
		Employee3 e1 = new Employee3(101, "sky");
		Employee3 e2 = e1;
		Employee3 e3 = new Employee3(101, "sky");
		Employee3 e4 = new Employee3(102, "shiv");

		System.out.println(e1.equals("ab"));
		System.out.println(e1.equals(e3));
		System.out.println(e1.equals(e4));

	}

}
