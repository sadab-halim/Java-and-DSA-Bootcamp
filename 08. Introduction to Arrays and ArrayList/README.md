```
public static void main(String[] args){
  //Q: store a roll no
  int a = 76;

  //Q: store 5 roll nos
  int rno1 = 23;
  int rno2 = 55;
  int rno3 = 18;

  //datatype[] variable_name = new data_type[size]
  //store 5 roll numbers

  int[] rnos = new int[5];
  // or directly
  int[] rnos = {23, 12, 45, 32, 15};
}
```

Array is a collection of similar data types.

**NOTE:**
- The data type represents the type of data store in the array
- All the of the data in the array should be same.

int[] arr; //declaration of array; ros is getting defined <br/>
arr = new int[5]; //initialization; here object is being created in the heap memory;

- **int[]** is datatype
- **arr** is reference variable
- **new** is used to create an object
- **new int[5]** is creating the object in heap memory
- **int[] arr** happens at the compile time
- **new int[5]** happens at the runtime; dynamic memory allocation

- Array objects are created in heap.
- Heap objects are not continuous.
- Dynamic Memory Allocation
- Array objects, internally, may not be continous, because it depends on JVM.

System.out.println(ros[1]);

String[] arr = new String[4];
System.out.println(arr[0]);

null cannot be assigned to any primitive data type <br/>
String str = null; <br/>
int num = null; // Error

## Internal working of object
String[] arr = new String[5];
- All the objects are stored in heap memory

**NOTE:**
- Strings are immutable in Java
- Arrays are mutable in Java