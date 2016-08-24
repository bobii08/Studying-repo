package Tasks2;

import java.util.Scanner;

public class ZAD15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("n = ");
		int n = input.nextInt();
		int num = 1;
		int sum = 1;
		System.out.print("The sum 1");
		do {
			num++;
			sum += num;
			System.out.printf("+%d", num);
		} 
		while (num < n);
		System.out.printf(" = %d%n", sum);
	}
}