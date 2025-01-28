package abstractclass;


public class EmployeeMain {
	public static void main(String[] args) {
		SalariedEmployee salemp = new SalariedEmployee("Anuj", 17, 2000000);
		HourlyEmployee houemp = new HourlyEmployee("Kenny", 18, 2000, 500);
		
		salemp.calculatePay();
		salemp.displayDetails();
		
		houemp.calculatePay();
		houemp.displayDetails();
		
		
	}
}


