package First;

import java.util.Scanner;

public class TwoDimArrAtring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of line : ");
		int no = sc.nextInt();
		
		sc.nextLine();
		
		String str[][] = new String[no][no]; 
		
		for(int i=0; i<no; i++) {
			for(int j=0; j<no; j++) {
				str[i][j] = sc.nextLine();
			}
		}
		
		for(int i=0; i<no; i++) {
			for(int j=0; j<no; j++) {
				System.out.println(str[i][j]);
			}
		}
	}

}
