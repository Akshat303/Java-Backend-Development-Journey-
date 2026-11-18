 class Main {

    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("   DAY 9: OPERATORS & LOGIC PRACTICE SOLUTIONS");
        System.out.println("==============================================\n");

        SwapNumbers.solve();
        DeliveryFee.solve();
        AmazonPrimeDelivery.solve();
        TransactionSurcharge.solve();
        ShortCircuitAnd.solve();
        ShortCircuitOr.solve();
        MaxOfThree.solve();
        VoterEligibility.solve();
        EvenOddCheck.solve();
        DiscountMatrix.solve();
        IncrementDecrementTrace.solve();
        LeapYearCheck.solve();
        TriangleValidator.solve();
        LoginController.solve();
        ScoreRangeCheck.solve();

        System.out.println("==============================================");
        System.out.println("           ALL 15 SOLUTIONS EXECUTED          ");
        System.out.println("==============================================");
    }

    // -------------------------------------------------------------
    // Q1: Swap Two Numbers Without a Third Variable
    // -------------------------------------------------------------
    static class SwapNumbers {
        public static void solve() {
            System.out.println("--- Solution 1: Swap Numbers ---");
            int a = 10, b = 20;
            System.out.println("Before Swap: a = " + a + ", b = " + b);
            a = a + b; // a becomes 30
            b = a - b; // b becomes 10
            a = a - b; // a becomes 20
            System.out.println("After Swap:  a = " + a + ", b = " + b + "\n");
        }
    }

    // -------------------------------------------------------------
    // Q2: Delivery Fee Checker using Ternary
    // -------------------------------------------------------------
    static class DeliveryFee {
        public static void solve() {
            System.out.println("--- Solution 2: Delivery Fee via Ternary ---");
            int orderAmount = 450;
            int deliveryFee = (orderAmount > 500) ? 0 : 40;
            System.out.println("Order Amount: ₹" + orderAmount);
            System.out.println("Delivery Fee: ₹" + deliveryFee + "\n");
        }
    }

    // -------------------------------------------------------------
    // Q3: Amazon Prime Same-Day Delivery (Logical AND)
    // -------------------------------------------------------------
    static class AmazonPrimeDelivery {
        public static void solve() {
            System.out.println("--- Solution 3: Same-Day Delivery Logic ---");
            boolean isPrimeMember = true;
            boolean isItemInStock = true;

            if (isPrimeMember && isItemInStock) {
                System.out.println("Status: Eligible for Same-Day Delivery");
            } else {
                System.out.println("Status: Standard Delivery");
            }
            System.out.println();
        }
    }

    // -------------------------------------------------------------
    // Q4: Transaction Surcharge Calculator
    // -------------------------------------------------------------
    static class TransactionSurcharge {
        public static void solve() {
            System.out.println("--- Solution 4: Transaction Surcharge ---");
            double transactionAmount = 2500.0;
            if (transactionAmount > 2000) {
                double surcharge = transactionAmount * 0.03;
                double totalAmount = transactionAmount + surcharge;
                System.out.println("Transaction Amount: ₹" + transactionAmount);
                System.out.println("3% Surcharge: ₹" + surcharge);
                System.out.println("Total Payable: ₹" + totalAmount);
            } else {
                System.out.println("No surcharge applicable. Payable: ₹" + transactionAmount);
            }
            System.out.println();
        }
    }

    // -------------------------------------------------------------
    // Q5: Short-Circuit Evaluation Verification (&&)
    // -------------------------------------------------------------
    static class ShortCircuitAnd {
        public static void solve() {
            System.out.println("--- Solution 5: Short-Circuit Verification (&&) ---");
            int a = 10, b = 20, c = 5;
            System.out.println("Value of c before evaluation: " + c);

            boolean result = (a > b) && (++c > 5);
            System.out.println("Condition evaluated to: " + result);
            System.out.println("Value of c after evaluation: " + c + " (Unchanged due to short-circuit!)\n");
        }
    }

    // -------------------------------------------------------------
    // Q6: Short-Circuit with Logical OR (||)
    // -------------------------------------------------------------
    static class ShortCircuitOr {
        public static void solve() {
            System.out.println("--- Solution 6: Short-Circuit Verification (||) ---");
            int x = 10, y = 5;
            System.out.println("Value of y before evaluation: " + y);

            if (x > 5 || ++y > 5) {
                System.out.println("Inside OR block successfully.");
            }
            System.out.println("Value of y after evaluation: " + y + " (Unchanged due to short-circuit!)\n");
        }
    }

    // -------------------------------------------------------------
    // Q7: Maximum of Three Numbers using Nested Ternary
    // -------------------------------------------------------------
    static class MaxOfThree {
        public static void solve() {
            System.out.println("--- Solution 7: Max of Three Numbers ---");
            int n1 = 45, n2 = 89, n3 = 62;
            int max = (n1 >= n2) ? ((n1 >= n3) ? n1 : n3) : ((n2 >= n3) ? n2 : n3);
            System.out.println("Numbers: " + n1 + ", " + n2 + ", " + n3);
            System.out.println("Maximum Value: " + max + "\n");
        }
    }

    // -------------------------------------------------------------
    // Q8: Age & Voter Eligibility
    // -------------------------------------------------------------
    static class VoterEligibility {
        public static void solve() {
            System.out.println("--- Solution 8: Voting Eligibility ---");
            int age = 19;
            String eligibility = (age >= 18) ? "Eligible to Vote" : "Not Eligible";
            System.out.println("Age: " + age + " -> " + eligibility + "\n");
        }
    }

    // -------------------------------------------------------------
    // Q9: Even or Odd Without If-Else
    // -------------------------------------------------------------
    static class EvenOddCheck {
        public static void solve() {
            System.out.println("--- Solution 9: Even or Odd ---");
            int number = 37;
            String parity = (number % 2 == 0) ? "Even" : "Odd";
            System.out.println("Number: " + number + " is " + parity + "\n");
        }
    }

    // -------------------------------------------------------------
    // Q10: Discount Eligibility Matrix
    // -------------------------------------------------------------
    static class DiscountMatrix {
        public static void solve() {
            System.out.println("--- Solution 10: Discount Eligibility ---");
            boolean isPrime = false;
            double cartTotal = 2800.0;

            if (isPrime || cartTotal >= 2500) {
                System.out.println("Congratulations! You unlocked a 20% discount.");
            } else {
                System.out.println("No discount applied.");
            }
            System.out.println();
        }
    }

    // -------------------------------------------------------------
    // Q11: Pre vs. Post Increment Step-by-Step Tracing
    // -------------------------------------------------------------
    static class IncrementDecrementTrace {
        public static void solve() {
            System.out.println("--- Solution 11: Increment / Decrement Tracing ---");
            int valA = 5;
            // valA++ -> uses 5, valA becomes 6
            // ++valA -> valA becomes 7, uses 7
            // --valA -> valA becomes 6, uses 6
            // valA-- -> uses 6, valA becomes 5
            // Total = 5 + 7 - 6 + 6 = 12
            int valB = valA++ + ++valA - --valA + valA--;
            System.out.println("Final value of a: " + valA + " (Expected: 5)");
            System.out.println("Final value of b: " + valB + " (Expected: 12)\n");
        }
    }

    // -------------------------------------------------------------
    // Q12: Leap Year Checker using Logical Operators
    // -------------------------------------------------------------
    static class LeapYearCheck {
        public static void solve() {
            System.out.println("--- Solution 12: Leap Year Checker ---");
            int year = 2024;
            boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            System.out.println("Year " + year + " is Leap Year? " + isLeap + "\n");
        }
    }

    // -------------------------------------------------------------
    // Q13: Valid Triangle Validator
    // -------------------------------------------------------------
    static class TriangleValidator {
        public static void solve() {
            System.out.println("--- Solution 13: Valid Triangle Validator ---");
            int angle1 = 60, angle2 = 80, angle3 = 40;
            boolean isValidTriangle = (angle1 > 0 && angle2 > 0 && angle3 > 0) && ((angle1 + angle2 + angle3) == 180);
            System.out.println("Angles: " + angle1 + "°, " + angle2 + "°, " + angle3 + "°");
            System.out.println("Forms valid triangle? " + isValidTriangle + "\n");
        }
    }

    // -------------------------------------------------------------
    // Q14: Login Access Controller
    // -------------------------------------------------------------
    static class LoginController {
        public static void solve() {
            System.out.println("--- Solution 14: Login Access Controller ---");
            boolean isEmailVerified = true;
            boolean isPhoneVerified = false;
            boolean isAccountBlocked = false;

            if (!isAccountBlocked && (isEmailVerified || isPhoneVerified)) {
                System.out.println("Auth Result: Login Successful");
            } else {
                System.out.println("Auth Result: Access Denied");
            }
            System.out.println();
        }
    }

    // -------------------------------------------------------------
    // Q15: Range Checker (Inclusive)
    // -------------------------------------------------------------
    static class ScoreRangeCheck {
        public static void solve() {
            System.out.println("--- Solution 15: Range Checker ---");
            int score = 88;
            if (score >= 0 && score <= 100) {
                System.out.println("Score " + score + ": Valid Mark");
            } else {
                System.out.println("Score " + score + ": Invalid Mark: Out of Range");
            }
            System.out.println();
        }
    }
}