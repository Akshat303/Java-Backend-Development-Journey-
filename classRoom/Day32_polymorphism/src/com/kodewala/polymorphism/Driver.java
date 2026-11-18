package com.kodewala.polymorphism;

class User {
}

class AdminUser extends User {
}

class FinanceUser extends AdminUser {
}

public class Driver {

    public static void main(String[] args) {

        // Same class reference -> Same class object
        User u1 = new User();              // ✅ Valid

        /*
         Heap:
         u1 ------> User Object
         */


        // Same class reference -> Same class object
        AdminUser au1 = new AdminUser();   // ✅ Valid

        /*
         Heap:
         au1 -----> AdminUser Object
         */


        // Parent reference -> Child object (Upcasting)
        User u2 = new AdminUser();         // ✅ Valid

        /*
         Heap:
         u2 ------> AdminUser Object
             (User reference)
         */


        // Object is the top-most parent of every class
        Object obj = new FinanceUser();    // ✅ Valid

        /*
         Heap:
         obj -----> FinanceUser Object
             (Object reference)
         */


        // Multi-level upcasting
        User u3 = new FinanceUser();       // ✅ Valid

        /*
         Heap:
         u3 ------> FinanceUser Object
             (User reference)
         */


        AdminUser a1 = new FinanceUser();  // ✅ Valid

        /*
         Heap:
         a1 ------> FinanceUser Object
              (AdminUser reference)
         */


        // Child reference -> Parent object
       // AdminUser au = new User();         // ❌ Compile Time Error

        /*
         Reason:
         Every User is NOT an AdminUser.

         Example:
         User user = new User();

         user may not contain AdminUser-specific features,
         so Java does not allow this assignment.
         */


        // Correct Downcasting Example
        User u4 = new AdminUser();         // ✅ Upcasting

        AdminUser au2 = (AdminUser) u4;    // ✅ Downcasting
        
        AdminUser au = (AdminUser) new User(); // child class is referring parent class object --> Down Casting
        

        /*
         Heap:
         u4 ------> AdminUser Object
         au2 -----^

         Both references point to same object.
         */


        // Wrong Downcasting
        User u5 = new User();

        // AdminUser au3 = (AdminUser) u5; // ❌ Runtime Error
        // java.lang.ClassCastException

        /*
         Heap:
         u5 ------> User Object

         Actual object is User,
         so it cannot become AdminUser.
         */
    }
}
