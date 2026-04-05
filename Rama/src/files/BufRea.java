package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BufRea {

	public static void main(String[] args) throws Exception {
		File f = new File("C:\\Users\\MadalaSi\\Desktop\\Madala.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String i = br.readLine();
		while (i != null) {
			System.out.println(i);
			i = br.readLine();
		}

	}

}
