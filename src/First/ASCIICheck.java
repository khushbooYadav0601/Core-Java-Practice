package First;

import java.util.Scanner;

public class ASCIICheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch;
		System.out.println("Enter any Character : ");
		Scanner sc = new Scanner(System.in);
		ch = sc.next().charAt(0);
		
		int a = ch; //65 = A
		System.out.println("AsCII value of "+ch+"is"+a);
	}

}
