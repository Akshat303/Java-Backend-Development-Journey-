package code.string;

public class Demo2 {

	/**
	 * Problem of Immutability 
	 * "0" -> "01" -> "012" -> "0123" -> "01234"
	 */

	public static void main(String[] args) {
		String s = "";
		for (int i = 0; i < 5; i++) {
			s += i; // s =s + 1
			System.out.println(s);
		}
		String first = "Java";
		String second = new String("Java");

		System.out.println(first == second);

		String pooled = second.intern();
		System.out.println(first == pooled);

	}
}
