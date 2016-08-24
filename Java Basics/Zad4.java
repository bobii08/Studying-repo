package Tasks1;

import java.util.Scanner;

public class Zad4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a == b){
			System.out.println("error!!!");
		}
		if (a > b) {
			System.out.println("a:" + a + "," + "b:" + b);
		} 
		else {
			System.out.println("b:" + b + "," + "a:" + a);
		}

}
}
