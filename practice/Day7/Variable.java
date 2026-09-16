 class VariablePractice {

    // =========================================================
    // Q1. Local Variable
    // =========================================================
    static void question1() {
        String name = "Akshat";
        int age = 25;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // =========================================================
    // Q2. Local Variable Calculation
    // =========================================================
    static void question2() {
        int a = 20;
        int b = 30;

        int sum = a + b;

        System.out.println("Sum: " + sum);
    }

    // =========================================================
    // Q3. Instance Variable
    // =========================================================
    static class StudentQ3 {
        String name;
        int marks;
    }

    static void question3() {
        StudentQ3 student = new StudentQ3();

        student.name = "Akshat";
        student.marks = 90;

        System.out.println("Name: " + student.name);
        System.out.println("Marks: " + student.marks);
    }

    // =========================================================
    // Q4. Multiple Objects
    // =========================================================
    static class StudentQ4 {
        String name;
    }

    static void question4() {
        StudentQ4 s1 = new StudentQ4();
        StudentQ4 s2 = new StudentQ4();

        s1.name = "Akshat";
        s2.name = "Rahul";

        System.out.println("Student 1: " + s1.name);
        System.out.println("Student 2: " + s2.name);
    }

    // =========================================================
    // Q5. Instance Variable Update
    // =========================================================
    static class CarQ5 {
        int speed = 50;
    }

    static void question5() {
        CarQ5 car = new CarQ5();

        System.out.println("Old Speed: " + car.speed);

        car.speed = 100;

        System.out.println("New Speed: " + car.speed);
    }

    // =========================================================
    // Q6. Static Variable
    // =========================================================
    static class StudentQ6 {
        static String college = "ABC College";
    }

    static void question6() {
        System.out.println("College: " + StudentQ6.college);
    }

    // =========================================================
    // Q7. Static Variable Shared
    // =========================================================
    static class CounterQ7 {

        static int count = 0;

        CounterQ7() {
            count++;
        }
    }

    static void question7() {

        new CounterQ7();
        new CounterQ7();
        new CounterQ7();

        System.out.println("Total Objects: " + CounterQ7.count);
    }

    // =========================================================
    // Q8. Instance vs Static
    // =========================================================
    static class EmployeeQ8 {

        String name;
        static String company = "Google";
    }

    static void question8() {

        EmployeeQ8 e1 = new EmployeeQ8();
        EmployeeQ8 e2 = new EmployeeQ8();

        e1.name = "Akshat";
        e2.name = "Rahul";

        System.out.println(e1.name + " - " + EmployeeQ8.company);
        System.out.println(e2.name + " - " + EmployeeQ8.company);
    }

    // =========================================================
    // Q9. Local + Instance Variable
    // =========================================================
    static class StudentQ9 {

        int age = 25;

        void display() {

            int marks = 85;

            System.out.println("Age: " + age);
            System.out.println("Marks: " + marks);
        }
    }

    static void question9() {

        StudentQ9 student = new StudentQ9();

        student.display();
    }

    // =========================================================
    // Q10. Static Method
    // =========================================================
    static class NumberQ10 {

        static int number = 100;

        static void showNumber() {
            System.out.println("Number: " + number);
        }
    }

    static void question10() {

        NumberQ10.showNumber();
    }

    // =========================================================
    // Q11. Object Count
    // =========================================================
    static class CarQ11 {

        static int count = 0;

        CarQ11() {
            count++;
        }
    }

    static void question11() {

        new CarQ11();
        new CarQ11();
        new CarQ11();
        new CarQ11();
        new CarQ11();

        System.out.println("Total Cars: " + CarQ11.count);
    }

    // =========================================================
    // Q12. Bank Account
    // =========================================================
    static class BankAccountQ12 {

        String accountHolder;
        double balance;

        static String bankName = "State Bank";

        void display() {

            System.out.println("Account Holder: " + accountHolder);
            System.out.println("Balance: " + balance);
            System.out.println("Bank: " + bankName);
            System.out.println();
        }
    }

    static void question12() {

        BankAccountQ12 account1 = new BankAccountQ12();
        BankAccountQ12 account2 = new BankAccountQ12();

        account1.accountHolder = "Akshat";
        account1.balance = 50000;

        account2.accountHolder = "Rahul";
        account2.balance = 75000;

        account1.display();
        account2.display();
    }

    // =========================================================
    // Q13. Student Marks
    // =========================================================
    static class StudentQ13 {

        String name;
        int marks;

        static String school = "ABC School";

        void display() {

            System.out.println("Name: " + name);
            System.out.println("Marks: " + marks);
            System.out.println("School: " + school);
            System.out.println();
        }
    }

    static void question13() {

        StudentQ13 s1 = new StudentQ13();
        StudentQ13 s2 = new StudentQ13();
        StudentQ13 s3 = new StudentQ13();

        s1.name = "Akshat";
        s1.marks = 90;

        s2.name = "Rahul";
        s2.marks = 85;

        s3.name = "Amit";
        s3.marks = 95;

        s1.display();
        s2.display();
        s3.display();
    }

    // =========================================================
    // Q14. Employee Salary
    // =========================================================
    static class EmployeeQ14 {

        String name;
        int salary;

        static String company = "ABC Company";

        void display() {

            System.out.println("Name: " + name);
            System.out.println("Salary: " + salary);
            System.out.println("Company: " + company);
            System.out.println();
        }
    }

    static void question14() {

        EmployeeQ14 e1 = new EmployeeQ14();
        EmployeeQ14 e2 = new EmployeeQ14();

        e1.name = "Akshat";
        e1.salary = 50000;

        e2.name = "Rahul";
        e2.salary = 60000;

        System.out.println("Before changing salary:");
        e1.display();
        e2.display();

        // Change only e1's salary
        e1.salary = 80000;

        System.out.println("After changing Akshat's salary:");
        e1.display();
        e2.display();
    }

    // =========================================================
    // Q15. Challenge
    // =========================================================
    static class EmployeeQ15 {

        // Instance variable
        String name;

        // Static variable
        static String company;

        void display() {

            // Local variable
            int salary = 50000;

            System.out.println(name);
            System.out.println(company);
            System.out.println(salary);
            System.out.println();
        }
    }

    static void question15() {

        EmployeeQ15.company = "ABC Company";

        EmployeeQ15 e1 = new EmployeeQ15();
        EmployeeQ15 e2 = new EmployeeQ15();

        e1.name = "Akshat";
        e2.name = "Rahul";

        e1.display();
        e2.display();
    }

    // =========================================================
    // MAIN METHOD
    // =========================================================
    public static void main(String[] args) {

        System.out.println("========== Q1 ==========");
        question1();

        System.out.println("\n========== Q2 ==========");
        question2();

        System.out.println("\n========== Q3 ==========");
        question3();

        System.out.println("\n========== Q4 ==========");
        question4();

        System.out.println("\n========== Q5 ==========");
        question5();

        System.out.println("\n========== Q6 ==========");
        question6();

        System.out.println("\n========== Q7 ==========");
        question7();

        System.out.println("\n========== Q8 ==========");
        question8();

        System.out.println("\n========== Q9 ==========");
        question9();

        System.out.println("\n========== Q10 ==========");
        question10();

        System.out.println("\n========== Q11 ==========");
        question11();

        System.out.println("\n========== Q12 ==========");
        question12();

        System.out.println("\n========== Q13 ==========");
        question13();

        System.out.println("\n========== Q14 ==========");
        question14();

        System.out.println("\n========== Q15 ==========");
        question15();
    }
}