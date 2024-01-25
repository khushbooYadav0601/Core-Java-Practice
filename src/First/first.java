package First;

import java.util.Scanner;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("let's Start");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first value : ");
		int a = sc.nextInt();
		System.out.println("Enter the second value : ");
		int b = sc.nextInt();
		
		int c = a+b;
		
		System.out.println("The addition of two number is "+c);
		
	}

}
