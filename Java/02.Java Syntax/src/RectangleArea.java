import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("A = ");
        int aSide = scan.nextInt();
        System.out.print("B = ");
        int bSide = scan.nextInt();
        scan.close();
        long rectArea = aSide * bSide;
        
        System.out.println("S = " + rectArea);
    }

}
