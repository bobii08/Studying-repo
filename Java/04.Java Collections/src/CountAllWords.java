import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountAllWords {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter sentace:");
        String sentence = scan.nextLine();
        scan.close();
        
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(sentence);
        
        int count = 0;
        while (matcher.find()) {
            count++;
        }

        System.out.println(count);

	}

}
