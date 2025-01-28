package core_java;

public class Static_Demo {
	static int Count = 0;

	public Static_Demo() {
		Count++;
	}
	
	public void Display() {
		
		System.out.println("Number of objects created: " + Count);
	}
	public static void main(String[] args) {
		
		Static_Demo ob1 = new Static_Demo();
		ob1.Display();
		
		Static_Demo ob2 = new Static_Demo();
		ob2.Display();
		
		Static_Demo ob3 = new Static_Demo();
		ob3.Display();
		
		Static_Demo ob4 = new Static_Demo();
		ob4.Display();
		
		
		
	}
} 

//Number of objects created: 1
//Number of objects created: 2
//Number of objects created: 3
//Number of objects created: 4

//If it were,  int Count = 0;
//
//Number of objects created: 1
//Number of objects created: 1
//Number of objects created: 1
//Number of objects created: 1


//
//In your code, the reason Count is printed as 1 when you change static int Count = 0; to int Count = 0; is because of the difference between instance variables and static variables in Java.
//
//Key Differences:
//	
//Static Variables:
//When you declare a variable as static (e.g., static int Count), it means the variable is shared by all instances of the class.
//The static variable is not tied to any specific instance (object) of the class but to the class itself.
//The value of Count is shared across all objects, meaning when one object modifies it, all other objects see the updated value.
//
//Instance Variables:
//When you declare a variable without the static keyword (e.g., int Count), it becomes an instance variable.
//Each object (instance) of the class will have its own copy of that variable.
//Changes made to the Count variable in one object won't affect the Count variable in another object.
//
//In your code:
//When you use static int Count, the Count variable is shared among all instances of the Static_Demo class. This means every time you create a new Static_Demo object, the Count variable is incremented, and all objects can access the same value.
//When you remove static and just declare int Count = 0;, each object gets its own instance of the Count variable. So, every time you create a new object, the Count variable is initialized to 0 for that specific object. It is not shared, and it does not keep track of the total number of objects created.
//
//Static variable (Class variable) will only get initialized once
// Static block will only execute once ,Instance block will execute every time (no need to write keyword)

//Static is useful when you need to keep counter
//When you need reinitialization, use instance
