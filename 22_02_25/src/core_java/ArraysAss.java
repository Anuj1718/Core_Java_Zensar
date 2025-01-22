package core_java;

import java.util.Scanner;

public class ArraysAss {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr;
		arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Insert the marks of student " + (i + 1));
			arr[i] = scan.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 60)
				System.out
						.println("Student with marks greater than 60 is student " + (i + 1) + " with marks " + arr[i]);

		}
		scan.close();
	}

}
