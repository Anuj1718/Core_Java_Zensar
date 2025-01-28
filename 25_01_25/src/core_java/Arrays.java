package core_java;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows for the first array: ");
        int rows1 = scanner.nextInt();
        System.out.println("Enter the number of columns for the first array: ");
        int cols1 = scanner.nextInt();

        System.out.println("Enter the number of rows for the second array: ");
        int rows2 = scanner.nextInt();
        System.out.println("Enter the number of columns for the second array: ");
        int cols2 = scanner.nextInt();


        if (cols1 != rows2) {
            System.out.println("Matrix multiplication is not possible. Columns of the first matrix must equal rows of the second matrix.");
            return;
        }
        
        int[][] array1 = new int[rows1][cols1];
        int[][] array2 = new int[rows2][cols2];
        int[][] sum = new int[rows1][cols1];
        int[][] product = new int[rows1][cols2];


        System.out.println("Enter elements for the first array:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                array1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nEnter elements for the second array:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                array2[i][j] = scanner.nextInt();
            }
        }
        if (rows1 == rows2 && cols1 == cols2) {
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols1; j++) {
                    sum[i][j] = array1[i][j] + array2[i][j];
                }
            }
        } else {
            System.out.println("\nAddition skipped as dimensions do not match.");
        }


        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                product[i][j] = 0;
                for (int k = 0; k < cols1; k++) { 
//                	Iterates over the common dimension, which is the number of columns in A (or rows in B).
                    product[i][j] += array1[i][k] * array2[k][j];
//					multiplies the kth element of the ith row of A with kth element of jth column of B
                }
            }
        }

        System.out.println("\nFirst Array:");
        printArray(array1);

        System.out.println("\nSecond Array:");
        printArray(array2);

        if (rows1 == rows2 && cols1 == cols2) {
            System.out.println("\nSum of the two arrays:");
            printArray(sum);
        }

        System.out.println("\nProduct of the two arrays:");
        printArray(product);

        scanner.close();
    }


    private static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
