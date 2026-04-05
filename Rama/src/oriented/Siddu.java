package oriented;

public class Siddu {
	public int madala(int a, int b) {
		return a + b;
	}

	public String sidda(int si, int su, String ma) {
		return si + su + ma;

	}

	public static void main(String[] args) {
		Siddu s = new Siddu();
		String masi = s.sidda(10, 90, "Siddu");
		System.out.println(masi);
		Siddu ms = new Siddu();
		int sisu = ms.madala(10, 10);
		System.out.println(sisu);

	}
}
