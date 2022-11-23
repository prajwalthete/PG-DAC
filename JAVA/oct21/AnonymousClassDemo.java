package oct21;
//prg. to demo. anonymous class

interface Talk {
	void sayHi();

	void sayHello();
}

class Action implements Talk { // created subclass
	public void sayHi() {
		System.out.println("Hi");
	}

	public void sayHello() {
		System.out.println("Hello");
	}
}

class AnonymousClassDemo {
	public static void main(String args[]) {
		Talk t = new Action(); // sub class object
		t.sayHi();
		t.sayHello();

	}
}