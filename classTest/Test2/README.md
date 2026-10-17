# Kodewala Academy – Java Backend Tests: Complete Question Bank (Tests 2)

## Contents

- Test 2 (40 questions)

---

## Test 2 – Java Backend Test # 2

40 questions

### Q1. Which keyword allows JVM to call the main method?

- **A.** static
- **B.** void
- **C.** public
- **D.** main

**✅ Correct answer:** C. public

**💡 Explanation:** `main` must be `public` so the JVM, which is outside the class, can access it.

---

### Q2. Why is the main method declared static?

- **A.** To improve memory
- **B.** To avoid object creation
- **C.** To make code faster
- **D.** To return values

**✅ Correct answer:** B. To avoid object creation

**💡 Explanation:** The JVM calls `main` before any object exists, so it must be static and callable via the class name.

---

### Q3. In Java, file name and public class name:

- **A.** Can be different
- **B.** Must be same
- **C.** Need not match
- **D.** Depend on OS

**✅ Correct answer:** B. Must be same

**💡 Explanation:** A file containing a public class must be named exactly after that class (`Test.java`).

---

### Q4. Which of the following is a valid Java identifier?

- **A.** 123name
- **B.** employee-id
- **C.** total_sum
- **D.** first name

**✅ Correct answer:** C. total_sum

**💡 Explanation:** Identifiers cannot start with a digit, contain hyphens or spaces. Underscores are allowed.

---

### Q5. Java identifiers are:

- **A.** Case-insensitive
- **B.** Numeric only
- **C.** Uppercase only
- **D.** Case-sensitive

**✅ Correct answer:** D. Case-sensitive

**💡 Explanation:** `name` and `Name` are different identifiers.

---

### Q6. What is the default value of a boolean variable?

- **A.** true
- **B.** false
- **C.** 0
- **D.** null

**✅ Correct answer:** B. false

**💡 Explanation:** Instance/static boolean fields default to `false`.

---

### Q7. Which variable is declared inside a method?

- **A.** Instance Variable
- **B.** Static Variable
- **C.** Local Variable
- **D.** Member Variable

**✅ Correct answer:** C. Local Variable

**💡 Explanation:** Variables declared inside a method/block are local variables.

---

### Q8. Which variable belongs to an object?

- **A.** Instance Variable
- **B.** Static Variable
- **C.** Local Variable
- **D.** Final Variable

**✅ Correct answer:** A. Instance Variable

**💡 Explanation:** Each object has its own copy of instance variables.

---

### Q9. There is only one copy of a ______ variable for the entire class.

- **A.** Member Variable
- **B.** Static Variable
- **C.** Local Variable
- **D.** Final Variable

**✅ Correct answer:** B. Static Variable

**💡 Explanation:** Static variables belong to the class and are shared by all objects.

---

### Q10. Which operator is used for assignment?

- **A.** ==
- **B.** =
- **C.** !=
- **D.** >=

**✅ Correct answer:** B. =

**💡 Explanation:** `=` assigns a value; `==` compares.

---

### Q11. Which operator returns true only when both conditions are true?

- **A.** ||
- **B.** !
- **C.** ==
- **D.** &&

**✅ Correct answer:** D. &&

**💡 Explanation:** Logical AND (`&&`) is true only if both operands are true.

---

### Q12. Which of the following is a benefit of methods?

- **A.** Code duplication
- **B.** Reduced readability
- **C.** Reusability
- **D.** Increased complexity

**✅ Correct answer:** C. Reusability

**💡 Explanation:** Methods let you write logic once and reuse it, improving readability.

---

### Q13. What is the output?

```java
boolean a = true;
boolean b = false;
System.out.println(a || b);
```

- **A.** true
- **B.** false
- **C.** 1
- **D.** Compilation Error

**✅ Correct answer:** A. true

**💡 Explanation:** `true || false` is `true`.

---

### Q14. Which of the following is a non-primitive data type?

- **A.** char
- **B.** long
- **C.** double
- **D.** String

**✅ Correct answer:** D. String

**💡 Explanation:** `String` is a class (reference type). The others are primitives.

---

### Q15. Which access modifier allows access only within the same class?

- **A.** protected
- **B.** private
- **C.** default
- **D.** prblic

**✅ Correct answer:** B. private

**💡 Explanation:** `private` members are visible only inside their own class.

---

### Q16. What is the purpose of command-line arguments?

- **A.** Compile code
- **B.** Pass dynamic input at runtime
- **C.** Store bytecode
- **D.** Create objects

**✅ Correct answer:** B. Pass dynamic input at runtime

