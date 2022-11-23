package oct21;
//prg. to demo. static nested class

class Fool {
	static class Bar {
		void m1() {
			System.out.println("static nested class");
		}
	}
}

class StaticNestedDemo {
	public static void main(String args[]) {
		Fool.Bar ref = new Fool.Bar();
		ref.m1();

	}
}