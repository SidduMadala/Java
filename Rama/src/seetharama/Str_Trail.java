package seetharama;

public class Str_Trail {

	public static void main(String[] args) {
		String si = "Siddu";
		String ma = "Madala";
		String masi = si.concat(ma);
		System.out.println(masi);
		System.out.println(si.charAt(0));
		System.out.println(ma.charAt(0));
		System.out.println(ma.length());
		System.out.println(si.equals(ma));
		System.out.println(si.trim());
		System.out.println(si.codePointAt(3));
		System.out.println(si.toLowerCase());
		System.out.println(si.toUpperCase());
		System.out.println(si.isBlank());
		System.out.println(si.isEmpty());
		System.out.println(si.substring(3));
		System.out.println(masi.substring(0, 11));

	}

}
