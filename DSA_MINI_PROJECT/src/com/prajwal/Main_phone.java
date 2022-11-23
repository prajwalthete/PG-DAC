package com.prajwal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;
import java.io.IOException;

public class Main_phone {
	private static Scanner scn;

	public static Stack<Person> recent = new Stack<Person>();
	public static ArrayList<Person> recentList = new ArrayList<Person>();
	public static ArrayList<Person> phone;
	public static ArrayList<Person> fav = new ArrayList<Person>();

	public static void main(String[] args) throws IOException {

		scn = new Scanner(System.in);
		phone = new ArrayList<Person>();

		boolean yes = true;
		while (yes) {
			System.out.println("|========Welcome to Phone========|");
			System.out.println("1. View Contact");
			System.out.println("2. Make A Call ");
			System.out.println("3. Recent Calls ");
			System.out.println("4. Favourites Menu");
			System.out.println("5. Exit Application ");
			int n = scn.nextInt();
			switch (n) {

			case 1:
				boolean flag = true;
				while (flag) {
					System.out.println("\n|=====Phone Directory=====|");
					System.out.println("1. Add Contact ");
					System.out.println("2. View All Contact ");
					System.out.println("3. Delete Contact ");
					System.out.println("4. Search Contact ");
					System.out.println("5. Update Details ");
					System.out.println("6. Back ");

					int s = scn.nextInt();
					switch (s) {
					case 1:
						AddContact();
						break;
					case 2:
						Display();
						break;
					case 3:
						Delete();
						break;
					case 4:
						Search();
						break;
					case 5:
						Update_Details();
						break;
					case 6:
						flag = false;
						break;
					default:
						System.out.println("Enter proper input");
						break;
					}
				}
				break;

			case 2:
				boolean flag3 = true;
				while (flag3) {
					System.out.println("\n|=====Make call=====|");
					System.out.println("1. View Contact list First");
					System.out.println("2. Make call ");
					System.out.println("3. Back ");

					int s3 = scn.nextInt();
					switch (s3) {
					case 1:
						Display();
						break;
					case 2:
						MakeCall();
						break;
					case 3:
						flag3 = false;
						break;
					default:
						System.out.println("Enter proper input");
						break;
					}
				}
				break;

			case 3:
				boolean flag1 = true;
				while (flag1) {
					System.out.println("\n|=====Recent Calls=====|");
					System.out.println("1. View Recent Called ");
					System.out.println("2. Delete Recent Contact ");
					System.out.println("3. Back ");

					int s1 = scn.nextInt();
					switch (s1) {
					case 1:
						DisplayRecent();
						break;
					case 2:
						DeleteRecent();
						break;
					case 3:
						flag1 = false;
						break;
					default:
						System.out.println("Enter proper input");
						break;
					}
				}
				System.out.println("Working on it");
				break;

			case 4:
				boolean flag2 = true;
				while (flag2) {
					System.out.println("\n|=====Favourite=====|");
					System.out.println("1. Add to Favourite ");
					System.out.println("2. Display Favourite ");
					System.out.println("3. Delete From Favourite ");
					System.out.println("4. Back  ");

					int s2 = scn.nextInt();
					switch (s2) {
					case 1:
						Add_fav();
						break;
					case 2:
						Displayfav();
						break;
					case 3:
						Deletefav();
						break;
					case 4:
						flag2 = false;
					default:
						System.out.println("Enter proper input");
						break;
					}
				}
				break;

			case 5:
				yes = false;
				System.out.println("Bye");
				break;
			}
		}
	}

	public static void AddContact() {
		System.out.println("Enter the first name");
		String first_name = scn.next();
		System.out.println("Enter the last name");
		String last_name = scn.next();
		System.out.println("Enter the Phone Number");
		String number1 = scn.next();
		System.out.println("Enter the Email Address");
		String email = scn.next();
		System.out.println("Enter the Address");
		String address = scn.next();
		phone.add(new Person(first_name, last_name, number1, email, address));
	}

	public static void Display() {
		Collections.sort(phone, (p1, p2) -> p1.getfirst_name().compareTo(p2.getfirst_name()));
		System.out.println("|-----Name-----|" + "|---Number---|" + "|----Email---| " + "|---Address---| ");
		for (Person p : phone) {
			System.out.println(p);
		}
	}

	public static void Displayfav() {
		Collections.sort(fav, (p1, p2) -> p1.getfirst_name().compareTo(p2.getfirst_name()));
		System.out.println(" :: Favorite Contacts :: ");
		System.out.println("|-----Name-----|" + "|---Number---|" + "|----Email---| " + "|---Address---| ");
		for (Person f : fav) {
			System.out.println(f);
		}
	}

