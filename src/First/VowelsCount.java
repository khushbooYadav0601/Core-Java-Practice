package First;

import java.util.Scanner;

public class VowelsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		String str = sc.next();
		
		int vowCount = 0;
		int constCount = 0;
		int specialCount = 0;
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			ch = Character.toLowerCase(ch);
			
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				
				vowCount++;
			}
			else if(Character.isLetter(ch)) {
				constCount++;
			}
			else {
				specialCount++;
			}
		}
		System.out.println("Vowels are : "+ vowCount);
		System.out.println("Constants are : "+ constCount);
		System.out.println("Special Characters are : "+ specialCount);
	}

}
