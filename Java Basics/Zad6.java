package Tasks1;

import java.util.Scanner;

public class Zad6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = sc.nextInt();
		int temp = a1;
		int temp2 = a2;
		a1 = temp2;
		a2 = a3;
		a3 = temp;
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);

	}

}
