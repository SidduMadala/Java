package seetharama;

import java.util.Arrays;

public class Str_Trail1 {

	public static void main(String[] args) {
		String ma = "This is siddu madala";
		String[] m = ma.split(",");
		for (String masi : m) {
			System.out.println(masi);
		}
		System.out.println(Arrays.toString(m));
	}

}
