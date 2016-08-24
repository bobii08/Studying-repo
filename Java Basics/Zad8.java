package Tasks1;

import java.util.Scanner;

public class Zad8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vyvedi chislo mejdu 1000 i 9999.");
		int a = sc.nextInt();
		while (!(a >= 1000 && a <= 9999)) {
			System.out.println("Vyvedi pravilno chislo mejdu 1000 i 9999.");
			a = sc.nextInt();
		}
		int a1 = a / 1000;
		int a2 = (a / 100) % 10;
		int a3 = (a / 10) % 10;
		int a4 = a % 10;

		if (a1 == a2 && a3 == a4) {
			System.out.println(a1 + a4 + "=" + a2 + a3);
		}
		if (a1 > a2) {
			System.out.println(a1 + a4 + ">" + a2 + a3);
		}
		if (a1 < a2) {
			System.out.println(a1 + a4 + "<" + a2 + a3);
		}
		if (a1 == a2 && a4 > a3) {
			System.out.println(a1 + a4 + ">" + a2 + a3);
		}
		if (a1 == a2 && a4 < a3) {
			System.out.println(a1 + a4 + "<" + a2 + a3);
		}
	}
}