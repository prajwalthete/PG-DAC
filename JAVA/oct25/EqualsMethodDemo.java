package oct25;
//reference equality ==

class Employee {
	private int empId;
	private String empName;

	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return empId + " " + empName;
	}

}

public class EqualsMethodDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee(101, "ram"); 	
		Employee e2 = e1;
		Employee e3 = new Employee(101, "ram"); 	
		Employee e4 = new Employee(102, "shiv"); 	

		System.out.println(e1 == e2); // true
		System.out.println(e1 == e3); // false
		System.out.println(e1 == e4); // false

	}

}
