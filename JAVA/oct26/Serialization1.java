package oct26;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee1 implements Serializable {
	int empId;
	String empName;

	public Employee1(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return empId + " " + empName;
	}

}

class Manager1 extends Employee1 {
	float salary;

	public Manager1(int empId, String empName, float salary) {
		super(empId, empName);
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString() + " " + salary;
	}

}

public class Serialization1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try (FileOutputStream fos = new FileOutputStream("E:\\DAC KOCHI\\ABC\\cdac.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			Manager1 m = new Manager1(101, "ram", 9090.50f);
			oos.writeObject(m);
		}
		System.out.println("done");
	}

}
