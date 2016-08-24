package Tasks2;

import java.util.Scanner;

public class ZAD8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		int a = 0;
		if (n == 1) {
			n--;
			System.out.println(n);
		} else {
			a = n - 1;
			for (int j = 1; j <= n; j++) {
				for (int i = n; i >= 1; i--) {
					System.out.print(a);
				}
				System.out.println();
				a += 2;
			}
		}

	}

}
