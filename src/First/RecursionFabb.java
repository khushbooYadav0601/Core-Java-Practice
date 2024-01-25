package First;

import java.util.Scanner;

public class RecursionFabb {
	
	public static void printFabb(int fno, int sno, int no) {
		
		if(no==0) {
			return;
		}
		int fab = fno + sno;
		System.out.print(" "+fab);

		printFabb(sno, fab, no-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int no = sc.nextInt();
		int fno = 0;
		int sno = 1;
		System.out.print(fno+" "+sno);
		printFabb(fno, sno, no-2);
		
	}

}
