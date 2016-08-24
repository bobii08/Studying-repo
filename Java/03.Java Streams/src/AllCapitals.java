import java.io.*;

public class AllCapitals {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new FileReader("E:\\MyRepo\\Java\\lines.txt"));
        String fullText = "";
        String temporaryString;

        while ((temporaryString = bufferedReader.readLine()) != null) {
            fullText += temporaryString.toUpperCase() + "\r\n";
        }

        PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter("E:\\MyRepo\\Java\\newLines.txt")));
        printWriter.write(fullText);
        printWriter.flush();
        bufferedReader.close();
        printWriter.close();

	}

}
