package First;

import java.util.Scanner;

public class StringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		String Str = sc.nextLine();
		int count=0;
		for(int i =1; i<=Str.length() ; i++) {
			
			count++;
		}
		System.out.println(count);
		
	}

}
