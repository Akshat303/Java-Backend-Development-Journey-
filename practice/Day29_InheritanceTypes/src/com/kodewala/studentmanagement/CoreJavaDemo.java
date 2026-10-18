
package com.kodewala.studentmanagement;

public class CoreJavaDemo {

    // Instance variable
    private int instanceValue = 10;

    // Static variable
    private static int staticValue = 20;

    public static void main(String[] args) {

        // Primitive data types
        byte byteValue = 10;
        short shortValue = 1000;
        int intValue = 10000;
        long longValue = 100000L;
        float floatValue = 10.5f;
        double doubleValue = 20.75;
        char charValue = 'A';
        boolean booleanValue = true;

        System.out.println("===== PRIMITIVE TYPES =====");
        System.out.println(byteValue);
        System.out.println(shortValue);
        System.out.println(intValue);
        System.out.println(longValue);
        System.out.println(floatValue);
        System.out.println(doubleValue);
        System.out.println(charValue);
        System.out.println(booleanValue);

        // Reference type and null
        String emptyReference = null;
        int[] numbers = {10, 20, 30};

        System.out.println("\n===== ARRAYS AND NULL =====");
        System.out.println("First number: " + numbers[0]);
        System.out.println("Null reference: " + emptyReference);

        // Local variable
        int localValue = 30;

        CoreJavaDemo demo = new CoreJavaDemo();

        System.out.println("\n===== VARIABLE SCOPE =====");
        System.out.println("Local: " + localValue);
        System.out.println("Instance: " + demo.instanceValue);
        System.out.println("Static: " + staticValue);

        demo.showInstanceMethod();
        showStaticMethod();

        demo.showAccessModifiers();

        // Assignment, relational and logical operators
        int age = 22;
        age += 3;

        System.out.println("\n===== OPERATORS =====");
        System.out.println("Updated age: " + age);
        System.out.println("Age >= 18: " + (age >= 18));
        System.out.println("Eligible: "
                + (age >= 18 && age <= 60));

        // String pool, ==, equals() and intern()
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");

        System.out.println("\n===== STRING POOL =====");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
        System.out.println(s1 == s3.intern());

        // String immutability
        String original = "Core";
        String updated = original.concat(" Java");

        System.out.println("\n===== STRING IMMUTABILITY =====");
        System.out.println("Original: " + original);
        System.out.println("Updated: " + updated);

        // String methods
        String text = "Java Programming";

        System.out.println("\n===== STRING METHODS =====");
        System.out.println(text.length());
        System.out.println(text.charAt(0));
        System.out.println(text.substring(5));
        System.out.println(text.replace("Java", "Core"));
        System.out.println(text.concat(" Language"));

        String[] words = text.split(" ");

        for (String word : words) {
            System.out.println(word);
        }

        // StringBuffer
        StringBuffer buffer = new StringBuffer("Java");
        buffer.append(" Backend");

        System.out.println("\n===== STRINGBUFFER =====");
        System.out.println(buffer);
        System.out.println(buffer.reverse().reverse());

        // StringBuilder
        StringBuilder builder = new StringBuilder("Core");
        builder.append(" Java");

        System.out.println("\n===== STRINGBUILDER =====");
        System.out.println(builder);
        System.out.println(builder.length());

        // if-else-if
        System.out.println("\n===== CONDITIONS =====");

        if (age < 18) {
            System.out.println("Minor");
        } else if (age <= 60) {
            System.out.println("Adult");
        } else {
            System.out.println("Senior");
        }

        // Nested loops, continue and break
        System.out.println("\n===== LOOPS =====");

        for (int i = 1; i <= 3; i++) {

            if (i == 2) {
                continue;
            }

            for (int j = 1; j <= 2; j++) {
                System.out.println("i=" + i + ", j=" + j);
                break;
            }
        }

        // Switch
        int choice = 2;

        System.out.println("\n===== SWITCH =====");

        switch (choice) {
            case 1:
                System.out.println("One");
                break;

            case 2:
                System.out.println("Two");
                break;

            default:
                System.out.println("Other");
        }

        // while loop
        int count = 1;

        while (count <= 3) {
            System.out.println("Count: " + count);
            count++;
        }

        // Method with parameters and return type
        int result = addNumbers(10, 20);
        System.out.println("\nSum: " + result);

        // Explain Java execution concepts
        System.out.println("\n===== JAVA EXECUTION =====");
        System.out.println("Source code: .java");
        System.out.println("Compiler output: .class bytecode");
        System.out.println("JVM executes bytecode on the platform.");
    }

    // Instance method
    public void showInstanceMethod() {
        System.out.println("Instance method called.");
    }

    // Static method
    public static void showStaticMethod() {
        System.out.println("Static method called.");
    }

    // Method parameters, return type
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    // Private method
    private void showPrivateMethod() {
        System.out.println("Private method called.");
    }

    // Protected method
    protected void showProtectedMethod() {
        System.out.println("Protected method called.");
    }

    // Default/package-private method
    void showPackageMethod() {
        System.out.println("Package-private method called.");
    }

    public void showAccessModifiers() {
        showPrivateMethod();
        showProtectedMethod();
        showPackageMethod();
    }
}
