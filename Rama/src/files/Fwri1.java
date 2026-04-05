package files;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Fwri1 {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\MadalaSi\\Desktop\\Siddu.txt");
		FileReader fr = new FileReader(f);
		int i = fr.read();
		while (i != -1) {
			System.out.println((char) i);
			i = fr.read();

		}

	}

}
