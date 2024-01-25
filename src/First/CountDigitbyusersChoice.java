package First;

import java.util.Scanner;

//Write a program in java to calculate the number of times a digit 'D' appers in anumber N. You have to take N and D as inputs from the user.
public class CountDigitbyusersChoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of value : ");
		int no = sc.nextInt();
		System.out.println("Enter the value you want to count : ");
		int a = sc.nextInt();
		int rem;
		int count=0;
		for(int i=0; no!=0; i++) {
			
			rem = no%10;
			no = no/10;
			
			if(a==rem){
				count++;
			}
		}
		System.out.println(count);
	}

}
