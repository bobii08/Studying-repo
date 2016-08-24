import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyJpgFile {

	public static void main(String[] args) throws IOException {

		FileInputStream fileInputStream = new FileInputStream("E:\\MyRepo\\Java\\catJoke.jpg");
		FileOutputStream fileOutputStream = new FileOutputStream("E:\\MyRepo\\Java\\copiedCatJoke.jpg");
		int byteContainer;
		while ((byteContainer = fileInputStream.read()) != -1) {
			fileOutputStream.write(byteContainer);
		}

		fileInputStream.close();
		fileOutputStream.close();

	}

}
