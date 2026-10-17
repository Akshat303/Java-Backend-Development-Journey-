# Kodewala Academy – Java Backend Tests: Complete Question Bank (Tests 1)

## Contents
- Test 1 (39 questions)

---

## Test 1 – Java Backend Test # 1



### Q1. Which of the following is a valid variable name?

- **A.** 1name
- **B.** class
- **C.** studentName
- **D.** student-name

**✅ Correct answer:** C. studentName

**💡 Explanation:** Variable names cannot start with numbers, contain hyphens, or use reserved keywords.

---

### Q2. Which command compiles a Java program?

- **A.** java Test
- **B.** compile Test.java
- **C.** javac Test
- **D.** javac Test.java

**✅ Correct answer:** D. javac Test.java

**💡 Explanation:** javac converts source code into bytecode.

---

### Q3. Which symbol is used to terminate a statement in Java?

- **A.** :
- **B.** ,
- **C.** ;
- **D.** .

**✅ Correct answer:** C. ;

**💡 Explanation:** Most Java statements end with a semicolon.

---

### Q4. Which component executes Java bytecode?

- **A.** JDK
- **B.** JVM
- **C.** JRE
- **D.** Compiler

**✅ Correct answer:** B. JVM

**💡 Explanation:** JVM loads and executes .class files.

---

### Q5. Which variable belongs to an object?

- **A.** Static Variable
- **B.** Local Variable
- **C.** Final Variable
- **D.** Instance Variable

**✅ Correct answer:** D. Instance Variable

**💡 Explanation:** Every object gets its own copy of instance variables.

---

### Q6. Which variable is shared among all objects?

- **A.** Static Variable
- **B.** Local Variable
- **C.** Final Variable
- **D.** Instance Variable

**✅ Correct answer:** A. Static Variable

**💡 Explanation:** Static variables belong to the class, not objects.

---

### Q7. What is the output?

```java
System.out.println(10 + 20 + "Java");
```

- **A.** Java1020
- **B.** 1020Java
- **C.** 30Java
- **D.** Error

**✅ Correct answer:** C. 30Java

**💡 Explanation:** Integer addition happens before string concatenation.

---

### Q8. Which statement is correct?

- **A.** JVM contains JRE
- **B.** JRE contains JVM
- **C.** JDK contains only JVM
- **D.** JRE contains JDK

**✅ Correct answer:** B. JRE contains JVM

**💡 Explanation:** JRE = JVM + runtime libraries.

---

### Q9. What is the output?

```java
System.out.println(10 + "20" + 30);
```

- **A.** 102030
- **B.** 60
- **C.** Error
- **D.** 3030

**✅ Correct answer:** A. 102030

**💡 Explanation:** Once a String appears, concatenation starts.

---

### Q10. What is the output?

```java
byte b = 10;
byte c = 20;
byte d = b + c;
```

- **A.** 0
- **B.** 30
- **C.** Compilation Error
- **D.** Runtime Error

**✅ Correct answer:** C. Compilation Error

**💡 Explanation:** b + c becomes int, not byte

---

### Q11. What is the output?

```java
String[] arr = {"Java", "Python"};
System.out.println(arr.length);
```

- **A.** 1
- **B.** 2
- **C.** Error
- **D.** 0

**✅ Correct answer:** B. 2

**💡 Explanation:** Array contains two elements.

---

### Q12. Is the main() method mandatory in every Java class?

- **A.** Yes, every class must have a main method
- **B.** No, only the class that needs to be executed directly requires it
- **C.** No class can have a main method
- **D.** Every object must have a main method

**✅ Correct answer:** B. No, only the class that needs to be executed directly requires it

**💡 Explanation:** A Java class can exist without a main() method. However, if you want to run the class directly using the JVM (java ClassName), it must contain a valid main() method.

---

### Q13. Which is the correct signature of the main() method?

- **A.** public static void main(String args)
- **B.** public void static main(String[] args)
- **C.** public static void main(String[] args)
- **D.** static public main(String[] args)

