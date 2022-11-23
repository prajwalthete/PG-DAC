package oct27;

import java.util.ArrayList;
import java.util.ListIterator;

public class CollectionDemo10 {

	public static void main(String[] args) {
		ArrayList<Integer> coll = new ArrayList<>();
		coll.add(21);
		coll.add(45);
		coll.add(13);
		coll.add(12);
		// traversing using ListIterator
		ListIterator<Integer> it = coll.listIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
//			it.remove();
//			it.add(77);
			it.set(77);
		}
		System.out.println(coll);

	}

}
