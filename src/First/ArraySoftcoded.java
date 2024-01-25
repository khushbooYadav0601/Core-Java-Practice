package First;

import java.util.Scanner;

public class ArraySoftcoded {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element : ");
		int no = sc.nextInt();
		
		int array[] = new int[no];
		
		System.out.println("Enter the value : ");
		
		for(int i=0; i<no; i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.println("The array elements are : ");
		
		for(int i=0; i<no; i++) {
			System.out.println(array[i]);
		}
		
	}

}
