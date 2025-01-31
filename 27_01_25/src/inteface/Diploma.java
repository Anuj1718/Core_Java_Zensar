package inteface;

public class Diploma implements College {

   
    @Override
    public void durationOfBoards() {
        System.out.println("Diploma course duration: 2 years");
    }

    @Override
    public void placement() {
        System.out.println("Diploma placements: Placement depends upon individual efforts.");
    }

    @Override
    public void culturalActivities() {
        System.out.println("Diploma: Limited cultural activities compared to degree courses.");
    }
}
