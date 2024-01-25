package First;

import java.util.Scanner;

public class RecursionPrtNum {
	
	public static void printNum(int no, int i) {
		
		if(i>no) {
			return;
		}
		System.out.println(i);
		printNum(no, i+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value : ");
		int no = sc.nextInt();
		printNum(no, 0);
		
	}

}
