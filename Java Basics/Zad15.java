package Tasks1;

import java.util.Scanner;

public class Zad15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Vyvedi chas: ");
		int a = sc.nextInt();
		if ((a > 18 && a <= 24) || (a >= 0 && a <= 4)) {
			System.out.println("Dobyr vecher!");
		}
		if (a > 4 && a <= 9) {
			System.out.println("Dobro utro!");
		}
		if (a > 9 && a <= 18) {
			System.out.println("Dobyr den!");
		}
	}
}