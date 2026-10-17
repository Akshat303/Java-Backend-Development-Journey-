# Kodewala Academy – Java Backend Tests: Complete Question Bank (Test 3)

## Contents

- Test 3 (45 questions)


---

## Test 3 – Java Backend Test # 3

45 questions

### Q1. Which statement is true about JDK?

- **A.** Contains only JVM
- **B.** Contains only JRE
- **C.** Contains only compiler
- **D.** Contains JRE, JVM, and development tools

**✅ Correct answer:** D. Contains JRE, JVM, and development tools

**💡 Explanation:** JDK = JRE (which includes JVM) + development tools such as `javac`.

---

### Q2. Why is Java called platform independent?

- **A.** Java code is interpreted directly by OS
- **B.** Bytecode can run on any JVM
- **C.** Java programs require no OS
- **D.** JVM is platform independent

**✅ Correct answer:** B. Bytecode can run on any JVM

**💡 Explanation:** Source compiles to bytecode, which runs on any platform having a JVM (WORA).

---

### Q3. What is the output?

```java
int i = 1;
while(i <= 3){
    System.out.print(i++);
}
```

- **A.** 0123
- **B.** 123
- **C.** 1234
- **D.** Infinite loop

**✅ Correct answer:** B. 123

**💡 Explanation:** Prints 1, 2, 3 (post-increment), then i becomes 4 and the loop ends.

---

### Q4. Which loop executes at least once?

- **A.** for
- **B.** while
- **C.** do-while
- **D.** enhanced for loop

**✅ Correct answer:** C. do-while

**💡 Explanation:** `do-while` checks its condition after the body.

---

### Q5. Which operator short-circuits evaluation?

- **A.** &
- **B.** Both || and &&
- **C.** ||
- **D.** &&

**✅ Correct answer:** B. Both || and &&

**💡 Explanation:** `&&` and `||` skip the right operand when the result is already known; `&` doesn't.

---

### Q6. What is stored in args[0]?

```java
// java Test Hello
```

- **A.** Test
- **B.** java
- **C.** Hello
- **D.** args

**✅ Correct answer:** C. Hello

**💡 Explanation:** `args` holds only the arguments after the class name, so `args[0]` is `Hello`.

---

### Q7. Which member belongs to the class rather than an object?

- **A.** Instance Variable
- **B.** Static Variable
- **C.** Local
- **D.** None of the above

**✅ Correct answer:** B. Static Variable

**💡 Explanation:** Static members belong to the class.

---

### Q8. Which method signature is valid?

- **A.** void test(int a)
- **B.** int test()
- **C.** public static void main(String[] args)
- **D.** All of the above

**✅ Correct answer:** D. All of the above

**💡 Explanation:** All three are syntactically valid method declarations.

---

### Q9. Can two methods have the same name?

- **A.** Never
- **B.** Only in different classes
- **C.** Yes, through method overloading
- **D.** No

**✅ Correct answer:** C. Yes, through method overloading

**💡 Explanation:** Methods with the same name but different parameter lists are overloaded.

---

### Q10. Which access modifier gives the widest accessibility?

- **A.** protected
- **B.** private
- **C.** public
- **D.** default

**✅ Correct answer:** C. public

**💡 Explanation:** `public` is accessible from everywhere.

---

### Q11. Which access modifier restricts access within the same class only?

- **A.** protected
- **B.** private
- **C.** public
- **D.** default

**✅ Correct answer:** B. private

**💡 Explanation:** `private` is limited to the declaring class.

---

### Q12. What is the output?

```java
for(int i=1;i<=5;i++){
    if(i==3)
    {
        continue;
    }
    System.out.print(i);
}
```

- **A.** 12345
- **B.** 1245
- **C.** 345
- **D.** 12

**✅ Correct answer:** B. 1245

**💡 Explanation:** `continue` skips the print when i == 3, giving 1245.

---

### Q13. What is the output?

```java
for(int i=1;i<=5;i++){
    if(i==3)
    {
        break;
    }
    System.out.print(i);
}
```

- **A.** 12345
- **B.** 1245
- **C.** 345
- **D.** 12

**✅ Correct answer:** D. 12

**💡 Explanation:** `break` exits the loop at i == 3, so only 1 and 2 are printed.

---

### Q14. Which statement immediately exits a method?

