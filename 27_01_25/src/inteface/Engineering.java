package inteface;


public class Engineering implements College {

  
    @Override
    public void durationOfBoards() {
        System.out.println("Engineering course duration: 4 years");
    }

   
    public void placement() {
        System.out.println("Engineering placements: 100% placement opportunities available.");
    }


    @Override
    public void culturalActivities() {
        System.out.println("Engineering: Active participation in technical and cultural events.");
    }
}
