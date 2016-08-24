package Tasks1;

import java.util.Scanner;

public class Zad7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Vyvedi chas: ");
		int hour = sc.nextInt();
		System.out.print("Vyvedi broi pari s koito razpolagash: ");
		double cash = sc.nextDouble();
		System.out.print("Bolen li si? (true/false): ");
		boolean sick = sc.nextBoolean();
		if (sick == true) {
			System.out.print("-Nqma da izlizam,");
			if (cash > 0){
				System.out.println(" no shte si kupq lekarstva.");
			} 
			else {
				System.out.println(" shte stoq vkyshtiq i shte piq chai.");
			}
		} 
		else {
			if (cash >= 10) {
				System.out.println("-Shte otida na kino s priqteli.");
			} 
			else {
				System.out.println("-Shte otida da piq kafe s priqteli.");
			}
		}
	}
}