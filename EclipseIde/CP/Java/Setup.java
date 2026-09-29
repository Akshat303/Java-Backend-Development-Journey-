import java.io.*;
import java.util.*;

// ==========================================
// 1. APNA QUESTION KA CODE YAHAN LIKHO
// ==========================================
class Solution {
    public void solve(Scanner sc) {
        // Example: Grade wala question
        int marks = sc.nextInt();
        
        if (marks >= 90) {
            System.out.print("Grade A");
        } else if (marks >= 70) {
            System.out.print("Grade B");
        } else if (marks >= 50) {
            System.out.print("Grade C");
        } else if (marks >= 35) {
            System.out.print("Grade D");
        } else {
            System.out.print("Fail");
        }
    }
}

// ==========================================
// 2. YEH MAIN SETUP HAR QUESTION ME SAME RAHEGA (Kabhi mat chhedo)
// ==========================================
 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();

        // Yeh loop input.txt ke aakhri input tak saare test cases apne aap chalata rahega
        while (sc.hasNext()) {
            sol.solve(sc);
            System.out.println(); // Har test case ke output ke baad new line
        }

        sc.close();
    }
}

// code run

// javac Setup.java

// java Main < input.txt > output.txt