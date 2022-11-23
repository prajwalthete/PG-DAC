/*
51.	Create a program that helps banks to maintain records. It should have following facilities. o Anybody can create current or saving account with following initial information: account number, name, balance, and branch. o display account detail for a particular accounts. o display total money deposited in bank. o allow deposit and  withdrawal in an account  . o for saving account opening balance and minimum balance must be 5000. o for current account opening balance and minimum balance must be 1000. o can not withdraw the amount from the account 
that makes balance less than the minimum balance. 
*/

package assignmentQ56;

import java.util.Scanner;

public class Customer {
	double accountNo;
	String Name;
	double balance;

	Customer(double accountNo, String Name, double balance) {
		this.accountNo = accountNo;
		this.Name = Name;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account No " + accountNo + ", Name=" + Name + ", balance=" + balance;
	}

	double getaccNo() {
		return accountNo;
	}

	double getbal() {
		return balance;
	}

	void setbal(double balance) {
		this.balance = balance;
	}

}

class savingAcc extends Customer {
	savingAcc(double accountNo, String Name, double balance) {
		super(accountNo, Name, balance);
	}
}

class currentAcc extends Customer {
	currentAcc(double accountNo, String Name, double balance) {
		super(accountNo, Name, balance);
	}
}

 class king {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Customer c[] = new Customer[2];

		int i = 0;
		/*
		 * for(int i=0;i<c.length;i++) {
		 * System.out.println("Enter Saving Account details"); double
		 * acc=sc.nextDouble(); String name=sc.next(); double bal=sc.nextDouble();
		 * Customer c1=new savingAcc(acc,name,bal); c[i]=c1; } System.out.println("");
		 * for(int i=0;i<c2.length;i++) {
		 * System.out.println("Enter Current Account details"); double
		 * acc=sc.nextDouble(); String name=sc.next(); double bal=sc.nextDouble();
		 * Customer c3=new currentAcc(acc,name,bal); c2[i]=c3; } System.out.println("");
		 * System.out.println("Saving Account details"); for(Customer s: c) {
		 * System.out.println(s.toString()); } System.out.println("");
		 * System.out.println("Current Account details"); for(Customer s1: c2) {
		 * System.out.println(s1.toString()); }
		 */
		while (true) {
			System.out.println("Enter Your Choice");
			System.out.println("1.Add Saving Account Details\n2.Add Current Account Details\n"
					+ "3.Enter Amount in Account\n4.withdraw Amount from Account\n5.Display Information Of ACcounts\n6.Display Information Of Particular ACcounts\n7.Exit");
			int ch = sc.nextInt();
			switch (ch) {
			case 1: {
				System.out.println("Enter Saving Account details");
				double acc = sc.nextDouble();
				String name = sc.next();
				double bal = sc.nextDouble();
				// Customer c1=new savingAcc(acc,name,bal);
				// c[i]=c1;
				c[i] = new savingAcc(acc, name, bal);
				i++;
			}
				break;
			case 2: {
				System.out.println("Enter Current Account details");
				double acc = sc.nextDouble();

				String name = sc.next();
				double bal = sc.nextDouble();
				// Customer c3=new currentAcc(acc,name,bal);
				// c[i]=c3;
				c[i] = new currentAcc(acc, name, bal);
				i++;
			}
				break;
			case 3:
				System.out.println("Enter Account Number");
				double k2 = sc.nextDouble();
				for (Customer cc : c) {
					if (cc.getaccNo() == k2) {
						System.out.println("Enter Amount You Want to deposite");
						double k3 = sc.nextDouble();
						double b = cc.getbal() + k3;
						cc.setbal(b);
					}
				}
			case 4:
				System.out.println("Enter Account Number");
				double k4 = sc.nextDouble();
				for (Customer cc : c) {
					if (cc.getaccNo() == k4) {
						System.out.println("Enter Amount You Want to withdraw");
						double k3 = sc.nextDouble();
						if (cc instanceof savingAcc) {
							if (cc.getbal() > 5000 && cc.getbal() > (5000 + k3)) {
								double b = cc.getbal() - k3;
								cc.setbal(b);
							} else {
								System.out.println(
										"Minimum Balance Is low.Saving Account Minimum balance should be 5000");
							}
						} else if (cc instanceof currentAcc) {
							if (cc.getbal() > 1000 && cc.getbal() > (1000 + k3)) {
								double b = cc.getbal() - k3;
								cc.setbal(b);
							} else {
								System.out.println(
										"Minimum Balance Is low.Current Account Minimum balance should be 1000");
							}
						}
					}
				}
				break;
			case 5:
				for (Customer cc : c) {
					if (cc instanceof savingAcc) {
						System.out.println("Saving Account DEtails");
						System.out.println(cc.toString());
					} else if (cc instanceof currentAcc) {
						System.out.println("Current Account DEtails");
						System.out.println(cc.toString());
					}
				}
				break;
			case 6:
				System.out.println("Enter Accout number:\n"); {
				double k1 = sc.nextDouble();
				for (Customer cc : c) {
					if (cc.getaccNo() == k1) {
						System.out.println(cc.toString());
					}
				}
			}
				break;

			case 7:
				return;
			}
		}

	}
}
