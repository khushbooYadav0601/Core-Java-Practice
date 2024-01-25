package First;

import java.util.Scanner;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		String str = sc.next();
		
		int[] charCount = new int[256];
		
		for(int i=0; i<str.length(); i++) {
			char currentChar = str.charAt(i);
			charCount[currentChar]++;
		}
		
		System.out.println("Unique characters : ");
		for(int i=0; i< str.length(); i++) {
			char currentChar = str.charAt(i);
			if(charCount[currentChar] == 1) {
				System.out.println(currentChar + " ");
			}
		}
	}

}
