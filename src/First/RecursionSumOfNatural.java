package First;

import java.util.Scanner;

public class RecursionSumOfNatural {
	
	public static void printSumOfNat(int i, int no, int sum) {
		if(i==no) {
			sum +=i;
			System.out.println(sum);
			return;
		}
		sum +=i;
		printSumOfNat(i+1,no, sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int no = sc.nextInt();
		
		printSumOfNat(1,no,0);
		
	}
}
