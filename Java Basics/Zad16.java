package Tasks1;

import java.util.Scanner;

public class Zad16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vyvedi chislo mejdu: 100-999");
		int num = sc.nextInt();
		int a = num % 10;
		int b = (num / 10) % 10;
		int c = (num / 100);
		if (a == b && b == c) {
			System.out.println("Cifrite na chisloto sa ravni.");
		} 
		else if (!(a > b && b > c)) {
			System.out.println("Cifrite sa vyv nizhodqsht red.");
		} 
		else if (!(a < b && b < c)) {
			System.out.println("Cifrite sa vyv vyzhodqsht red.");
		} 
		else {
			System.out.println("Cifrite sa nenaredeni.");
		}

	}
}