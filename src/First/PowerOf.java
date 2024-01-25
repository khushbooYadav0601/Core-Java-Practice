package First;

import java.util.Scanner;

public class PowerOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int no = sc.nextInt();
		System.out.println("Enter the power value : ");
		int power = sc.nextInt();

		int total = 1;

		if (power == 0) {
			System.out.println("1");
		}

		if (no % 2 == 0) {
			for (int i = 1; i <= power; i++) {

				total = no * total;

			}
			System.out.println("Even : " + total);

		} else {
			for (int i = 1; i <= power; i++) {

				total = no * total;

			}
			System.out.println("Odd : " + total);

		}

	}

}
