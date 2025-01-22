package core_java;

public class MaxofThreeNum {

int no1, no2, no3;
	
	void MaxofThree() {
		no1 = 60;
		no2 = 50;
		no3 = 80;
		
		if(no1>no2 && no1>no3) {
			System.out.println(no1 + " is the largest number");
		}
		
		else if( no2> no3 && no2>no1){
			System.out.println(no2 + " is the largest number");
		}
		
		else{
			System.out.println(no3 + " is the largest");
		}
	}
	public static void main(String[] args) {
	
		MaxofThreeNum ob1 = new MaxofThreeNum();
		ob1.MaxofThree();

	}

}