	public static void Delete() {
		System.out.println("Enter the contact name want to delete");
		String firstname = scn.next();
		String lastname = scn.next();
		boolean b = false;
		Person x = new Person();
		for (Person p : phone) {
			if (p.getfirst_name().contains(firstname) && p.getlast_name().contains(lastname)) {
				b = true;
				x = p;
				break;
			}
		}
		if (b) {
			phone.remove(x);
		} else {
			System.out.println("Record Not Found");
		}

	}

	public static void Deletefav() {
		System.out.println("Enter the contact name want to delete");
		String firstname = scn.next();
		String lastname = scn.next();
		boolean b = false;
		Person x = new Person();
		for (Person f : fav) {
			if (f.getfirst_name().contains(firstname) && f.getlast_name().contains(lastname)) {
				b = true;
				x = f;
				break;
			}
		}
		if (b) {
			fav.remove(x);
		} else {
			System.out.println("Record Not Found");
		}

	}

	public static void DeleteRecent() {
		System.out.println("Enter the contact name want to delete");
		String firstname = scn.next();
		String lastname = scn.next();
		boolean b = false;
		Person x = new Person();
		for (Person f : recentList) {
			if (f.getfirst_name().contains(firstname) && f.getlast_name().contains(lastname)) {
				b = true;
				x = f;
				break;
			}
		}
		if (b) {
			recentList.remove(x);
		} else {
			System.out.println("Record Not Found");
		}
	}

	public static void Search() {
		System.out.println("Enter the firstname to find");
		String name = scn.next();
		boolean b = true;
		for (Person p : phone) {
			if (p.getfirst_name().contains(name)) {
				b = false;
				System.out.println(p);
			}
		}
		if (b) {
			System.out.println("Record Not Found");
		}
	}

	public static void Add_fav() {
		System.out.println("Enter the firstname to add into favourite");
		String name = scn.next();
		boolean v = true;
		for (Person p : phone) {
			if (p.getfirst_name().contains(name)) {
				v = false;
				fav.add(p);
			}
		}
		if (v) {
			System.out.println("Reccord Not found");
		}

	}

	public static void Update_Details() {
		System.out.println("Enter the firstname to update the details");
		String name = scn.next();
		boolean v = true;
		for (Person p : phone) {
			if (p.getfirst_name().contains(name)) {
				v = false;
				System.out.println("Enter the number for update");
				String number1 = scn.next();
				System.out.println("Enter the email for update");
				String email = scn.next();
				System.out.println("Enter the address for update");
				String address = scn.next();
				p.setnumber(number1);
				p.setemail(email);
				p.setaddress(address);
			}
		}
		if (v) {
			System.out.println("the given name Record Not found");
		}
	}

	public static void MakeCall() {
		System.out.println("Enter the firstname and lastname to make a call");
		String firstname = scn.next();
		String lastname = scn.next();
		boolean b = false;
		for (Person f : phone) {
			if (f.getfirst_name().contains(firstname) && f.getlast_name().contains(lastname)) {
				b = true;
				recent.push(f);
				break;
			}
		}
		if (!b) {
			System.out.println("Not found");
		} else {
			System.out.println("Calling " + firstname + ".......");
			System.out.println(".\n.\n.\n.\n");
			System.out.println("Call Ended");
		}

	}

	public static void DisplayRecent() {
		System.out.println("|-----Name-----|" + "|---Number---|" + "|----Email---| " + "|---Address---| ");
		while (!recent.empty()) {
			System.out.println(recent.peek());
			recentList.add(recent.pop());
		}
	}

	public static void DisplayHistory() {
		Collections.sort(recentList, (p1, p2) -> p1.getfirst_name().compareTo(p2.getfirst_name()));
		Collections.sort(recentList, Collections.reverseOrder());
		System.out.println("|-----Name-----|" + "|---Number---|" + "|----Email---| " + "|---Address---| ");
		for (Person p : recentList) {
			System.out.println(p);
		}
	}

}

class Person {

	private String first_name;
	private String last_name;
	private String number;
	private String email;
	private String address;

	public Person() {
	}

	public Person(String first_name, String last_name, String number, String email, String address) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.number = number;
		this.email = email;
		this.address = address;
	}

	public void setfirst_name(String first_name) {
		this.first_name = first_name;
	}

	public void setlast_name(String last_name) {
		this.last_name = last_name;
	}

	public void setnumber(String number) {
		this.number = number;
	}

	public void setemail(String email) {
		this.email = email;
	}

	public void setaddress(String address) {
		this.address = address;
	}

	public String getfirst_name() {
		return first_name;
	}

	public String getlast_name() {
		return last_name;
	}

	public String getnumber() {
		return number;
	}

	public String getemail() {
		return email;
	}

	public String getaddress() {
		return address;
	}

	@Override
	public String toString() {
		return ("| " + first_name + " " + last_name + " || " + number + " || " + email + " || " + address + "| ");
	}
}
