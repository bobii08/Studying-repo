
public class PrintCharacters {

	public static void main(String[] args) {

		for (char ch = 'a'; ch <= 'z'; ch++) {
			if (ch != 'z') {
				System.out.print(ch + ", ");
			} else {
				System.out.print(ch);
			}
		}

	}
}
