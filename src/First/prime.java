package First;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number: ");
//		
//		int no = sc.nextInt();
//		
//		if(isPrime(no)) {
//			System.out.println("Number is Prime");
//		}
//		else {
//			System.out.println("Number is Not Prime");
//		}
//		
//	}
	
//	public static boolean isPrime(int no) {
//		
//		if(no<=1) {
//			return false;
//		}
//		for(int i=2; i<Math.sqrt(no); i++) {
//			if(no%i==0) {
//				return false;
//			}
//		}
//		return true;
//	}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		
		int fno = sc.nextInt();
		
		System.out.println("Enter the Last number : ");
		
		int lno = sc.nextInt();
		
		for(int i=fno; i<=lno; i++) {
			if(isPrime(i)) {
				System.out.print(i+" ,");
			}
		}
	}		
		public static boolean isPrime(int n) {
			
			if(n<=1) {
				return false;
			}
			
			for(int i=2; i<=Math.sqrt(n); i++) {
				
				if(n%i==0) {
					return false;
				}
			}
		return true;
	}
}
