package Tasks2;

import java.util.Scanner;

public class ZAD11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("N = ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(" ");
			}
			for (int p = 0; p <= i + i; p++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}