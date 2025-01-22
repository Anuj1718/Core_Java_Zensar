package core_java;

class StaticvsInstance1 {
    static int count = 0; // Static variable shared across all objects

    void increment() {
        count++; // Increment the static variable
    }

    void displayCount() {
        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {
        // Create first object
        StaticvsInstance1 obj1 = new StaticvsInstance1();
        obj1.increment();
        obj1.displayCount(); // Output: Count: 1

        // Create second object
        StaticvsInstance1 obj2 = new StaticvsInstance1();
        obj2.increment();
        obj2.displayCount(); // Output: Count: 2

        // Accessing static variable without creating an object
        System.out.println("Accessing count directly: " + StaticvsInstance1.count); // Output: 2
    }
}


//Key Takeaway:
	
//Static variables are shared memory for all instances of the class. Changes made to a static variable by one object are reflected when accessed by any other object or directly via the class.