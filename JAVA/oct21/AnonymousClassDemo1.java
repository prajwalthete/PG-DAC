package oct21;
//prg. to demo. anonymous class

interface Talk1 {
	void sayHi();

	void sayHello();
}

class AnonymousClassDemo1 {
	public static void main(String args[]) {
		Talk1 t = new Talk1() {
			public void sayHi() {
				System.out.println("Hi");
			}

			public void sayHello() {
				System.out.println("Hello");
			}
		};
		t.sayHi();
		t.sayHello();
	}
}