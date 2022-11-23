package oct25;

class Employee1 {
	private int empId;
	private String empName;

	public Employee1(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee1 [empId=" + empId + ", empName=" + empName + "]";
	}

}

public class EqualsMethodDemo2 {

	public static void main(String[] args) {
		Employee1 e1 = new Employee1(101, "Virat");
		Employee1 e2 = e1;
		Employee1 e3 = new Employee1(101, "Virat");
		Employee1 e4 = new Employee1(102, "shiv");
		Employee1 e5 = e4;

		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		System.out.println(e1.equals(e4));
		System.out.println(e5.equals(e4));

	}

}
