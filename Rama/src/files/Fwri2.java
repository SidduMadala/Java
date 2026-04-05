package files;

import java.io.File;
import java.io.FileWriter;

public class Fwri2 {

	public static void main(String[] args) throws Exception {
		File f = new File("C:\\Users\\MadalaSi\\Desktop\\SidduM.txt");
		FileWriter fw = new FileWriter(f);
		fw.write("siddu");
		fw.write('\n');
		char[] c = { 'm', 'a', 'd', 'a', 'l', 'a' };
		fw.write(c);
		fw.write('\n');
		fw.write("100");
		fw.write('\n');
		fw.write(200);
		fw.write('\n');
		fw.write("Madala");
		fw.flush();
		System.out.println("Data is written successfully into the file");
	}

}