**✅ Correct answer:** C. public static void main(String[] args)

**💡 Explanation:** The JVM looks for exactly public static void main(String[] args)

---

### Q14. Which of the following is a valid Java class name?

- **A.** 123Student
- **B.** student-details
- **C.** StudentDetails
- **D.** class

**✅ Correct answer:** C. StudentDetails

**💡 Explanation:** Class names follow identifier rules: they cannot start with a digit, contain hyphens, or be a reserved keyword. `StudentDetails` also follows the PascalCase convention.

---

### Q15. What happens if a class does not contain a main() method and you try to run it?

- **A.** Compiles and runs successfully
- **B.** Runtime Error: Main method not found
- **C.** JVM creates a main method automatically
- **D.** Compilation Error

**✅ Correct answer:** B. Runtime Error: Main method not found

**💡 Explanation:** The class will compile successfully, but when executed, the JVM throws: Error: Main method not found in class ...

---

### Q16. What is the primary purpose of JIT (Just-In-Time) Compiler?

- **A.** To compile .java files into .class files
- **B.** To create JVM
- **C.** To load classes into memory
- **D.** To convert bytecode into machine code during execution for better performance

**✅ Correct answer:** D. To convert bytecode into machine code during execution for better performance

**💡 Explanation:** JIT is a part of the JVM. It converts frequently executed bytecode into native machine code, making Java programs run faster.

> ⚠️ This question appears twice (Q16 and Q17) in the test with identical content.

---

### Q17. What is the primary purpose of JIT (Just-In-Time) Compiler?

- **A.** To compile .java files into .class files
- **B.** To create JVM
- **C.** To load classes into memory
- **D.** To convert bytecode into machine code during execution for better performance

**✅ Correct answer:** D. To convert bytecode into machine code during execution for better performance

**💡 Explanation:** JIT is a part of the JVM. It converts frequently executed bytecode into native machine code, making Java programs run faster.

> ⚠️ This question appears twice (Q16 and Q17) in the test with identical content.

---

### Q18. Why should hardcoding values be avoided in Java applications?

- **A.** It improves performance
- **B.** It reduces memory usage
- **C.** It makes maintenance and configuration difficult
- **D.** It is required by the JVM

**✅ Correct answer:** C. It makes maintenance and configuration difficult

**💡 Explanation:** Hardcoded values (database URLs, passwords, file paths, etc.) make applications difficult to maintain. Such values should be stored in configuration files, environment variables, or properties files.

---

### Q19. Why is Java called a Platform Independent language?

- **A.** Java programs do not require a compiler
- **B.** Java source code runs directly on the operating system
- **C.** Java bytecode can run on any platform that has a JVM
- **D.** Java works only on Windows and Linux

**✅ Correct answer:** C. Java bytecode can run on any platform that has a JVM

**💡 Explanation:** When Java code is compiled, it is converted into bytecode (.class file). This bytecode is not specific to any operating system. Any machine with a JVM (Java Virtual Machine) can execute it. This is the reason behind Java's famous principle: "Write Once, Run Anywhere (WORA)".

---

### Q20. Where are objects stored in Java memory?

- **A.** Stack Memory
- **B.** Heap Memory
- **C.** Method Area
- **D.** CPU Cache

**✅ Correct answer:** B. Heap Memory

**💡 Explanation:** Objects created using the new keyword are stored in the Heap Memory. The reference variable may be stored elsewhere, but the actual object resides in the heap.

---

### Q21. Where are local variables stored?

- **A.** Heap Memory
- **B.** MetaSpace
- **C.** PermGen
- **D.** Stack Memory

**✅ Correct answer:** D. Stack Memory

**💡 Explanation:** Local variables declared inside methods are stored in the Stack Memory and are automatically removed when the method execution completes.

---

### Q22. What is a common use case of a static variable in Java?

- **A.** Storing object-specific data
- **B.** Storing data shared by all objects of a class
- **C.** Creating objects
- **D.** Storing local variables