- **A.** break
- **B.** continue
- **C.** exit
- **D.** return

**✅ Correct answer:** D. return

**💡 Explanation:** `return` ends method execution and returns to the caller.

---

### Q15. Which package is automatically imported?

- **A.** java.util
- **B.** java.io
- **C.** java.lang
- **D.** java.sql

**✅ Correct answer:** C. java.lang

**💡 Explanation:** `java.lang` (String, System, Object...) is imported implicitly.

---

### Q16. Which statement about packages is correct?

- **A.** Package names must start with capital letters
- **B.** Packages help avoid naming conflicts
- **C.** Package names can contain spaces
- **D.** Packages are optional folders

**✅ Correct answer:** B. Packages help avoid naming conflicts

**💡 Explanation:** Packages namespace classes, avoiding name clashes and organising code.

---

### Q17. What is the size of the array?

```java
int[] arr = new int[5];
```

- **A.** 4
- **B.** 5
- **C.** 6
- **D.** Depends on JVM

**✅ Correct answer:** B. 5

**💡 Explanation:** `new int[5]` allocates 5 elements (indexes 0-4).

---

### Q18. What is the default value of an int array element?

- **A.** null
- **B.** 1
- **C.** 0
- **D.** Undefined

**✅ Correct answer:** C. 0

**💡 Explanation:** Numeric arrays are zero-initialised.

---

### Q19. What happens?

```java
int[] arr = new int[3];
System.out.println(arr[3]);
```

- **A.** 0
- **B.** null
- **C.** ArrayIndexOutOfBoundsException
- **D.** Compilation Error

**✅ Correct answer:** C. ArrayIndexOutOfBoundsException

**💡 Explanation:** Valid indexes are 0-2. Index 3 throws an exception at runtime.

---

### Q20. Which is NOT a JVM memory area?

- **A.** Heap
- **B.** stack
- **C.** metaspace
- **D.** Database Area

**✅ Correct answer:** D. Database Area

**💡 Explanation:** JVM areas include Heap, Stack, Metaspace/Method Area, PC registers, native stack. There is no 'Database Area'.

---

### Q21. What is the output?

```java
public class Test{
    static int count;
    public static void main(String[] args){
        System.out.println(count);
    }
}
```

- **A.** null
- **B.** 0
- **C.** 1
- **D.** Compilation Error

**✅ Correct answer:** B. 0

**💡 Explanation:** Static int fields default to 0.

---

### Q22. Coupon Validation: what is the output?

```java
boolean isPremium = false;
boolean couponValid = true;
if(isPremium || couponValid)
{
    System.out.println("Discount Applied");
}
```

- **A.** No Output
- **B.** Discount Applied
- **C.** Compilation Error
- **D.** Runtime Error

**✅ Correct answer:** B. Discount Applied

**💡 Explanation:** `false || true` is true, so the message prints.

---

### Q23. Which class can access stock directly?

```java
public class Inventory{
    private int stock = 10;
}
```

- **A.** Any class
- **B.** Same package
- **C.** Subclass
- **D.** Inventory class only

**✅ Correct answer:** D. Inventory class only

**💡 Explanation:** `private` limits access to the declaring class.

---

### Q24. What is the output?

```java
int[] ids = {101,102,103};
System.out.println(ids[3]);
```

- **A.** 103
- **B.** null
- **C.** ArrayIndexOutOfBoundsException
- **D.** 0

**✅ Correct answer:** C. ArrayIndexOutOfBoundsException

**💡 Explanation:** The array has 3 elements (indexes 0-2), so `ids[3]` throws an exception.

---

### Q25. A customer can get a discount if they are a premium member OR they have a valid coupon. Why is validCoupon not evaluated?

```java
boolean premiumMember = true;
boolean validCoupon = false;
if(premiumMember || validCoupon)
{
    System.out.println("Discount Applied");
}
```

- **A.** JVM Optimization
- **B.** Compiler Error
- **C.** Short-Circuit Evaluation of ||
- **D.** Both variables are boolean

**✅ Correct answer:** C. Short-Circuit Evaluation of ||

**💡 Explanation:** `premiumMember` is already true, so `||` short-circuits.

---

### Q26. Which key should be used if you want to see the execution of `return a + b;` when the debugger is stopped at `int result = add(10, 20);`?

