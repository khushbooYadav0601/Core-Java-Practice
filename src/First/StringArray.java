package First;

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of line You want to enter : ");
		int no = sc.nextInt();
		
		sc.nextLine(); // Consume the newline character left in the buffer
		
		String str[] = new String[no];
		
		for(int i=0; i<no; i++) {
			str[i] = sc.nextLine();
		}
		
		for(int i=0; i<no; i++) {
			System.out.println(str[i]);
		}
		
		
	}

}
