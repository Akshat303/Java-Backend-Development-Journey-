package pdfKodewala.string;

public class StringBuilderDemo {
	public static void main(String[] args) {
		// Step 1: Object create karna
		StringBuilder sb = new StringBuilder("Kodewala");
		System.out.println("Initial String: " + sb);
		System.out.println("Initial Capacity: " + sb.capacity()); // 8 + 16 = 24

		// 1. append(): String ke end mein naya data add karta hai (In-place)
		sb.append(" Academy");
		System.out.println("After append: " + sb);

		// 2. insert(): Kisi specific index par content insert karta hai
		sb.insert(8, " Java"); // Index 8 par " Java" insert hoga
		System.out.println("After insert: " + sb);

		// 3. replace(): Start index se lekar end index tak replace karta hai
		// "Kodewala Java Academy" -> replace "Java" with "Core"
		sb.replace(9, 13, "Core");
		System.out.println("After replace: " + sb);

		// 4. delete() & deleteCharAt(): Characters remove karna
		sb.delete(8, 13); // Index 8 se 12 tak delete karega
		System.out.println("After delete: " + sb);

		// 5. reverse(): Poori sequence ko reverse karta hai
		sb.reverse();
		System.out.println("After reverse: " + sb);

		// Wapas normal kar lete hain
		sb.reverse();

		// 6. toString(): StringBuilder ko normal immutable String mein convert karna
		String finalOutput = sb.toString();
		System.out.println("Final String object: " + finalOutput);
	}
}