```java
public static void main(String[] args)
{
    int result = add(10, 20);
    System.out.println(result);
}
public static int add(int a, int b)
{
    return a + b;
}
```

- **A.** F8
- **B.** F7
- **C.** F6
- **D.** F5

**✅ Correct answer:** D. F5

**💡 Explanation:** F5 (Step Into) enters the `add()` method.

---

### Q27. You are debugging `int result = add(10,20);`. You don't want to enter the add() method. Which key should you use?

- **A.** F8
- **B.** F7
- **C.** F6
- **D.** F5

**✅ Correct answer:** C. F6

**💡 Explanation:** F6 (Step Over) executes the call without entering the method.

---

### Q28. What does F8 do?

- **A.** Enter method
- **B.** Execute current line only
- **C.** Run till next breakpoint or program completion
- **D.** Exit JVM

**✅ Correct answer:** C. Run till next breakpoint or program completion

**💡 Explanation:** F8 = Resume.

---

### Q29. Which variable is stored in Stack Memory during execution?

```java
class Product {
    static int gst = 18;
    int price = 1000;
    public void calculate() {
        int discount = 100;
    }
}
```

- **A.** gst
- **B.** price
- **C.** discount
- **D.** Product object

**✅ Correct answer:** C. discount

**💡 Explanation:** `discount` is a local variable (stack). `gst` is static (method area/metaspace) and `price` lives in the object on the heap.

---

### Q30. An inventory system stores 10,000 product IDs in an array. Which characteristic of arrays allows quick retrieval of any element using its index?

- **A.** Elements are sorted automatically.
- **B.** Elements are stored in contiguous memory locations.
- **C.** Arrays use HashMap internally.
- **D.** Arrays store data in Method Area.

**✅ Correct answer:** B. Elements are stored in contiguous memory locations.

**💡 Explanation:** Contiguous storage gives O(1) access: address = base + index × size.

---

### Q31. If arrays require contiguous memory, what happens when we need a larger array?

- **A.** JVM automatically increases the same memory block.
- **B.** A new larger array is created and data is copied.
- **C.** Existing array size changes.
- **D.** Array moves to Stack.

**✅ Correct answer:** B. A new larger array is created and data is copied.

**💡 Explanation:** Array size is fixed, so you allocate a bigger array and copy elements over.

---

### Q32. When should a for loop be preferred over a while loop?

- **A.** When the number of iterations is unknown
- **B.** Only for arrays
- **C.** Only for strings
- **D.** When the number of iterations is known in advance

**✅ Correct answer:** D. When the number of iterations is known in advance

**💡 Explanation:** `for` bundles init, condition and update, which suits a known iteration count.

---

### Q33. Which loop is generally preferred for reading user input until the user enters a specific value?

- **A.** for loop
- **B.** while loop
- **C.** do-while
- **D.** none

**✅ Correct answer:** B. while loop

**💡 Explanation:** The iteration count is unknown, so a condition-driven `while` loop fits.

---

### Q34. What happens?

```java
for( ; ; )
{
    System.out.println("Java");
}
```

- **A.** Prints once
- **B.** Compilation Error
- **C.** Infinite Loop
- **D.** Runtime Exception

**✅ Correct answer:** C. Infinite Loop

**💡 Explanation:** With no condition, `for(;;)` runs forever.

---

### Q35. Which statement is TRUE?

- **A.** for loop cannot become an infinite loop.
- **B.** while loop cannot become an infinite loop.
- **C.** Both for and while can become infinite loops.
- **D.** Neither can become an infinite loop.

**✅ Correct answer:** C. Both for and while can become infinite loops.

**💡 Explanation:** Any loop whose condition never becomes false (or is omitted) runs forever.

---

### Q36. An ATM application keeps asking for a PIN until the correct PIN is entered. Which loop is more suitable?

- **A.** for
- **B.** while
- **C.** do-while
- **D.** switch

**✅ Correct answer:** B. while

**💡 Explanation:** The number of attempts is unknown, so a condition-based loop fits.

---

### Q37. An inventory system needs to scan exactly 500 products. Which loop should be preferred?

- **A.** while loop because it is faster
- **B.** for loop because the number of iterations is known
- **C.** switch case
- **D.** do-while

**✅ Correct answer:** B. for loop because the number of iterations is known

