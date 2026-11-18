package code.arrayPractice;

public class Demo {

	public static void main(String[] args) {
		int[] num = new int[3];
		int x = 10;
		for (int i = 0; i < num.length; i++) {
			num[i] = x;
			x++;
		}
		for (int n = 0; n < num.length; n++)
			System.out.println(num[n]);

	}

}
