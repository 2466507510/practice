package stream;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestStream {

	public static void main(String[] args) {
		File file = new File("D:\\tools\\log4j\\test.txt");
		FileReader fr = null;
		try {
			fr = new FileReader(file);
			char[] all = new char[(int) file.length()];
			fr.read(all);
			for (char ch : all) {
				System.out.print(ch);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
