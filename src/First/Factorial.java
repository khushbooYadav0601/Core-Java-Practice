package First;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int fact =1;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value : ");
//		int no = sc.nextInt();
//		
//		for(int i=1; i<=no; i++) {
//			fact = fact*i;
//		}
//		System.out.println(fact);
		
		int fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Value : ");
		int fno = sc.nextInt();
		System.out.println("Enter the last Value : ");
		int lno = sc.nextInt();
		
		for(int i=fno; i<=lno; i++) {
			fact = fact*i;
			System.out.println(i+" : "+fact);
		}
	}

}
