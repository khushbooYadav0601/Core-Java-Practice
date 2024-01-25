package First;

import java.util.Scanner;

public class ToggleCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		String str = sc.nextLine();

		for (int i = 0; i < str.length(); i++) {

			StringBuilder result = new StringBuilder();
			char ch = str.charAt(i);

			if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
                System.out.print(result);
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
                System.out.print(result);
            } else {
                result.append(ch); // If it's not a letter, keep it unchanged
                System.out.println("It's not a letter keep it unchanged....");
            }
		}
		
	}

}