**✅ Correct answer:** B. Storing data shared by all objects of a class

**💡 Explanation:** Static variables belong to the class, not to individual objects. Only one copy exists and is shared by all objects.

---

### Q23. What is the scope of a local variable in Java?

- **A.** Entire class
- **B.** Entire package
- **C.** Only within the method/block where it is declared
- **D.** Entire application

**✅ Correct answer:** C. Only within the method/block where it is declared

**💡 Explanation:** A local variable can be accessed only inside the method, constructor, or block in which it is declared. It cannot be accessed outside that scope.

---

### Q24. Which statement about the main() method is TRUE?

- **A.** It must always be the first method in the class.
- **B.** It can be non-static.
- **C.** A class can compile without a main method.
- **D.** Every class must contain a main method.

**✅ Correct answer:** C. A class can compile without a main method.

**💡 Explanation:** A class without main() compiles successfully. The JVM requires main() only when you try to run that class directly.

---

### Q25. What is the relationship between a .java file, classes, and .class files?

```java
Consider the following code saved in Test.java:


class A 
{

}
class B 
{

}
public class Test 
{
    public static void main(String[] args)
    {

    }
}
After compilation (javac Test.java), how many .class files will be generated?
```

- **A.** Compilation Error
- **B.** 1
- **C.** 2
- **D.** 3

**✅ Correct answer:** D. 3

**💡 Explanation:** Java creates one .class file for each class.

---

### Q26. Which statement is TRUE?

- **A.** One .java file can contain only one class.
- **B.** One .java file can contain multiple classes.
- **C.** One class generates multiple .class files always.
- **D.** A .class file contains Java source code.

**✅ Correct answer:** B. One .java file can contain multiple classes.

**💡 Explanation:** A Java source file can contain multiple classes, but at most one public class. The file name must match the public class name.

---

### Q27. File Name is Demo.java

What will happen?

```java

public class Test 
{
    public static void main(String[] args) 
    {
        System.out.println("Hello");
    }
}
```

- **A.** Runs successfully
- **B.** Generates Demo.class
- **C.** Compilation Error
- **D.** Runtime Error

**✅ Correct answer:** C. Compilation Error

**💡 Explanation:** When a class is declared public, the file name must exactly match the public class name.

---

### Q28. What will happen when the following program is executed without any command-line arguments?

```java
public class Test 
{
    public static void main(String[] args) 
    {
        System.out.println(args[0]);
    }
}
```

- **A.** null
- **B.** blank output
- **C.** ArrayIndexOutOfBoundsException
- **D.** Compilation failure

**✅ Correct answer:** C. ArrayIndexOutOfBoundsException

**💡 Explanation:** Since no arguments are passed, args.length is 0. Accessing args[0] causes an ArrayIndexOutOfBoundsException (AIOBE) at runtime.

---

### Q29. What is the output?

```java
public class Test 
{
    public static void main(String[] args) {
        if(args.length > 0) {
            System.out.println(args[0]);
        } else {
            System.out.println("No Arguments");
        }
    }
}

Executed as: java Test
```

- **A.** null
- **B.** No Arguments
- **C.** ArrayIndexOutOfBoundsException
- **D.** Compilation failure

**✅ Correct answer:** B. No Arguments

**💡 Explanation:** The code safely checks args.length before accessing the array, preventing ArrayIndexOutOfBoundsException. This is the recommended way to handle command-line arguments.

---

### Q30. What is the output?

```java
public class Test {
    public static void main(String[] args) {
        System.out.println(args.length);
    }
}

executed as :        java Test Java Spring Boot
```

- **A.** 2
- **B.** 3
- **C.** 4
- **D.** Compilation failure

**✅ Correct answer:** B. 3

**💡 Explanation:** The array contains 3 elements

---

### Q31. A Java Employee class is responsible for:

```java
class Employee {
    void calculateSalary() {
        // salary calculation
    }
    void generateSalarySlip() {
        // generate PDF
    }
    void sendEmail() {
        // send salary slip by email
    }
}

Which SOLID principle is violated in this design?
```

