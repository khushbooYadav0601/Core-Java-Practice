package First;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of rows : ");
		int no = sc.nextInt();
				
//		for(int i=0; i<no; i++) {
//			for(int j=0; j<no; j++) {
//				System.out.print(" * ");
//			}
//			System.out.println();
//		}
		
//		for(int i = no; i>=0; i--) {
//			for(int j=0 ; j<i; j++) {
//				System.out.print(" * ");
//			}
//			System.out.println();
//		}
		
//		for(int i = 0; i<=no; i++) {
//			for(int j=0; j<=i; j++) {
//				System.out.print(" * ");
//			}
//			System.out.println();
//		}
		
//		for(int i =0; i<=no; i++) {
//			for(int j=no; j>=0; j--) {
//				if(i<j) {
//					System.out.print("   ");
//				}
//				else {
//					System.out.print(" * ");
//				}
//			}
//			System.out.println();
//		}
		
		for(int i=1; i<=no; i++) {
			for(int j=no; j>0; j--) {
				if(i<j) {
					System.out.print("  ");
				}
				else {
					System.out.print(" *  ");
				}	
			}
			System.out.println();
		}
		
//		for(int i=0; i<=no; i++) {
//			for(int j=0; j<= no; j++) {
//				if(j>=i) {
//					System.out.print(" * ");
//				}
//				else {
//					System.out.print("   ");
//				}	
//			}
//			System.out.println();
//		}
		
//		for(int i=0; i<=no; i++) {
//			for(int j=0; j<= no; j++) {
//				if(j>=i) {
//					System.out.print("* ");
//				}
//				else {
//					System.out.print(" ");
//				}	
//			}
//			System.out.println();
//		}
		
//		for(int i =1; i<=no; i++) {
//			for(int j = no; j>=1; j--) {
//				if(i==j) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print("    ");
//				}
//			}
//			for(int j = 1; j<=no; j++) {
//				if(i==j) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print("    ");
//				}
//			}
//			System.out.println();
//		}
//		for(int i=no-1; i>=1; i--) {
//			for(int j=no; j>=1; j--) {
//				if(j==i) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print("    ");
//				}	
//			}
//			for(int j=1; j<=no-1; j++) {
//				if(i==j) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print("    ");
//				}
//			}
//			System.out.println();
//		}
		
//		for(int i=1; i<=no; i++) {
//			for(int j=1; j<=no; j++) {
//				if(i==1 || j==1 || i==no || j==no) {
//					System.out.print(" *");
//				}
//				else{
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		
//		for(int i=0; i<=no; i++) {
//			for(int j=0; j<=no; j++) {
//				if(i==j) {
//					System.out.print(" *");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			for(int j=no-1; j>=0; j--) {
//				if(i==j) {
//					System.out.print(" *");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
	
		
	}

}
