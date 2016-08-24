package Tasks2;

import java.util.Scanner;

public class ZAD14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number between 10 and 200: ");
		int n = sc.nextInt();
		while (n < 10 || n > 200) {
			System.out.println("Please enter number between 10 and 200!");
			n = sc.nextInt();
		}
		
		for (int i = n; i >= 1; i--) {
			if (i % 7 == 0) {
				System.out.print(i + " ");
			}
		}
}}