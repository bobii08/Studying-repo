import java.util.Scanner;

public class FormattingNumbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		scan.close();

		String aToBinary = String.format("%1$10s", Integer.toBinaryString(a)).replace(' ', '0');

		System.out.printf("%1$-10X|%2$10s|%3$10.2f|%4$-10.3f|", a, aToBinary, b, c);
	}

}
