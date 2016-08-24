package Tasks2;

public class ZAD12 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		for (int i = 100; i <= 999; i++) {
			a = i % 10;
			b = (i / 10) % 10;
			c = i / 100;
			if (a == b || a == c || b == c) {
				continue;
			} else {
				System.out.println(i);
			}
		}
	}
}