- **A.** Open/Closed Principle
- **B.** Single Responsibility Principle
- **C.** Liskov Substitution Principle
- **D.** Dependency Inversion Principle

**✅ Correct answer:** B. Single Responsibility Principle

**💡 Explanation:** The class mixes salary calculation, PDF generation and emailing. Each class should have only one reason to change, so this violates the Single Responsibility Principle.

---

### Q32. What does the “S” in SOLID stand for?

- **A.** Service Segregation Principle
- **B.** Single Responsibility Principle
- **C.** System Responsibility Principle
- **D.** Software Responsibility Principle

**✅ Correct answer:** B. Single Responsibility Principle

**💡 Explanation:** SOLID = Single Responsibility, Open/Closed, Liskov Substitution, Interface Segregation, Dependency Inversion.

---

### Q33. A developer writes the following code:

```java
class PaymentService {
    void processPayment() {
        String paymentUrl = "https://payment.example.com/api";
        // payment logic
    }
}
The payment URL is hardcoded inside the Java class.
What is the main disadvantage of hardcoding values like this?
```

- **A.** It makes the application faster
- **B.** It makes the code easier to maintain and change
- **C.** Changes require modifying and redeploying the source code
- **D.** It automatically improves security

**✅ Correct answer:** C. Changes require modifying and redeploying the source code

**💡 Explanation:** A hardcoded value is baked into the source, so any change (e.g. a different URL per environment) needs a code change and redeployment. Externalise it in properties files or environment variables.

---

### Q34. Consider the following code:

```java
class Test {
    static void display() {
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        display();
    }
}

When display() is called, where is the method call information stored during execution?
```

- **A.** Heap
- **B.** Stack
- **C.** String Pool
- **D.** CPU Cache

**✅ Correct answer:** B. Stack

**💡 Explanation:** Each method call creates a stack frame on the Stack (holding parameters, local variables and return address), which is removed when the method returns.

---

### Q35. 

```java
int a = 10;
int b = 20;
System.out.println(a > 5 && b < 15);

```

output ?

- **A.** true
- **B.** false
- **C.** Runtime error
- **D.** Compilation error

**✅ Correct answer:** B. false

**💡 Explanation:** `a > 5` is true but `b < 15` is false (20 < 15), so `true && false` = false.

---

### Q36. int a = 10;

```java
if (a > 5 || ++a > 10) {
    System.out.println(a);
}
```

- **A.** 10
- **B.** 11
- **C.** Runtime error
- **D.** Compilation error

**✅ Correct answer:** A. 10

**💡 Explanation:** `a > 5` is already true, so `||` short-circuits and `++a` is never evaluated. `a` stays 10.

---

### Q37. A software company starts a new project. Before writing any code, the team meets with the client to understand business requirements, features, and user expectations.

```java
Which phase of the Software Development Life Cycle (SDLC) is this?
```

- **A.** Design
- **B.** Testing
- **C.** Implementation(Development)
- **D.** Requirement Analysis

**✅ Correct answer:** D. Requirement Analysis

**💡 Explanation:** Gathering business requirements and client expectations before coding is the Requirement Analysis phase of the SDLC.

---

### Q38. What is a JAR file in Java?

- **A.** Java Application Runtime file
- **B.** Java Archive file used to package Java classes and resources
- **C.** Java Assembly Reference file
- **D.** Java Application Registry file

**✅ Correct answer:** B. Java Archive file used to package Java classes and resources

**💡 Explanation:** A JAR (Java Archive) bundles compiled classes and resources into a single distributable file.

---

### Q39. Which command is used to create a JAR file?

- **A.** jar cvf app.jar *.class
- **B.** jar xvf app.jar
- **C.** javac app.jar
- **D.** java create app.jar

**✅ Correct answer:** A. jar cvf app.jar *.class

**💡 Explanation:** `jar cvf app.jar *.class`: c = create, v = verbose, f = output file name.

---

