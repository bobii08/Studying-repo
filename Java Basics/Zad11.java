package Tasks1;

import java.util.Scanner;

public class Zad11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Vyvedi chislo mejdu 100-999 ");
		int a = sc.nextInt();
		int b = a % 10;
		int c = (a / 10) % 10;
		int d = (a / 100);
		if (a % b == 0 && a % c == 0 && a % d ==0) {
			System.out.println("Chisloto se deli na vsichkite si cifri!");
		} 
		else {
			System.out.println("Chisloto ne se deli na vsichkite si cifri!");
		}
	}
}