import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetFirstOddOrEvenElement {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[] integersStr = scan.nextLine().split(" ");
		String[] nextLine = scan.nextLine().split(" ");
		int numberOfElements = Integer.parseInt(nextLine[0]);
		String kindOfNumbers = nextLine[1];
		List<Integer> collection = new ArrayList<>();
		scan.close();

		for (String numberStr : integersStr) {
			collection.add(Integer.parseInt(numberStr));
		}

		ReturnElementsFromCollection(collection, numberOfElements, kindOfNumbers);
	}

	private static void ReturnElementsFromCollection(List<Integer> collection, int numberOfElements, String kindOfNumbers) {
		
		int count = 0;
		
		if (kindOfNumbers.equals("odd")) {
			for (int num : collection) {
				if (num % 2 != 0) {
					System.out.print(num + " ");
					count++;
				}

				if (count == numberOfElements) {
					return;
				}
			}
		} else if (kindOfNumbers.equals("even")) {
			for (int num : collection) {
				if (num % 2 == 0) {
					System.out.print(num + " ");
					count++;
				}

				if (count == numberOfElements) {
					return;
				}
			}
		}

	}

}
