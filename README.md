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
<img src = "/images/Hierachy-Collection-Framework.png" width = "800px"> 

- **Class:** is a user-defined blueprint or prototype from which objects are created. It represents the set of properties or methods that are common to all objects of one type.
- **Interface:** Like a class, an interface can have methods and variables, but the methods declared in an interface are by default abstract (only method signature, no body). Interfaces specify what a class must do and not how. It is the blueprint of the class.

### Methods of the Collection Interface
This interface contains various methods which can be directly used by all the collections which implement this interface.

| Method | Description |
| ------ | ----------- |
| add(Object) | This method is used to add an object to the collection. |
| addAll(Collection c) | This method adds all the elements in the given collection to this collection. |
| clear() | This method removes all of the elements from this collection. |
| contains(Object o) | This method returns true if the collection contains the specified element. |
| containsAll(Collection c) | This method returns true if the collection contains all of the elements in the given collection. |
| equals(Object o) | This method compares the specified object with this collection for equality. |
| hashCode() | This method is used to return the hash code value for this collection. |
| isEmpty() | This method returns true if this collection contains no elements. |
| iterator() | This method returns an iterator over the elements in this collection. |
| max() | This method is used to return the maximum value present in the collection. |
| parallelStream() | This method returns a parallel Stream with this collection as its source. |
| remove(Object o) | This method is used to remove the given object from the collection. If there are duplicate values, then this method removes the first occurrence of the object. |
| removeAll(Collection c) | This method is used to remove all the objects mentioned in the given collection from the collection. |
| removeIf(Predicate filter) | This method is used to remove all the elements of this collection that satisfy the given predicate. |
| retainAll(Collection c) | This method is used to retain only the elements in this collection that are contained in the specified collection. |
| size() | This method is used to return the number of elements in the collection. |
| spliterator() | This method is used to create a SplThis method is used to return a sequential Stream with this collection as its source.iterator over the elements in this collection. |
| stream() |  This method is used to return a sequential Stream with this collection as its source. |
| toArray() | This method is used to return an array containing all of the elements in this collection. |

### Interfaces that extend the Collections Interface
The collection framework contains multiple interfaces where every interface is used to store a specific type of data.
The following are the interfaces present in the framework. 

1. **Iterable Interface:** This is the root interface for the entire collection framework. The collection interface extends the iterable interface. Therefore, inherently, all the interfaces and classes implement this interface. The main functionality of this interface is to provide an iterator for the collections. Therefore, this interface contains only one abstract method which is the iterator. It returns the `Iterator iterator();`

2. **Collection Interface:** This interface extends the iterable interface and is implemented by all the classes in the collection framework. This interface contains all the basic methods which every collection has like adding the data into the collection, removing the data, clearing the data, etc.

3. **List Interface:** This is a child interface of the collection interface. This interface is dedicated to the data of the list type in which we can store all the ordered collection of the objects. This also allows duplicate data to be present in it. This list interface is implemented by various classes like ArrayList, Vector, Stack, etc

```
List <T> al = new ArrayList<> (); 
List <T> ll = new LinkedList<> (); 
List <T> v = new Vector<> (); 

//Where T is the type of the object 
```

### ArrayList
- ArrayList: ArrayList provides us with dynamic arrays in Java. 
- Though, it may be slower than standard arrays but can be helpful in programs where lots of manipulation in the array is needed. 
- The size of an ArrayList is increased automatically if the collection grows or shrinks if the objects are removed from the collection. 
- Java ArrayList allows us to randomly access the list. 
- ArrayList can not be used for primitive types, like int, char, etc. We will need a wrapper class for such cases.

```
// Java program to demonstrate the
// working of ArrayList
import java.io.*;
import java.util.*;

class GFG {
	
	// Main Method
	public static void main(String[] args)
	{

		// Declaring the ArrayList with
		// initial size n
		ArrayList<Integer> al = new ArrayList<Integer>();

		// Appending new elements at
		// the end of the list
		for (int i = 1; i <= 5; i++)
			al.add(i);

		// Printing elements
		System.out.println(al);

		// Remove element at index 3
		al.remove(3);

		// Displaying the ArrayList
		// after deletion
		System.out.println(al);

		// Printing elements one by one
		for (int i = 0; i < al.size(); i++)
			System.out.print(al.get(i) + " ");
	}
}
```

For more info, click here.

### LinkedList
- LinkedList class is an implementation of the LinkedList data structure which is a linear data structure where the elements are not stored in contiguous locations and every element is a separate object with a data part and address part. 
- The elements are linked using pointers and addresses. Each element is known as a node. 

```
// Java program to demonstrate the
// working of LinkedList
import java.io.*;
import java.util.*;

class GFG {
	
	// Main Method
	public static void main(String[] args)
	{

		// Declaring the LinkedList
		LinkedList<Integer> ll = new LinkedList<Integer>();

		// Appending new elements at
		// the end of the list
		for (int i = 1; i <= 5; i++)
			ll.add(i);

		// Printing elements
		System.out.println(ll);

		// Remove element at index 3
		ll.remove(3);

		// Displaying the List
		// after deletion
		System.out.println(ll);

		// Printing elements one by one
		for (int i = 0; i < ll.size(); i++)
			System.out.print(ll.get(i) + " ");
	}
}
```

