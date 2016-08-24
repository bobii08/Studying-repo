package Tasks1;

import java.util.Scanner;

public class Zad14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vyvedete 2 cifri: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Vyvedete novi 2 cifri: ");
		int p = sc.nextInt();
		int q = sc.nextInt();
		int sumFirst = a + b;
		boolean isWhiteFirst = false;
		if (sumFirst == 2 || sumFirst == 4 || sumFirst == 6 || sumFirst == 8 
				|| sumFirst == 10 || sumFirst == 12
				|| sumFirst == 14 || sumFirst == 16) {
			isWhiteFirst = true;
		}
		int sumSecond = p + q;
		boolean isWhiteSecond = false;
		if (sumSecond == 2 || sumSecond == 4 || sumSecond == 6 || sumSecond == 8 
				|| sumSecond == 10 || sumSecond == 12
				|| sumSecond == 14 || sumSecond == 16) {
			isWhiteSecond = true;
		}
		if (sumFirst == sumSecond) {
			System.out.println("Vyvedohte ednakvi kvadratcheta.");
		}
		if (isWhiteFirst && isWhiteSecond) {
			System.out.println("Kvadratite sa beli.");
		}
		if (!isWhiteFirst && !isWhiteSecond) {
			System.out.println("Kvadratie sa cherni.");
		}
		if ((!isWhiteFirst && isWhiteSecond) || (isWhiteFirst && !isWhiteSecond)) {
			System.out.println("Kvadratite sa razlichni.");
		}
	}
}