**💡 Explanation:** A known iteration count suits `for`; speed is not the reason.

---

### Q38. An inventory system needs to scan exactly 500 products. Which loop should be preferred? (duplicate)

- **A.** while loop because it is faster
- **B.** for loop because the number of iterations is known
- **C.** switch case
- **D.** do-while

**✅ Correct answer:** B. for loop because the number of iterations is known

**💡 Explanation:** Same as Q37: use `for` when the iteration count is known.

> ⚠️ This question appears twice (Q37 and Q38) in the test; the stem is identical.

---

### Q39. What is the output?

```java
class A {
    A() { System.out.println("A"); }
    A(int x) { this(); System.out.println("A-int"); }
}
class B extends A {
    B() { this(10); System.out.println("B"); }
    B(int x) { super(x); System.out.println("B-int"); }
}
public class Test {
    public static void main(String[] args) { new B(); }
}
```

- **A.** A → A-int → B-int → B
- **B.** A-int → A → B → B-int
- **C.** A → B-int → A-int → B
- **D.** Compilation error

**✅ Correct answer:** A. A → A-int → B-int → B

**💡 Explanation:** `B()` → `this(10)` → `B(int)` → `super(x)` → `A(int)` → `this()` → `A()` prints A; then A-int, B-int, B.

---

### Q40. What is the output?

```java
int total = 0;
for (int i = 1; i <= 5; i++)
{
    if (i % 2 == 0)
    {
        continue;
    }
    total += i;
    if (total > 4)
    {
        break;
    }
}
System.out.println(total);
```

- **A.** 1
- **B.** 4
- **C.** 5
- **D.** 9

**✅ Correct answer:** D. 9

**💡 Explanation:** i=1 → total 1; i=2 skipped; i=3 → total 4 (not > 4); i=4 skipped; i=5 → total 9 > 4 → break. Prints 9.

---

### Q41. Output?

```java
class Parent {
    Parent() { System.out.println("Parent"); }
}
class Child extends Parent {
    Child() { this(10); System.out.println("Child"); }
    Child(int x) { System.out.println("Child-int"); }
}
public class Test {
    public static void main(String[] args) { new Child(); }
}
```

- **A.** Child → Child-int → Parent
- **B.** Parent → Child-int → Child
- **C.** Child-int → Parent → Child
- **D.** Compilation error

**✅ Correct answer:** B. Parent → Child-int → Child

**💡 Explanation:** `Child()` delegates to `Child(int)`, which implicitly calls `super()`. Order: Parent, Child-int, Child.

---

### Q42. Which statement about this() and super() is correct?

- **A.** Both can be used together in the same constructor
- **B.** this() must always be the last statement
- **C.** this() or super() must be the first statement of a constructor
- **D.** super() can be called from any method

**✅ Correct answer:** C. this() or super() must be the first statement of a constructor

**💡 Explanation:** A constructor call must be the first statement, and only one of the two can be used.

---

### Q43. What happens?

```java
class A {
    A() { this(10); }
    A(int x) { this(); }
}
```

- **A.** Executes successfully
- **B.** Runtime exception
- **C.** Compile-time error due to recursive constructor invocation
- **D.** StackOverflowError at runtime

**✅ Correct answer:** C. Compile-time error due to recursive constructor invocation

**💡 Explanation:** Constructors calling each other in a cycle are detected by the compiler (recursive constructor invocation).

---

### Q44. What happens?

```java
class A {
    A(int x) { System.out.println("A"); }
}
class B extends A {
    B() { System.out.println("B"); }
}
```

- **A.** A → B
- **B.** B only
- **C.** Compilation error
- **D.** Runtime exception

**✅ Correct answer:** C. Compilation error

**💡 Explanation:** `B()` implicitly calls `super()`, but `A` has no no-arg constructor (only `A(int)`), so compilation fails.

---

### Q45. What will be printed, and what will be the final values of orderId and status?

```java
class Order {
    int orderId;
    String status;
    Order() { this(0); System.out.println("Default Order"); }
    Order(int orderId) { this(orderId, "NEW"); System.out.println("Order with ID"); }
    Order(int orderId, String status) {
        this.orderId = orderId;
        this.status = status;
        System.out.println("Order Created");
    }
}
public class Test {
    public static void main(String[] args) { Order order = new Order(); }
}
```

