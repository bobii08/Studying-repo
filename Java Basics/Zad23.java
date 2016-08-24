package Tasks2;

import java.util.Scanner;

public class ZAD7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 3;
		do {
			System.out.println(a);
			a += 3;
		} 
		while (a <= n);

	}

}
