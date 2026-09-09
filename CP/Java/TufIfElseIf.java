/*If ElseIf

Given marks of a student, print on the screen:

Grade A if marks >= 90
Grade B if marks >= 70
Grade C if marks >= 50
Grade D if marks >= 35
Fail, otherwise.


For printing use:-

for C++ : cout << variable_name;
for Java : System.out.print();
for Python : print()
for Javascript : console.log()
for C# : Console.WriteLine();
for Go : fmt.Println()

Example 1

Input: marks = 95

Output: Grade A

Explanation: marks are greater than or equal to 90. */

import java.util.Scanner;

class Solution {
    // Aapka method
    public void studentGrade(int marks) {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();

        // input.txt se ek-ek karke saare test marks padhega
        while (sc.hasNextInt()) {
            int marks = sc.nextInt();
            sol.studentGrade(marks);
            System.out.println(); // har answer ke baad nayi line
        }

        sc.close();
    }
}