**💡 Explanation:** They let you pass values to `main(String[] args)` when launching the program.

---

### Q17. What will happen if the public class name and file name are different?

- **A.** Runtime Error
- **B.** Program executes normally
- **C.** Compile Time Error
- **D.** JVM Exception

**✅ Correct answer:** C. Compile Time Error

**💡 Explanation:** `javac` rejects a public class whose name does not match the file name.

---

### Q18. What is the output?

```java
int x = 10;
System.out.println(x > 5 && x < 20);
```

- **A.** false
- **B.** true
- **C.** 30
- **D.** Compilation Error

**✅ Correct answer:** B. true

**💡 Explanation:** 10 > 5 and 10 < 20 are both true.

---

### Q19. Which memory optimization issue can occur if instance variables are used where static variables should be used?

- **A.** Stack Overflow
- **B.** Deadlock
- **C.** Data Corruption
- **D.** Increased Memory Consumption

**✅ Correct answer:** D. Increased Memory Consumption

**💡 Explanation:** Every object gets its own copy of an instance variable, wasting memory for data that could be shared.

---

### Q20. Which statement about local variables is TRUE?

- **A.** Can have access modifiers
- **B.** Receive default values
- **C.** Must be initialized before use
- **D.** Exist throughout program execution

**✅ Correct answer:** C. Must be initialized before use

**💡 Explanation:** Local variables get no default value; the compiler requires initialization before use.

---

### Q21. What is printed?

```java
public static void main(String[] args)
{
    System.out.println(args.length);
}

// run as: java Test A B C
```

- **A.** 2
- **B.** 3
- **C.** 4
- **D.** Compilation Error

**✅ Correct answer:** B. 3

**💡 Explanation:** Three arguments (A, B, C) are passed, so `args.length` is 3.

---

### Q22. Which of the following can be accessed without creating an object?

- **A.** Instance Variable
- **B.** Instance Method
- **C.** Static Variable
- **D.** Constructor

**✅ Correct answer:** C. Static Variable

**💡 Explanation:** Static members are accessed through the class name.

---

### Q23. Which statement regarding protected members is correct?

- **A.** Accessible only inside class
- **B.** Accessible only inside package
- **C.** Accessible everywhere
- **D.** Accessible in same package and subclasses

**✅ Correct answer:** D. Accessible in same package and subclasses

**💡 Explanation:** `protected` = package access plus access from subclasses (even in other packages).

---

### Q24. What is the output?

```java
boolean a = false;
boolean b = true;
System.out.println(!(a || b));
```

- **A.** 1
- **B.** true
- **C.** false
- **D.** true and false

**✅ Correct answer:** C. false

**💡 Explanation:** `a || b` is true, and `!true` is false.

---

### Q25. Which of the following is NOT a valid method name according to conventions?

- **A.** calculateSalary()
- **B.** printMessage()
- **C.** sendEmail()
- **D.** EmployeeData()

**✅ Correct answer:** D. EmployeeData()

**💡 Explanation:** Methods use camelCase starting lowercase. A leading capital is the convention for class names.

---

### Q26. Which scenario is best suited for a static variable?

- **A.** Employee Name
- **B.** Account Balance
- **C.** Shopping Cart Items
- **D.** Company Name Shared by All Employees

**✅ Correct answer:** D. Company Name Shared by All Employees

**💡 Explanation:** Static fits data common to all objects; the others are per-object.

---

### Q27. What is the primary purpose of Access Modifiers in Java?

- **A.** To improve program execution speed
- **B.** To control the visibility and accessibility of classes, methods, and variables
- **C.** To reduce memory consumption
- **D.** To convert source code into bytecode

**✅ Correct answer:** B. To control the visibility and accessibility of classes, methods, and variables

**💡 Explanation:** Access modifiers (public, protected, default, private) enforce encapsulation.

---

### Q28. A banking application has a variable balance. The company policy states that balance should not be modified directly by any class outside BankAccount. Which access modifier should be used for the balance variable?

- **A.** public
- **B.** private
- **C.** protected
- **D.** default

**✅ Correct answer:** B. private

**💡 Explanation:** `private` restricts access to the declaring class; expose it via getters/setters.

---

### Q29. An e-commerce application has these requirements: every product has its own price; all products share the same GST_RATE = 18%. Which design is most appropriate?

- **A.** price → static, GST_RATE → instance
- **B.** price → instance, GST_RATE → static
- **C.** Both should be instance variables
- **D.** Both should be static variables

**✅ Correct answer:** B. price → instance, GST_RATE → static

**💡 Explanation:** Price is per object (instance); GST rate is common to all (static).

