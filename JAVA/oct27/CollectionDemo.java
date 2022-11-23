package oct27;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		Collection coll = new ArrayList();
		coll.add(123);
		coll.add("abc");
		coll.add(9090.50);
		System.out.println(coll);
		coll.remove("abc");
		System.out.println(coll);
	}


}
