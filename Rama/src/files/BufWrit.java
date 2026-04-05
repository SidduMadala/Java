package files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class BufWrit {

	public static void main(String[] args) throws Exception {
		File f = new File("C:\\Users\\MadalaSi\\Desktop\\Madala.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("500");
		bw.write('\n');
		bw.write("Siddu");
		bw.write('\n');
		char[] ch = { 'm', 'a', 'd', 'a', 'l', 'a' };
		bw.write(ch);
		bw.flush();
		bw.close();
		System.out.println("Data has been written successfully");

	}

}
