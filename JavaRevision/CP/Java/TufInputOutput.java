/* Input Output
Subscribe to TUF+

Hints
Company
Complete the function printNumber which takes an integer input from the user and prints it on the screen.



Use:-

for C++ : cout << variable_name;
for Java : System.out.print();
for Python : print()
for Javascript : console.log()

Example 1

Input(user gives value): 7

Output: 7 */

import java.util.Scanner;

class Solution {
    // Your method
    public void printNumber(Scanner sc) {
        int num = sc.nextInt();
        System.out.print(num);
    }

    // Starting point for running locally
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();
        sol.printNumber(sc);
        sc.close();
    }
}