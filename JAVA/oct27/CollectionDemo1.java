package oct27;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {

	public static void main(String[] args) {
		Collection coll = new ArrayList();
		coll.add(123);
		coll.add("abc");
		coll.add(9090.50);
		System.out.println(coll);

		Collection coll1 = new ArrayList();
		coll1.add(124);
		coll1.add("abc");
		coll1.add(9090.50);
		System.out.println(coll1);

		coll.addAll(coll1);
		System.out.println(coll);
		System.out.println(coll1);
	}

}
