package pdfKodewala.string;

/*Quick revision — String Methods
Method	    Kaam
length()	String ki length
charAt(i)	Index i ka character
equals()	Content comparison
equalsIgnoreCase()	Case ignore karke comparison
indexOf() / lastIndexOf()	First/last matching index
substring()	String ka portion
toUpperCase() / toLowerCase()	Letter case conversion
trim()	Beginning/end whitespace removal
replace()	Characters replace karna
split()	String ko array mein divide karna
contains()	Text present hai ya nahi
startsWith() / endsWith()	Prefix/suffix check
toCharArray()	String ko char[] mein convert karna
+ / concat()	Strings join karna*/

public class StringMethod {

	public static void main(String[] args) {

		// Length() Returns the length of the string.
		String str = "Akshat";
		System.out.println(str.length()); // 6

//        XcharAt(int index): Returns the character at the specified index.
		System.out.println(str.charAt(3)); // h

		/*
		 * String Comparison - equals(Object obj): Compares the content of two strings
		 * for equality
		 */
		String str2 = "Akshat";
		String str3 = "akshat";
		System.out.println(str.equals(str2)); // True
		System.out.println(str2.equals(str3)); // False

//		equalsIgnoreCase(String anotherStr): Compares two strings, ignoring case.
		System.out.println(str2.equalsIgnoreCase(str3)); // true

		String text = "java developer";

		System.out.println(text.indexOf("a"));
		System.out.println(text.lastIndexOf("a"));
		System.out.println(text.indexOf("dev"));
		System.out.println(text.indexOf("xyz"));

		String email = "akshat@gmail.com";

		System.out.println(email.substring(0, 6));
		System.out.println(email.substring(7));
		System.out.println(email.substring(7, 12));

		String original = "  Java Developer  ";

		System.out.println(original.toUpperCase());
		System.out.println(original.toLowerCase());
		System.out.println(original.trim());
		System.out.println(original.replace('a', 'o'));

		System.out.println("Original: [" + original + "]");

//		split() 

		String names = "Akshat,Rahul,Priya";

		String[] result = names.split(",");

		for (String name : result) {
			System.out.println(name);
		}

//        contains(), startsWith() aur endsWith()
		String fileName = "IMG_2026.jpg";

		System.out.println(fileName.contains("2026"));
		System.out.println(fileName.startsWith("IMG_"));
		System.out.println(fileName.endsWith(".jpg"));
		System.out.println(fileName.endsWith(".png"));

//        toCharArray()
		String word = "Java";

		char[] characters = word.toCharArray();

		for (char ch : characters) {
			System.out.println(ch);
		}
//        String concatenation: + aur concat()

		String firstName = "Akshat";
		String lastName = "Srivastava";

		String fullName1 = firstName + " " + lastName;
		String fullName2 = firstName.concat(" ").concat(lastName);

		System.out.println(fullName1);
		System.out.println(fullName2);
	}

}
