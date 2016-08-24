package Tasks1;

import java.util.Scanner;

public class Zad1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter A: ");
		double a = sc.nextDouble();
		System.out.print("Enter B: ");
		double b = sc.nextDouble();
		System.out.print("Enter C: ");
		double c = sc.nextDouble();

		if (c > a && c < b) {
			System.out.println("The number " + c + " is between " + a + " and " + b);
		}
		if (c < a && c > b) {
			System.out.println("The number " + c + " is between " + b + " and " + a);
		}
		if (c == a) {
			System.out.println("The number is equal to A= " + a + " it's not between them.");
		}
		if (c == b) {
			System.out.println("The number is equal to B= " + b + " it's not between them.");
		}
		if (c > a && c > b) {
			System.out.println("The number " + c + " is not between " + a + " and " + b);
		}
		if (c < a && c < b) {
			System.out.println("The number " + c + " is not between " + b + " and " + a);
		}
	}
}