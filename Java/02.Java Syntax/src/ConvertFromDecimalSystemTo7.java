import java.util.Scanner;

public class ConvertFromDecimalSystemTo7 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int integerNumber = scan.nextInt();
		StringBuilder strB = new StringBuilder();
		scan.close();

		do {
			strB.append(integerNumber % 7);
			integerNumber /= 7;
		} while (integerNumber != 0);

		System.out.println(strB.reverse());

	}

}
