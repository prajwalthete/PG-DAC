package oct26;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
	int empId;
	String empName;

	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return empId + " " + empName;
	}

}

public class Serialization {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try (FileOutputStream fos = new FileOutputStream("E:\\DAC KOCHI\\ABC\\cdac.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			Employee emp = new Employee(101, "ram");
			oos.writeObject(emp);
		}
		System.out.println("done");
	}

}
