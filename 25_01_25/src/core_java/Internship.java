package core_java;

import java.util.Scanner;

class Internship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int subjects = 6;
        int years = 4;

       
        int[][] marks = new int[years][subjects];

        
        int[] totalMarks = new int[years];

       
        for (int i = 0; i < years; i++) {
            System.out.println("Enter marks for Year " + (i + 1) + ":");
            totalMarks[i] = 0;
            for (int j = 0; j < subjects; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = scanner.nextInt();
                totalMarks[i] += marks[i][j]; 
            }
        }

        
        for (int i = 0; i < years; i++) {
            System.out.println("\nTotal marks for Year " + (i + 1) + ": " + totalMarks[i]);
            if (totalMarks[i] > 500) {
                System.out.println("Eligible for Internship in Year " + (i + 1));
            } else {
                System.out.println("Not eligible for Internship in Year " + (i + 1));
            }
        }

        scanner.close(); 
    }
}