---

### Q30. An application stores employee IDs. The expected number of employees may grow to several million in the future. Which data type is the safer choice?

- **A.** byte
- **B.** boolean
- **C.** short
- **D.** int

**✅ Correct answer:** D. int

**💡 Explanation:** `byte` (±127) and `short` (±32,767) overflow; `int` handles about 2.1 billion.

---

### Q31. A file-processing application needs the file path to be supplied at runtime because it changes between environments (Dev, QA, Prod). What is the best approach?

- **A.** Hardcode the file path
- **B.** Store it in a local variable
- **C.** Take it as a command-line argument
- **D.** Store it in a method

**✅ Correct answer:** C. Take it as a command-line argument

**💡 Explanation:** Command-line arguments let you supply environment-specific values without changing code.

---

### Q32. A banking application performs this validation: `if(balance > 0 && accountActive)`. If balance > 0 is false, what happens?

- **A.** Both conditions are evaluated
- **B.** Only second condition is evaluated
- **C.** Compile-time error occurs
- **D.** Second condition is skipped

**✅ Correct answer:** D. Second condition is skipped

**💡 Explanation:** `&&` short-circuits: if the left side is false, the right side is not evaluated.

---

### Q33. Which Eclipse shortcut is used to execute the current line of code and move to the next line during debugging?

- **A.** F5
- **B.** F6
- **C.** F7
- **D.** F8

**✅ Correct answer:** B. F6

**💡 Explanation:** F6 = Step Over.

---

### Q34. During debugging in Eclipse, you are stopped at a method call and want to enter inside that method to debug its code. Which shortcut should you use?

- **A.** F5
- **B.** F6
- **C.** F7
- **D.** F8

**✅ Correct answer:** A. F5

**💡 Explanation:** F5 = Step Into.

---

### Q35. During debugging in Eclipse, you want to continue program execution until the next breakpoint is encountered. Which shortcut should you use?

- **A.** F5
- **B.** F6
- **C.** F7
- **D.** F8

**✅ Correct answer:** D. F8

**💡 Explanation:** F8 = Resume.

---

### Q36. While debugging in Eclipse, you have stepped into a method and now want to return to the calling method. Which shortcut should you use?

- **A.** F5
- **B.** F6
- **C.** F7
- **D.** F8

**✅ Correct answer:** C. F7

**💡 Explanation:** F7 = Step Return (finish the current method and return to the caller).

---

### Q37. What will be the output?

```java
class Student {
    int id;
    String name;
}
public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.id);
        System.out.println(s.name);
    }
}
```

- **A.** 0 / null
- **B.** null / 0
- **C.** Compilation Error
- **D.** Garbage Value / Garbage Value

**✅ Correct answer:** C. Compilation Error

**💡 Explanation:** The quiz key marks Compilation Error as correct. By real Java behaviour the output would be option A (`0` then `null`).

> ⚠️ Options A, B and D are two-line outputs (first line printed / second line printed). **The quiz key looks wrong here.** This code compiles and prints `0` then `null` (int fields default to 0, references to null), which was the option the student picked and was scored incorrect. Keep this in mind when revising.

---

### Q38. What will happen?

```java
class Employee {
    Employee(int id) {
        System.out.println(id);
    }
    public static void main(String[] args) {
        Employee e = new Employee();
    }
}
```

- **A.** Default constructor will be automatically created
- **B.** Object will be created with id = 0
- **C.** Compilation error
- **D.** Runtime exception

**✅ Correct answer:** C. Compilation error

**💡 Explanation:** Once any constructor is declared, the compiler no longer supplies the default one, so `new Employee()` has no matching constructor.

---

### Q39. Which is the superclass of all classes in Java?

- **A.** Class
- **B.** Object
- **C.** Main
- **D.** System

**✅ Correct answer:** B. Object

**💡 Explanation:** `java.lang.Object` is the root of the class hierarchy.

---

### Q40. What will happen?

```java
// File 1
package com.a;
public class Test {
    int x = 10;
    protected int y = 20;
    public int z = 30;
}

// File 2
package com.b;
import com.a.Test;
public class Main {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.x);
        System.out.println(t.y);
        System.out.println(t.z);
    }
}
```

- **A.** Prints 10 20 30
- **B.** Runtime Exception
- **C.** Compilation
- **D.** Prints 30 only

**✅ Correct answer:** C. Compilation

**💡 Explanation:** In a different package, default `x` is inaccessible and `protected y` is not accessible via a plain object (Main is not a subclass), so compilation fails. Only `z` (public) is accessible.

---
