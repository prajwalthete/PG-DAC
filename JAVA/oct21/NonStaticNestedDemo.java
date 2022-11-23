package oct21;
//prg. to demo. non static nested class

class Fooo {
	class Bar {
		void m1() {
			System.out.println("non static nested class");
		}
	}
}

class NonStaticNestedDemo {
	public static void main(String args[]) {
		Fooo f = new Fooo();
		Fooo.Bar ref = f.new Bar();
		ref.m1();

	}
}