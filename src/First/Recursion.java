package First;

import java.util.Scanner;

public class Recursion {
	
	public static void printNumb(int no) {
		if(no == 0) { //Base Condition
			return;
		}
		System.out.println(no);
		printNumb(no-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int no = sc.nextInt();
		printNumb(no);
	}
	
}
