//package com.day38_39_interface.lambda;
//
//public class DriverCheckEvenOdd {
//
//    public static void main(String[] args) {
//        
//        CheckEvenOdd checknum = (num) -> {
//            if (num % 2 == 0) {
//                System.out.println(num + " is Even");
//                return true;
//            } else {
//                System.out.println(num + " is Odd");
//                return false;
//            }
//        };
//
//        int num1 = 10;
//        checknum.check(num1);
//    }
//}

package com.day38_39_interface.lambda;

public class DriverCheckEvenOdd {
	public static void main(String[] args) {
		// Lambda sirf boolean return karega (num % 2 == 0)
		CheckEvenOdd checknum = (num) -> {
			return (num % 2 == 0);
		};

		int n = 10;
		if (checknum.check(n)) {
			System.out.println(n + " is Even");
		} else {
			System.out.println(n + " is Odd");
		}
	}
}