- **A.** Order Created / Order with ID / Default Order / orderId = 0 / status = "NEW"
- **B.** Default Order / Order with ID / Order Created / orderId = 0 / status = "NEW"
- **C.** Order Created / Default Order / Order with ID / orderId = 0 / status = null
- **D.** Compilation error because constructors cannot call another constructor

**✅ Correct answer:** A. Order Created / Order with ID / Default Order / orderId = 0 / status = "NEW"

**💡 Explanation:** `new Order()` → `this(0)` → `this(0,"NEW")`. The innermost runs first (Order Created), then Order with ID, then Default Order. Final values: orderId = 0, status = "NEW".

---

## Test 4 – Java Backend Test # 4

31 questions

### Q1. What is the output?

```java
String s1 = new String("Java");
String s2 = new String("Java");
System.out.println(s1 == s2);
```

- **A.** true
- **B.** false
- **C.** 0
- **D.** 1

**✅ Correct answer:** B. false

**💡 Explanation:** `new` always creates a distinct heap object, and `==` compares references.

---

### Q2. What is the output?

```java
String s1 = "Java";
String s2 = new String("java");
System.out.println(s1.equals(s2));
```

- **A.** true
- **B.** Compilation Error
- **C.** false
- **D.** 1

**✅ Correct answer:** C. false

**💡 Explanation:** `equals()` is case-sensitive: "Java" ≠ "java".

---

### Q3. What is the output?

```java
String s = "Hello";
s.concat(" World");
System.out.println(s);
```

- **A.** Hello World
- **B.** Compilation Error
- **C.** Runtime Error
- **D.** Hello

**✅ Correct answer:** D. Hello

**💡 Explanation:** Strings are immutable. `concat` returns a new String that was discarded, so `s` is unchanged.

---

### Q4. Which method compares String contents?

- **A.** ==
- **B.** equals()
- **C.** hashCode()
- **D.** compare()

**✅ Correct answer:** B. equals()

**💡 Explanation:** `equals()` compares content; `==` compares references.

---

### Q5. Which statement is TRUE?

- **A.** String is mutable
- **B.** StringBuilder is immutable
- **C.** String is immutable
- **D.** StringBuffer is immutable

**✅ Correct answer:** C. String is immutable

**💡 Explanation:** String objects cannot change after creation; StringBuilder/StringBuffer are mutable.

---

### Q6. Which method is inherited by every Java class?

- **A.** None
- **B.** Both - equals() and hashCode()
- **C.** hashCode()
- **D.** equals()

**✅ Correct answer:** B. Both - equals() and hashCode()

**💡 Explanation:** Every class inherits from `Object`, which provides both `equals()` and `hashCode()`.

---

### Q7. What happens if equals() is not overridden?

- **A.** Compares content
- **B.** Uses == internally
- **C.** Compilation Error
- **D.** Runtime Exception

**✅ Correct answer:** B. Uses == internally

**💡 Explanation:** `Object.equals()` compares references, behaving like `==`.

---

### Q8. Which class is final?

- **A.** Object
- **B.** Thread
- **C.** String
- **D.** Exception

**✅ Correct answer:** C. String

**💡 Explanation:** `String` is declared `final`, so it cannot be extended.

---

### Q9. When is a constructor called?

- **A.** Method call
- **B.** Object creation
- **C.** Compilation
- **D.** Garbage collection

**✅ Correct answer:** B. Object creation

**💡 Explanation:** A constructor runs when an object is created with `new`.

---

### Q10. If no constructor is written:

- **A.** Compilation Error
- **B.** JVM creates
- **C.** Compiler provides default constructor
- **D.** None

**✅ Correct answer:** C. Compiler provides default constructor

**💡 Explanation:** The compiler adds a no-arg default constructor.

---

### Q11. The first statement inside a constructor can be:

- **A.** super()
- **B.** this()
- **C.** either super() or this()
- **D.** anything

**✅ Correct answer:** C. either super() or this()

**💡 Explanation:** The first statement may be `this(...)` or `super(...)`; otherwise the compiler inserts `super()`.

---

### Q12. Which keyword invokes the parent constructor?

- **A.** parent()
- **B.** this()
- **C.** super()
- **D.** extends()

**✅ Correct answer:** C. super()

**💡 Explanation:** `super()` calls the superclass constructor.

---

### Q13. Object class is:

