/* Primitive Data types : 
	Basic, predefined types provided by the language
	int, float, char, boolean, byte, short, long, double
	Memory is allocated on the stack.
	Stores the actual value
	Fixed size (depends on the type).
	Initialized to default values like 0, 0.0, false, etc.
	No methods or built-in functionalities.
	Immutable values.
	Faster
	
Non-Primitive Data Types: 
	Custom or derived types created by users or provided in libraries.
	Arrays, Strings, Classes, Interfaces, Objects, etc.
	Memory is allocated on the heap.
	Stores references (memory addresses) to objects.
	Size varies as it depends on the object.
	Initialized to null unless explicitly assigned.
	Have built-in methods (e.g., .length for arrays, .toLowerCase() for strings).
	Mutable or immutable, depending on the type
	Slower
	*/



package core_java;

public class Arrays_Demo {


	public static void main(String[] args)
    {

        // initializing array
        int[] arr = { 1, 2, 3, 4, 5 };

        // size of array
        int n = arr.length;

        // traversing array
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
