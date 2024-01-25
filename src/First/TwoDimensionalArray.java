package First;

import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of value : ");
		
		int no = sc.nextInt();
		
		int array[][] = new int[no][no];
		
		System.out.println("Enter the elements : ");
		for(int i=0; i<no; i++) {
			for(int j=0; j<no; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Displaya the Element : ");
		for(int i=0; i<no; i++) {
			for(int j=0; j<no; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}

}
