package core_java;

import java.util.Scanner;

public class TicketBooking {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
  
        int[][] arr = new int[3][3];

        System.out.println("Initial seating arrangement: ");

        for(int i=0; i<3; i++) {
        	for(int j=0; j<3; j++) {
        		System.out.print(arr[i][j]);
        		
        	} System.out.println();
        } 
//        OR displaySeats(arr);

        while (true) {
            System.out.println("\nEnter the row and column number to book a seat (or enter -1 to exit): ");
            System.out.print("Row (0 to 2): ");
            int row = scan.nextInt();
            
            if (row == -1) break;  

            System.out.print("Column (0 to 2): ");
            int col = scan.nextInt();


            if (row >= 0 && row < 3 && col >= 0 && col < 3) {
                if (arr[row][col] == 0) {
                    arr[row][col] = 1;
                    System.out.println("Seat booked successfully.");
                } else {
                    System.out.println("Sorry, this seat is already booked.");
                }
            } else {
                System.out.println("Invalid seat position! Please try again.");
            }


            displaySeats(arr);
        }

        scan.close(); 
    }

    public static void displaySeats(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                // Display 'O' for available seats (0) and 'X' for booked seats (1)
            	if (arr[i][j] == 0) {
            	    System.out.print("O ");
            	} else {
            	    System.out.print("X ");
            	}

            }
            System.out.println(); 
        }
    }
}
