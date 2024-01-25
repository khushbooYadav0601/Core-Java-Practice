package First;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the marks of English : ");
		float fno = sc.nextInt();
		System.out.print("Enter the marks of maths : ");
		float sno = sc.nextInt();
		System.out.print("Enter the marks of Hindi : ");
		float tno = sc.nextInt();
		System.out.print("Entre the marks of science : ");
		float frn = sc.nextInt();
		System.out.print("Enter the marks of social : ");
		float fft = sc.nextInt();
		
		float Total = fno+sno+tno+frn+fft;
		System.out.println("The total marks are : "+Total);
		
		float percentage = (float)(Total/500*100);
		System.out.println(percentage +"%");
		
	}

}
