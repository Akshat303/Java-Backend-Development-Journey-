

// ==========================================
// Task 1: Byte Range & Overflow Experiment
// ==========================================
class Task1ByteOverflow {
    public static void run() {
        System.out.println("--- Task 1: Byte Overflow Experiment ---");
        byte b = 125;
        System.out.println("Starting value: " + b);

        for (int i = 1; i <= 5; i++) {
            b++; // Compound assignment handles the increment
            System.out.println("Step " + i + " -> Value: " + b);
        }
        // Notice: When 127 + 1 happens, it wraps around to -128 (Two's Complement)
        System.out.println();
    }
}

// ==========================================
// Task 2: Type Promotion & Explicit Casting Fix
// ==========================================
class Task2TypePromotion {
    public static void run() {
        System.out.println("--- Task 2: Type Promotion Fix ---");
        byte a = 40;
        byte b = 60;

        // byte result = a + b; // COMPILE ERROR: a + b promotes operands to int
        
        // Fix 1: Store in int (natural promotion)
        int intResult = a + b;
        System.out.println("Result stored in int: " + intResult);

        // Fix 2: Explicit cast back to byte
        byte byteResult = (byte) (a + b);
        System.out.println("Result explicitly cast to byte: " + byteResult);
        System.out.println();
    }
}

// ==========================================
// Task 3: Memory Footprint Comparison
// ==========================================
class Task3MemoryComparison {
    public static void run() {
        System.out.println("--- Task 3: Memory Footprint Comparison ---");
        int count = 100_000;

        // Size in bytes
        long intMemoryBytes = (long) count * Integer.BYTES; // 4 bytes each
        long byteMemoryBytes = (long) count * Byte.BYTES;   // 1 byte each

        double intMemoryKB = intMemoryBytes / 1024.0;
        double byteMemoryKB = byteMemoryBytes / 1024.0;

        System.out.println("Elements count: " + count);
        System.out.printf("int[%d]  memory : %,d bytes (~%.2f KB)%n", count, intMemoryBytes, intMemoryKB);
        System.out.printf("byte[%d] memory : %,d bytes (~%.2f KB)%n", count, byteMemoryBytes, byteMemoryKB);

        double savedPercent = ((double) (intMemoryBytes - byteMemoryBytes) / intMemoryBytes) * 100.0;
        System.out.printf("Memory Saved using byte[]: %.2f%%%n", savedPercent);
        System.out.println();
    }
}

// ==========================================
// Task 4: Character to ASCII/Unicode Table
// ==========================================
class Task4CharUnicode {
    public static void run() {
        System.out.println("--- Task 4: Character to ASCII/Unicode Table ---");
        char ch = 'A';
        System.out.println("Single Char: '" + ch + "' -> ASCII code: " + (int) ch);

        System.out.println("Printing 'A' to 'J' with ASCII codes:");
        for (char c = 'A'; c <= 'J'; c++) {
            System.out.println("Character: " + c + " | Decimal: " + (int) c + " | Hex: \\u00" + Integer.toHexString(c).toUpperCase());
        }
        System.out.println();
    }
}

// ==========================================
// Task 5: Floating-Point Precision Comparison
// ==========================================
class Task5FloatPrecision {
    public static void run() {
        System.out.println("--- Task 5: Float vs Double Precision Check ---");
        
        // float has ~7 decimal digits of precision
        float f = 123.456789f;
        
        // double has ~15-17 decimal digits of precision
        double d = 123.456789123456789d;

        System.out.println("Float value  (32-bit): " + f);
        System.out.println("Double value (64-bit): " + d);
        System.out.println("Notice float rounded off beyond ~7 significant digits.");
        System.out.println();
    }
}

// ==========================================
// Task 6: Safe Average Calculator
// ==========================================
class Task6SafeAverage {
    public static void run() {
        System.out.println("--- Task 6: Safe Average Calculator ---");
        byte m1 = 85;
        byte m2 = 90;

        // Avoid integer division (m1 + m2) / 2 which gives 87
        double average = (m1 + m2) / 2.0;

        System.out.println("Marks 1: " + m1);
        System.out.println("Marks 2: " + m2);
        System.out.println("Accurate Decimal Average: " + average);
        System.out.println();
    }
}

// ==========================================
// Task 7: Boolean Toggle & Assignment vs Equality
// ==========================================
class Task7BooleanCheck {
    public static void run() {
        System.out.println("--- Task 7: Boolean Toggle & Equality Check ---");
        boolean isValid = false;
        System.out.println("Initial isValid: " + isValid);

        // Toggle state
        isValid = !isValid;
        System.out.println("Toggled isValid: " + isValid);

        // Common interview gotcha: '=' vs '=='
        boolean flag = false;
        // if (flag = true) assigns true and evaluates to true!
        if (flag = true) {
            System.out.println("Assignment (=) inside if condition evaluated to true!");
        }

        // Correct comparison with '=='
        if (flag == false) {
            System.out.println("This won't print because flag is now true.");
        } else {
            System.out.println("Equality (==) correctly checked that flag is true.");
        }
        System.out.println();
    }
}

// ==========================================
// Task 8: Explicit Downcasting Boundary Check
// ==========================================
class Task8ExplicitDowncasting {
    public static void run() {
        System.out.println("--- Task 8: Explicit Downcasting (300 to byte) ---");
        int num = 300;
        
        // Byte range is 256 unique numbers (-128 to 127)
        // 300 % 256 = 44
        byte castedByte = (byte) num;

        System.out.println("Original integer value : " + num);
        System.out.println("Cast to byte (byte) num : " + castedByte);
        System.out.println("Math explanation: 300 - 256 = " + (300 - 256));
        System.out.println();
    }
}

// ==========================================
// Main Runner: Executes all 8 tasks
// ==========================================
 class Day7DataTypesPractice {
    public static void main(String[] args) {
        System.out.println("============================================");
        System.out.println("   DAY 7: JAVA PRIMITIVE TYPES PRACTICE     ");
        System.out.println("============================================\n");

        Task1ByteOverflow.run();
        Task2TypePromotion.run();
        Task3MemoryComparison.run();
        Task4CharUnicode.run();
        Task5FloatPrecision.run();
        Task6SafeAverage.run();
        Task7BooleanCheck.run();
        Task8ExplicitDowncasting.run();

        System.out.println("============================================");
        System.out.println("       ALL 8 PRACTICE TASKS COMPLETED       ");
        System.out.println("============================================");
    }
}