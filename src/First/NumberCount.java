package First;

import java.util.Scanner;

public class NumberCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value : ");
		int no = sc.nextInt();
		int count = 0;
		int rem;
		for(int i=0; no!=0; i++) {
			
			rem = no % 10;
			no = no / 10;
			
			count++;
		}
		System.out.println(count);
	}

}
