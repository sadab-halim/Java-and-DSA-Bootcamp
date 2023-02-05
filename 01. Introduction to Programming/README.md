# Introduction to Programming - Types of Language, Memory Management

## Types of Languages
- Procedural
- Functional
- Object Oriented

## Procedural
- Specifies a series of well-structured steps and procedures to compose a program.
- Contains a systenatic order of statement, functions and commands to complete a task.

## Functional
- Writing a program only in functions i.e., never modfiy variables, but only create new ones as an output.
- Used in situations where we have to perform lots of different operations on the same set of data, like ML.
- First class functions/

## Object Oriented
- Revolves around objects
- Code + Data = Object
- Developed to make it easier to develop, debug, reuse and maintain software.

## Static vs Dynamic Languages
### Static
- Perform type checking at compile time
- Errors will show at compile time
- Declare datatype before you use it
- More control

### Dynamic
- Perform type checking at runtime
- Error might not show till program is run
- No need to declare datatype of variables
- Saves time in writing code but might give error at runtime

There are **Two Types of Memory**: Stack and Heap

*For Example*: `a = 10` ; a is ref *variable*, 10 is *object* <br/>

a is in the *stack memory* and its pointing to 10 which is residing in the *heap memory*.

**NOTE**:
- More than one reference variable can point to the same object.
- If any of the references change the object, original object is going to be changed for all.

## Garbage Collection
- Object with no reference variable, this will be removed fromn the memory when Garbage Collection hits
- `Garbage Collections` : Objects that do not have reference variable pointing towards them, in that case all the variables which are not pointing to that object, will be removed from the memory.

