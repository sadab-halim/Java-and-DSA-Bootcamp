# OOPS In Java

## Collections in Java
### Introduction
- Any group of individual objects which are represented as a single unit is known as the collection of the objects.
- In Java, a separate framework named the “Collection Framework” has been defined which holds all the collection classes and interface in it.
- The Collection interface **(java.util.Collection)** and Map interface **(java.util.Map)** are the two main “root” interfaces of Java collection classes.

### Framework
A framework is a set of classes and interfaces which provide a ready-made architecture. In order to implement a new feature or a class, there is no need to define a framework.

### Need for a Separate Collection Framework
- Before the Collection Framework(or before JDK 1.2) was introduced, the standard methods for grouping Java objects (or collections) were Arrays or Vectors, or Hashtables. 
- All of these collections had no common interface.

```
// Java program to demonstrate
// why collection framework was needed
import java.io.*;
import java.util.*;

class CollectionDemo {

	public static void main(String[] args)
	{
		// Creating instances of the array,
		// vector and hashtable
		int arr[] = new int[] { 1, 2, 3, 4 };
		Vector<Integer> v = new Vector();
		Hashtable<Integer, String> h = new Hashtable();

		// Adding the elements into the
		// vector
		v.addElement(1);
		v.addElement(2);

		// Adding the element into the
		// hashtable
		h.put(1, "geeks");
		h.put(2, "4geeks");

		// Array instance creation requires [],
		// while Vector and hastable require ()
		// Vector element insertion requires addElement(),
		// but hashtable element insertion requires put()

		// Accessing the first element of the
		// array, vector and hashtable
		System.out.println(arr[0]);
		System.out.println(v.elementAt(0));
		System.out.println(h.get(1));

		// Array elements are accessed using [],
		// vector elements using elementAt()
		// and hashtable elements using get()
	}
}
```

- As we can observe, none of these collections(Array, Vector, or Hashtable) implements a standard member access interface, it was very difficult for programmers to write algorithms that can work for all kinds of Collections. 
- Another drawback is that most of the ‘Vector’ methods are final, meaning we cannot extend the ’Vector’ class to implement a similar kind of Collection. 
- Therefore, Java developers decided to come up with a common interface to deal with the above-mentioned problems and introduced the Collection Framework

**Advantages of the Collection Framework:**
- Consistent API
- Reduces Programming Effort
- Increases program speed and quality

### Hierarchy of the Collection Framework
<img src = "../images/Hierachy-Collection-Framework.png" width = "700px">