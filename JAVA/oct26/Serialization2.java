package oct26;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Address {
	int houseNo;
	String street;

	public Address(int houseNo, String street) {
		this.houseNo = houseNo;
		this.street = street;
	}

	@Override
	public String toString() {
		return houseNo + " " + street;
	}

}

class Employee2 implements Serializable {
	int empId;
	String empName;
	transient Address addr;

	public Employee2(int empId, String empName, Address addr) {
		this.empId = empId;
		this.empName = empName;
		this.addr = addr;
	}

	@Override
	public String toString() {
		return empId + " " + empName + " " + addr;
	}

}

public class Serialization2 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try (FileOutputStream fos = new FileOutputStream("E:\\DAC KOCHI\\ABC\\cdac.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			Address ad = new Address(10, "super corr");
			Employee2 emp = new Employee2(101, "ram", ad);
			oos.writeObject(emp);
		}
		System.out.println("done");
	}

}
