package Tasks1;

import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int sbor = x + y;
		System.out.println("X + Y = " + sbor);
		int chastno = x / y;
		System.out.println("X / Y = " + chastno);
		int proizvedenie = x * y;
		System.out.println("X * Y = " + proizvedenie);
		int ostatyk = x % y;
		System.out.println("X % Y = " + ostatyk);

	}

}
