/*
Assignment Q4
Q69. Write a program to store your shopping details in a binary file(shopping.dat)
with information itemName, price, quantity. (Use ObjectOutputStream to store
Item class object).

*/

package fileassignment;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
    String itemName;
    int price;
    int quantity;

    public Person(String itemName, int price, int quantity) {
        super();
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "[ItemName=" + itemName + ", Price=" + price + ", Quantity=" + quantity + "]";
    }
}

public class Ab4 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try (FileOutputStream fos = new FileOutputStream("E:\\DAC KOCHI\\ABC\\shopping.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            Person f = new Person("Bag", 2000, 50);
            oos.writeObject(f);
        }
        System.out.println("done");
    }
}