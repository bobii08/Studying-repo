package Tasks1;

import java.util.Scanner;

public class Zad10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Vyvedi chislo mejdu 10-9999: ");
		int val = sc.nextInt();
		int kofa2L = 0;
		int kofa3L = 0;
		if (val < 10 || val > 9999) {
			System.out.println("Vyvedete pravilno chislo ot intervala pri sledvashtiq opit.");
		}
		if (val % 3 == 0) {
			kofa3L = val / 3;
		}
		System.out.println(kofa3L);
	}

}
