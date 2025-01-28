package abstractclass;

public class ShapeTest {
	 public static void main(String[] args) {
	    
	     Circle circle = new Circle("Circle", 5.0);
	     Square square = new Square("Square", 4.0);
	     Rectangle rectangle = new Rectangle("Rectangle", 6.0, 3.0);

	     circle.cal_area();
	     square.cal_area();
	     rectangle.cal_area();
	 }
	}
