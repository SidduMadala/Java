package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrinWrit {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\MadalaSi\\Desktop\\Madalas.txt");
		FileWriter fw = new FileWriter(f);
		PrintWriter pw = new PrintWriter(fw);
		pw.write("100");
		pw.write("Siddu");
		char[] ch = { 'm', 'a', 'd', 'a', 'l', 'a' };
		pw.write(ch);
		pw.flush();
	}

}