- **A.** Parent of all classes
- **B.** Interface
- **C.** Final class
- **D.** Abstract class

**✅ Correct answer:** A. Parent of all classes

**💡 Explanation:** `java.lang.Object` is the root class of every Java class.

---

### Q14. Instance variable is created:

- **A.** Once
- **B.** During class loading
- **C.** With every object
- **D.** During compilation

**✅ Correct answer:** C. With every object

**💡 Explanation:** Each object gets its own copy when it is created.

---

### Q15. A Java application receives thousands of requests simultaneously. Each request builds a large string by appending multiple values. The same string object is shared by multiple threads.

- **A.** String
- **B.** StringBuilder
- **C.** StringBuffer
- **D.** Thread

**✅ Correct answer:** C. StringBuffer

**💡 Explanation:** A shared mutable string needs thread safety. `StringBuffer`'s methods are synchronized; `StringBuilder` is not.

---

### Q16. Why is StringBuilder preferred over StringBuffer in this program?

```java
public class Demo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append(i);
        }
        System.out.println(sb.length());
    }
}
```

- **A.** StringBuilder uses less memory
- **B.** StringBuilder is immutable.
- **C.** StringBuffer cannot append integers.
- **D.** The program is single-threaded, so synchronization overhead is unnecessary.

**✅ Correct answer:** D. The program is single-threaded, so synchronization overhead is unnecessary.

**💡 Explanation:** Only one thread is used, so StringBuffer's synchronization is pure overhead. StringBuilder is faster here (and it's mutable, not immutable).

---

### Q17. A developer accidentally loses the source code (.java files), but the compiled .class files are still available. Which statement is correct?

- **A.** It is impossible to recover the Java code.
- **B.** A Java decompiler can generate readable Java source code from the .class files, although comments and original formatting are usually lost.
- **C.** The JVM can automatically recreate the original source code with comments.
- **D.** The .class file contains only machine code, so decompilation is impossible.

**✅ Correct answer:** B. A Java decompiler can generate readable Java source code from the .class files, although comments and original formatting are usually lost.

**💡 Explanation:** Bytecode retains enough structure to be decompiled, but comments and formatting are lost.

---

### Q18. What happens? (Employee does NOT override equals().)

```java
Employee e1 = new Employee(101);
Employee e2 = new Employee(101);
System.out.println(e1.equals(e2));
```

- **A.** true
- **B.** false
- **C.** Compilation Error
- **D.** Runtime Exception

**✅ Correct answer:** B. false

**💡 Explanation:** The default `equals()` compares references; two separate objects are not equal.

---

### Q19. A banking application updates a shared transaction log using multiple threads simultaneously. Which class should be used?

- **A.** String
- **B.** StringBuilder
- **C.** StringBuffer
- **D.** char[]

**✅ Correct answer:** C. StringBuffer

**💡 Explanation:** StringBuffer is synchronized and thread-safe.

---

### Q20. What will be printed?

```java
String id1 = new String("P101");
String id2 = new String("P101");
if(id1 == id2){
    System.out.println("Cache Hit");
}else{
    System.out.println("Cache Miss");
}
```

- **A.** Cache Hit
- **B.** Cache Miss
- **C.** Compilation Error
- **D.** Depends on JVM

**✅ Correct answer:** B. Cache Miss

**💡 Explanation:** Two `new String` objects are different references, so `==` is false. Use `equals()`.

---

### Q21. How many String objects are created at runtime?

```java
String s = "Java" + "Backend";
```

- **A.** 0
- **B.** 1
- **C.** 2
- **D.** 3

**✅ Correct answer:** B. 1

**💡 Explanation:** Concatenating two literals is a compile-time constant ("JavaBackend"), so only one pooled String exists.

---

### Q22. Why is the constructor made private?

```java
public class Utility {
    private Utility()
    {
    }
}
```

- **A.** To improve performance.
- **B.** To prevent object creation because the class contains only utility/static methods.
- **C.** To support inheritance.
- **D.** To reduce memory usage.

**✅ Correct answer:** B. To prevent object creation because the class contains only utility/static methods.

**💡 Explanation:** A private constructor stops instantiation (as with utility classes and singletons).

---

### Q23. Output?

