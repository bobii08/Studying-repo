import java.util.Scanner;

public class SumNumbersFrom1ToN {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = Integer.parseInt(scan.next());
		int sum = 0;

		for (int i = 1; i <= num; i++) {
			sum += i;
		}

		System.out.print(sum);
		scan.close();

	}

}
