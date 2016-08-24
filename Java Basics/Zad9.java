package Tasks1;

import java.util.Scanner;

public class Zad9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vyvedi chislo mejdu 10 i 99");
		int a = sc.nextInt();
		if (!(a >= 10 && a <= 99)) {
			System.out.println("Vyvedi pravilno chislo mejdu 10 i 99.");
			a = sc.nextInt();
		}
		System.out.println("Vyvedi vtoro chislo mejdu 10 i 99.");
		int b = sc.nextInt();
		if (!(b >= 10 && b <= 99)) {
			System.out.println("Vyvedi pravilno chislo mejdu 10 i 99.");
			b = sc.nextInt();
		}
		int mult = a * b;
		int ed = mult % 10;
		if (ed % 2 == 0) {
			System.out.println(mult + ", " + ed + " even");
		} else {
			System.out.println(mult + ", " + ed + " odd");
		}
	}

}