package First;

import java.util.Scanner;

public class MulidimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of value : ");
		int fno = sc.nextInt();
		int sno = sc.nextInt();
		int tno = sc.nextInt();
		
		int array[][][] = new int[fno][sno][tno];
		
		System.out.println("Enter the Element : ");
		for(int i=0; i<fno; i++) {
			for(int j=0; j<sno; j++) {
				for(int k=0; k<tno; k++) {
					array[i][j][k] = sc.nextInt();
				}
			}
		}
		
		for(int i=0; i<fno; i++) {
			for(int j=0; j<sno; j++) {
				for(int k=0; k<tno; k++) {
					System.out.print(array[i][j][k]+" ");
				}
				System.out.println();
			}
		}
	}

}
