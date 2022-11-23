/*
Q51.Create Interface Taxable with members salesTax=7% and incomeTax=10.5%. create abstract method calcTax().
Create class Employee(empId,name,salary) and implement Taxable to calculate incomeTax on yearly salary.
Create class Product(pid,price,quantity) and implement Taxable to calculate salesTax on unit price of product.
Create class for main method(Say XYZ), accept employee information and a product information from user and print income tax and sales tax respectively.

*/
package assignmentQ51;

import java.util.Scanner;

interface Taxable {
	int salesTax = 7;
	int incomeTax = 10;

	public abstract void calcTax();
}

class Employee implements Taxable {
	int empId;
	String name;
	float salary;
	float calTax;

	Employee(int empId, String name, float salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	public void calcTax() {
		calTax = (incomeTax * salary) / 100;
		System.out.println("Income Tax For The Employee:" + empId + " is:" + calTax);
	}
}

class Product implements Taxable {
	int pId;
	float price;
	int quantity;
	float calTax;

	Product(int pId, float price, int quantity) {
		this.pId = pId;
		this.price = price;
		this.quantity = quantity;
	}

	public void calcTax() {
		calTax = (salesTax * price) / 100;
		System.out.println("Sales Tax For The Product Id:" + pId + " is:" + calTax);
	}

	public class mango {
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			int empId;
			String name;
			float salary;
			System.out.println("Enter Employee id, Name, Salary");
			empId = sc.nextInt();
			name = sc.next();
			salary = sc.nextFloat();
			Taxable t = new Employee(empId, name, salary);
			t.calcTax();
			System.out.println("");
			System.out.println("=============================================");
			System.out.println("");
			int pId;
			float price;
			int quantity;
			System.out.println("Enter PID,Price,Quantity of The Product:");
			pId = sc.nextInt();
			price = sc.nextFloat();
			quantity = sc.nextInt();
			Taxable t1 = new Product(pId, price, quantity);
			t1.calcTax();
		}
	}

}
