package inteface;

public class Cats implements Animals {
    
    // Implementing makeASound() method
    @Override
    public void makeASound() {
        System.out.println("Meow");
    }

    // Implementing move() method
    @Override
    public void move() {
        System.out.println("The cat is walking.");
    }
    
    public static void main(String[] args) {
        // Creating an object of Cats
        Cats cat = new Cats();
        
        // Calling methods
        cat.makeASound(); // Output: Meow
        cat.move(); // Output: The cat is walking.
        
        // Creating an object of Dogs
        Dogs dog = new Dogs();
        
        // Calling methods for dog
        dog.makeASound(); // Output: Bark
        dog.move(); // Output: The dog is running.
    }
}
