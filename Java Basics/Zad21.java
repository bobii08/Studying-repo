package Tasks2;

import java.util.Scanner;

public class ZAD5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Vyvedete chislo: ");
		int a = sc.nextInt();
		System.out.print("Vyvedete vtoro chislo: ");
		int b = sc.nextInt();	
		if (a > b) {
			int x = a;
			a = b;
			b = x;
		}
		while (a <= b) {
			System.out.print(a + " ");
			a++;
		}
	}

}
