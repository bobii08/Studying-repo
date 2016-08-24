package Tasks2;

import java.util.Scanner;

public class ZAD25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n = ");
		int n = sc.nextInt();
		long fac = 1;
		do {
			fac *= n;
			n--;
		} while (n > 0);
		System.out.println("n! = " + fac);
	}
}