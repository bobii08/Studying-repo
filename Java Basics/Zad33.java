package Tasks2;

import java.util.Scanner;

public class ZAD18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Vyvedete chislo ot intervala [1-9]: ");
		int n = sc.nextInt();
		System.out.print("Vyvedete vtoro chislo ot intervala [1-9]: ");
		int m = sc.nextInt();
		int proizvedenie = 0;
		for (int num = 1; num <= n; num++) {
			for (int num2 = 1; num2 <= m; num2++) {
				proizvedenie = num * num2;
				if ((num <= n) || (num2 <= m)) {
					System.out.println(num + " * " + num2 + " = " + proizvedenie);
				}
			}
		}
	}
}
