package Tasks2;

import java.util.Scanner;

public class ZAD9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A: ");
		int a = sc.nextInt();
		System.out.println("Enter B: ");
		int b = sc.nextInt();
		int sum = 0;
		if (a > b) {
			int x = a;
			a = b;
			b = x;
		}
		while (a < b) {
			if (a % 3 == 0) {
				System.out.print("skip 3, ");
				a++;
				continue;
			}
			sum += (a * a);
			if (sum > 200) {
				break;
			}
			System.out.print(a * a + ", ");
			a++;
		}
		System.out.println(a * a);
	}
}
