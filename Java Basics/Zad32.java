package Tasks2;

import java.util.Scanner;

public class ZAD17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter side for the square between 3 and 20: ");
		int b = sc.nextInt();
		while (b < 3 || b > 20) {
			System.out.println("Please enter side for the square between 3 and 20!");
			b = sc.nextInt();
		}
		System.out.print("Enter symbol to fill the square: ");
		char c = sc.next().charAt(0);
		for (int j = 1; j <= b; j++) {
			System.out.print("*");
			for (int i = 1; i < b; i++) {
				if (j == 1 || j == b){
					System.out.print("*");
				} 
				else {
					if (i != b - 1) {
						System.out.print(c);
					} 
					else {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}
	}
}
