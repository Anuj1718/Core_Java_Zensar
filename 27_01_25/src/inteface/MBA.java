package inteface;

public class MBA implements College {

 
    @Override
    public void durationOfBoards() {
        System.out.println("MBA course duration: 3 years");
    }

    @Override
    public void placement() {
        System.out.println("MBA placements: Placement-oriented with good opportunities.");
    }

    @Override
    public void culturalActivities() {
        System.out.println("MBA: Regular cultural and professional networking events.");
    }
}
