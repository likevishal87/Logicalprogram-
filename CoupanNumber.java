
public class CoupanNumber {

	public static void main(String[] args) {
		String str = "";
		String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		java.util.Random r = new java.util.Random();
		for (int i = 0; i <= 4; i++) {
			char c = alphabet.charAt((r.nextInt(alphabet.length())));
			str = String.valueOf(c) + str;
		}
		System.out.println(str);

	}

}
