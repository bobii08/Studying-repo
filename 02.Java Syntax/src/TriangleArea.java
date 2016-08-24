import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int firstPointX = scan.nextInt();
		int firstPointY = scan.nextInt();
		int secondPointX = scan.nextInt();
		int secondPointY = scan.nextInt();
		int thirdPointX = scan.nextInt();
		int thirdPointY = scan.nextInt();
		scan.close();

		double area = Math.abs(
						((firstPointX * (secondPointY - thirdPointY) + 
								secondPointX * (thirdPointY - firstPointY) + 
								thirdPointX * (firstPointY - secondPointY)) / 2));

		System.out.println((int) area);

	}

}
