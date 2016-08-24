package Tasks2;

import java.util.Scanner;

public class ZAD10 {

	public static void main(String[] args) {
		Scanner bb = new Scanner(System.in);
		System.out.print("Enter number: ");
		int a = bb.nextInt();
		boolean isPrime = true;
		int x = 0;
		for (int i = 2; i <= a / 2; i++) {
			x = a % i;
			if (x == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(a + " is a prime number!");
		} else {
			System.out.println(a + " is not a prime number!");
		}
	}

}