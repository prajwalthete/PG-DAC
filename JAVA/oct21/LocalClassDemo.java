package oct21;
//prg. to demo. local class

class Foo {
	void m1() {
		class Bar {
			void m2() {
				System.out.println("local");
			}
		}
		Bar b = new Bar();
		b.m2();
	}
}

class LocalClassDemo {
	public static void main(String args[]) {
		Foo f = new Foo();
		f.m1();

	}
}