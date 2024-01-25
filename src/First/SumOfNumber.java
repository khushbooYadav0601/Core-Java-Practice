package First;

import java.util.Scanner;

public class SumOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int rem;
		int sum=0;
		for(int i=0; no!=0; i++) {
			
			rem = no % 10;
			System.out.println("Remainder : "+rem);
			no = no / 10;
			System.out.println("Number : "+no);
			
			sum=sum+rem;
			System.out.println(sum);
		}
		System.out.println(sum);
	}

}
