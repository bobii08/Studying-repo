import java.util.Scanner;

public class CalculateExpression {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter first number: ");
		double a = scan.nextDouble();
		System.out.print("Enter first number: ");
		double b = scan.nextDouble();
		System.out.print("Enter first number: ");
		double c = scan.nextDouble();
		scan.close();

		double f1Result = Math.pow(((a * a + b * b) / (a * a - b * b)), ((a + b + c) / Math.sqrt(c)));
		double f2Result = Math.pow((a * a + b * b - c * c * c), (a - b));
		double difference = ((a + b + c) / 3) - ((f1Result + f2Result) / 2);
		if (difference < 0) {
			difference *= -1;
		}

		System.out.printf("F1 result: %1$.2f; ", f1Result);
		System.out.printf("F2 result: %1$.2f; ", f2Result);
		System.out.printf("Diff: %1$.2f", difference);

	}

}
