package Tasks2;

public class ZAD20 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			for (int k = i; k <= 10; k++) {
				if (k == 10) {
					System.out.print(0);
					for (int p = 1; p <= i; p++) {
						if (p == 10) {
							System.out.print(0);
						} else {
							System.out.print(p);
						}
					}
				} 
				else {
					System.out.print(k);
				}
			}
			System.out.println();
		}
	}
}