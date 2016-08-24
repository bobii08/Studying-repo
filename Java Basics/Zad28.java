package Tasks2;

import java.util.Scanner;

public class ZAD13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Vyvedete chislo mejdu 2 i 27: ");
		int n = sc.nextInt();
		while (n < 2 || n > 27) {
			System.out.println("Vyvedete chislo mejdu 2 i 27!");
			n = sc.nextInt();
		}
		int a, b, c, sum;
		for (int i = 100; i <= 999; i++) {
			a = i % 10;
			b = (i / 10) % 10;
			c = i / 100;
			sum = a + b + c;
			if (sum == n) {
				System.out.print(a);
				System.out.print(b);
				System.out.print(c + " ");
			}
		}
	}
}
