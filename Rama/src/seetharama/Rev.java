package seetharama;

public class Rev {

	public static void main(String[] args) {
	String rev = "";
	String s = "Siddu";
	 int ma = s.length();
	 for(int i = ma-1;i>=0;i--) {
		 rev = rev + s.charAt(i);
	 }
	 System.out.println(rev);

	}

}
