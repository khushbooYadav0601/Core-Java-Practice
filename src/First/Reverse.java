package First;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value : ");
		int no = sc.nextInt();
		int rem;
		int rev=0;
		for(int i=0; no!=0; i++) {
			
			rem = no % 10;
//			System.out.println("Remainder : "+rem);
			no = no / 10;
//			System.out.println("Number : "+no);
			
			rev = rev*10+rem;
		}
		System.out.println("Reverse Number is : "+rev);
		
	}	
		
	

}
