package Tasks2;

import java.util.Scanner;

public class ZAD19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number between 10-99:");
		int n = sc.nextInt();
		while (n < 10 || n > 99) {
			System.out.println("Please eneter number between 10-99:");
			n = sc.nextInt();
		}
		for (int i = 0; i <= 99999; i++) {
			if (n == 1) {
				break;
			}
			if (n % 2 == 0) {
				System.out.print((n / 2) + " ");
				n /= 2;
			} else {
				System.out.print(((n * 3) + 1) + " ");
				n = n * 3 + 1;
			}
		}
	}
}
