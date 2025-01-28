package core_java;

import java.util.Scanner;

public class ArrayAss1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr;
		arr = new int[15];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter number " + (i + 1));
			arr[i] = scan.nextInt();
		}
		scan.close();
		
		int max = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max)
				max = arr[i];

		}
		System.out.println("Max number is : " + max);

	}
}