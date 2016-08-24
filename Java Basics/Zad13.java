package Tasks1;

import java.util.Scanner;

public class Zad13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Vyvedi temperatura mejdu -100 i 100: ");
		int temp = sc.nextInt();
		if (temp < -20) {
			System.out.println("Ledeno studeno!");
		}
		if (temp < 0 && temp >= -20) {
			System.out.println("Studeno.");
		}
		if (temp < 15 && temp >= 0) {
			System.out.println("Hladno.");
		}
		if (temp < 25 && temp >= 15) {
			System.out.println("Toplo.");
		}
		if (temp > 25) {
			System.out.println("Goreshto!");
		}
	}
}