```java
String s1 = "Java";
String s2 = new String("Java");
String s3 = s2.intern();
System.out.println(s1 == s2);
System.out.println(s1 == s3);
System.out.println(s2 == s3);
```

- **A.** true, true, true
- **B.** false, true, false
- **C.** false, false, true
- **D.** true, false, false

**✅ Correct answer:** B. false, true, false

**💡 Explanation:** `s2` is a heap object (≠ s1). `intern()` returns the pooled instance, same as `s1`, so s1 == s3 is true and s2 == s3 is false.

---

### Q24. Order class has only `Order(String orderId)` and no equals()/hashCode(). Two orders `new Order("ORD101")` print "New Order" with `o1.equals(o2)`, but the business wants same orderId to be equal. What is the best solution?

```java
public class Order {
    private String orderId;
    public Order(String orderId) { this.orderId = orderId; }
}
```

- **A.** Compare o1 == o2
- **B.** Override only hashCode().
- **C.** Override both equals() and hashCode() based on orderId.
- **D.** Make orderId static.

**✅ Correct answer:** C. Override both equals() and hashCode() based on orderId.

**💡 Explanation:** Override `equals()` for logical equality and `hashCode()` consistently, which is required for hash-based collections.

---

### Q25. What is the output?

```java
String s1 = "Ja" + "va";
String s2 = "Java";
System.out.println(s1 == s2);
```

- **A.** true
- **B.** false
- **C.** Compilation error
- **D.** Runtime Error

**✅ Correct answer:** A. true

**💡 Explanation:** The compiler folds the constant expression to "Java", so both refer to the same pooled String.

---

### Q26. What is the output?

```java
String a = "Java";
String b = "Ja";
String c = b + "va";
System.out.println(a == c);
System.out.println(a == c.intern());
```

- **A.** true, true
- **B.** false, true
- **C.** false, false
- **D.** true, false

**✅ Correct answer:** B. false, true

**💡 Explanation:** `b` is not final, so `b + "va"` is built at runtime on the heap (a ≠ c). `c.intern()` returns the pooled "Java" (a == intern is true).

---

### Q27. What is the output?

```java
String s1 = new String("Spring");
String s2 = s1.intern();
System.out.println(s1 == s2);
System.out.println(s2 == "Spring");
```

- **A.** true, true
- **B.** false, false
- **C.** false, true
- **D.** true, false

**✅ Correct answer:** C. false, true

**💡 Explanation:** `s1` is a heap copy; `s2` is the pooled instance, so s1 == s2 is false. The literal "Spring" is the same pooled instance, so s2 == "Spring" is true.

---

### Q28. What is the output?

```java
final String x = "Ja";
String s1 = x + "va";
String s2 = "Java";
System.out.println(s1 == s2);
```

- **A.** true
- **B.** false
- **C.** Compilation error
- **D.** Depends on garbage collection

**✅ Correct answer:** A. true

**💡 Explanation:** `x` is a final constant variable, so `x + "va"` is a compile-time constant interned as "Java". Result: true.

---

### Q29. Which approach is generally best for repeated string concatenation inside a loop?

- **A.** Use result.intern() on every iteration.
- **B.** Use new String(result) on every iteration.
- **C.** Use final String result.
- **D.** Use StringBuilder and append each value.

**✅ Correct answer:** D. Use StringBuilder and append each value.

**💡 Explanation:** Strings are immutable, so `+` in a loop creates many temporary objects. StringBuilder appends in place.

---

### Q30. What is the output?

```java
String s = new String("Ja") + new String("va");
s.intern();
String s1 = "Java";
System.out.println(s == s1);
```

- **A.** true
- **B.** false
- **C.** Compilation error
- **D.** Runtime exception

**✅ Correct answer:** A. true

**💡 Explanation:** "Java" isn't in the pool yet when `s.intern()` runs, so `intern()` puts `s` itself into the pool. The later literal `"Java"` resolves to that same object, so `s == s1` is true (Java 7+).

---

### Q31. What is the output?

```java
public class Test {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = new String("Java");
        s2.intern();
        System.out.println(s1 == s2);
    }
}
```

- **A.** true
- **B.** false
- **C.** Compilation error
- **D.** Runtime exception

**✅ Correct answer:** B. false

**💡 Explanation:** `s2.intern()` returns the pooled String but the result is discarded, so `s2` still points to the heap object. s1 == s2 is false.

---