### Vector
- A vector provides us with dynamic arrays in Java. 
- Though, it may be slower than standard arrays but can be helpful in programs where lots of manipulation in the array is needed. 
- This is identical to ArrayList in terms of implementation. 
- However, the primary difference between a vector and an ArrayList is that a Vector is synchronized and an ArrayList is non-synchronized

```
// Java program to demonstrate the
// working of Vector
import java.io.*;
import java.util.*;

class GFG {
	
	// Main Method
	public static void main(String[] args)
	{

		// Declaring the Vector
		Vector<Integer> v = new Vector<Integer>();

		// Appending new elements at
		// the end of the list
		for (int i = 1; i <= 5; i++)
			v.add(i);

		// Printing elements
		System.out.println(v);

		// Remove element at index 3
		v.remove(3);

		// Displaying the Vector
		// after deletion
		System.out.println(v);

		// Printing elements one by one
		for (int i = 0; i < v.size(); i++)
			System.out.print(v.get(i) + " ");
	}
}
```

### Stack
- Stack class models and implements the Stack data structure. 
- The class is based on the basic principle of LIFO. 
- In addition to the basic push and pop operations, the class provides three more functions of empty, search and peek. 
- The class can also be referred to as the subclass of Vector.

```
// Java program to demonstrate the
// working of a stack
import java.util.*;
public class GFG {
	
	// Main Method
	public static void main(String args[])
	{
		Stack<String> stack = new Stack<String>();
		stack.push("Geeks");
		stack.push("For");
		stack.push("Geeks");
		stack.push("Geeks");

		// Iterator for the stack
		Iterator<String> itr = stack.iterator();

		// Printing the stack
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

		System.out.println();

		stack.pop();

		// Iterator for the stack
		itr = stack.iterator();

		// Printing the stack
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}
}
```

### Queue Interface
- As the name suggests, a queue interface maintains the FIFO(First In First Out) order similar to a real-world queue line. 
- This interface is dedicated to storing all the elements where the order of the elements matter.
- There are various classes like PriorityQueue, ArrayDeque, etc. 
- Since all these subclasses implement the queue, we can instantiate a queue object with any of these classes

```
Queue <T> pq = new PriorityQueue<> (); 
Queue <T> ad = new ArrayDeque<> ();

Where T is the type of the object.  
```

#### PriorityQueue
- A PriorityQueue is used when the objects are supposed to be processed based on the priority. 
- It is known that a queue follows the First-In-First-Out algorithm, but sometimes the elements of the queue are needed to be processed according to the priority and this class is used in these cases. 
- The PriorityQueue is based on the priority heap. The elements of the priority queue are ordered according to the natural ordering, or by a Comparator provided at queue construction time, depending on which constructor is used.

```
// Java program to demonstrate the working of
// priority queue in Java
import java.util.*;

class GfG {
	
	// Main Method
	public static void main(String args[])
	{
		// Creating empty priority queue
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

		// Adding items to the pQueue using add()
		pQueue.add(10);
		pQueue.add(20);
		pQueue.add(15);

		// Printing the top element of PriorityQueue
		System.out.println(pQueue.peek());

		// Printing the top element and removing it
		// from the PriorityQueue container
		System.out.println(pQueue.poll());

		// Printing the top element again
		System.out.println(pQueue.peek());
	}
}
```

### Deque
- This is a very slight variation of the queue data structure. 
- Deque, also known as a double-ended queue, is a data structure where we can add and remove the elements from both ends of the queue. 
- This interface extends the queue interface. The class which implements this interface is ArrayDeque. 
- Since, ArrayDeque class implements the Deque interface, we can instantiate a deque object with this class.

```
Deque<T> ad = new ArrayDeque<> (); 
Where T is the type of the object.  
```

### ArrayDeque
- ArrayDeque class which is implemented in the collection framework provides us with a way to apply resizable-array. 
- This is a special kind of array that grows and allows users to add or remove an element from both sides of the queue. 
- Array deques have no capacity restrictions and they grow as necessary to support usage.

```
// Java program to demonstrate the
// ArrayDeque class in Java

import java.util.*;
public class ArrayDequeDemo {
	public static void main(String[] args)
	{
		// Initializing an deque
		ArrayDeque<Integer> de_que = new ArrayDeque<Integer>(10);

		// add() method to insert
		de_que.add(10);
		de_que.add(20);
		de_que.add(30);
		de_que.add(40);
		de_que.add(50);

		System.out.println(de_que);

		// clear() method
		de_que.clear();

		// addFirst() method to insert the
		// elements at the head
		de_que.addFirst(564);
		de_que.addFirst(291);

		// addLast() method to insert the
		// elements at the tail
		de_que.addLast(24);
		de_que.addLast(14);

		System.out.println(de_que);
	}
}
```

