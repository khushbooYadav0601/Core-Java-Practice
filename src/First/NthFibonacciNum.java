package First;

import java.util.Scanner;

public class NthFibonacciNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Value : ");
		int no = sc.nextInt();
		
		int fno = 0;
		int sno = 1;
		
		int fab = 0;
//		System.out.print(fno+" "+sno);
		for(int i=2; i<=no; i++) {
			
			fab = fno+sno;
			
			fno = sno;
			sno = fab;
			
//			System.out.print(" "+fab);
			
			if(i==no) {
				System.out.println("Output is : "+fab);
			}
		}
				
	}

}
