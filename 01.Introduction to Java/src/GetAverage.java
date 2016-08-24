import java.util.Scanner;

public class GetAverage {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter fisrt number: ");
		double firstNum = scan.nextDouble();
		System.out.print("Enter fisrt number: ");
		double secondNum = scan.nextDouble();
		System.out.print("Enter fisrt number: ");
		double thirdNum = scan.nextDouble();
		scan.close();

		double average = findAverage(firstNum, secondNum, thirdNum);

		System.out.println(String.format("%.2f", average));
	}

	private static double findAverage(double firstNum, double secondNum, double thirdNum) {
		return (firstNum + secondNum + thirdNum) / 3;
	}
}
