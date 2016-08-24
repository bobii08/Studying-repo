package Tasks2;

import java.util.Scanner;

public class ZAD16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number N between 10 and 5555: ");
		int n = sc.nextInt();
		while (n < 10 || n > 5555) {
			System.out.println("Please enter number N between 10 and 5555!");
			n = sc.nextInt();
		}
		System.out.print("Enter number M between 10 and 5555: ");
		int m = sc.nextInt();
		while (m < 10 || m > 5555) {
			System.out.println("Please enter number M between 10 and 5555!");
			m = sc.nextInt();
		}
		if (n > m) {
			int x = n;
			n = m;
			m = x;
		}
		for (int i = m; i >= n; i--) {
			if (i % 50 == 0) {
				System.out.print(i + " ");
			}
		}
	}

}