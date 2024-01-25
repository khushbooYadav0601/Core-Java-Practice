package First;

import java.util.Scanner;

public class ArrayFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int a[] = {0, 2, 3, 4, 5};
//
//		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//		
//		System.out.println(a[1]);
//		System.out.println(cars[3]);
//		System.out.println(a.length);
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the dimensions of the 3D array (x, y, z): ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        // Create a 3D array with dimensions x, y, and z
        int[][][] array3D = new int[x][y][z];

        // Take user input for array elements
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    System.out.print("Enter the element at position (" + i + ", " + j + ", " + k + "): ");
                    array3D[i][j][k] = scanner.nextInt();
                }
            }
        }

        // Display the 3D array
        System.out.println("The 3D array you entered is:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    System.out.println("Element at position (" + i + ", " + j + ", " + k + "): " + array3D[i][j][k]);
                }
            }
        }
	}

}
