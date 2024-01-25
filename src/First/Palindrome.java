package First;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value : ");
		
		int no = sc.nextInt();
		
		int rem;
		
		int rev=0;
		
		int pal = no; 
		
		for(int i=0; no!=0; i++) {
			
			rem = no%10;
			no = no/10;
			rev = rev*10+rem;
		}
//		System.out.println(rev);
//		System.out.println(pal);
		if(pal==rev){
			System.out.println("It is palindrome");
		}
		else {
			System.out.println("It is not Palindrome");
		}
	}

}
