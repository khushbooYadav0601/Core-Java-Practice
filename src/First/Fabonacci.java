package First;

import java.util.Scanner;

public class Fabonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int no = sc.nextInt();
		int fno = 0;
		int sno = 1;
		
		int fab = 0;
		
		System.out.print(fno+" "+sno);
		
		for(int i=2; i<=no; i++) {
			
			fab = fno + sno;
			
			System.out.print(" "+fab);
			
			fno=sno;
			sno=fab;
		}
			
		
	}

}
