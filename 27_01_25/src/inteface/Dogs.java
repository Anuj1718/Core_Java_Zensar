package inteface;

public class Dogs implements Animals {
    
    // Implementing makeASound() method for Dogs
    @Override
    public void makeASound() {
        System.out.println("Bark");
    }

    // Implementing move() method for Dogs
    @Override
    public void move() {
        System.out.println("The dog is running.");
    }
}
