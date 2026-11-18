// Q1 Subtract Two Numbers:
class SubtractTwoNumbers {
	public static void main(String args[]){
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		SubtractTwoNumbers subNo = new SubtractTwoNumbers(); 
		
		int sub = subNo.subTwoNo(num1,num2);
		System.out.println(sub);
	}
	
	int subTwoNo (int fNo, int sNo){
	return fNo - sNo;
	}
}

// Q2 Multiply Two Numbers:

class MultiplyTwoNumbers{
	public static void main(String ar[]){
		int fNo = Integer.parseInt(ar[0]);
		int sNo = Integer.parseInt(ar[1]);
		
		int result = MultiplyTwoNumbers.multiplyNumber(fNo,sNo);
		System.out.println("MultiplyTwoNumbers " + result);
	}
	
	static int multiplyNumber(int num1, int num2){
		return num1*num2 ;
	}
}

// Q3 Divide & Find Remainder:

class RemainderFinder {
    public static void main(String args[]) {
        int dividend = Integer.parseInt(args[0]);
        int divisor = Integer.parseInt(args[1]);

        int rem = RemainderFinder.findRemainder(dividend, divisor);
        System.out.println(rem);
    }

    static int findRemainder(int a, int b) {
        return a % b;
    }
}

// Q4 Calculate Simple Interest

class SimpleInterest {
    public static void main(String args[]) {
        double p = Double.parseDouble(args[0]);
        double r = Double.parseDouble(args[1]);
        double t = Double.parseDouble(args[2]);
			
		SimpleInterest result = new SimpleInterest();
        double si = result.calculateSI(p, r, t);
        System.out.println(si);
    }

     double calculateSI(double p, double r, double t) {
        return (p * r * t) / 100.0;
    }
}
// Q5 Find Maximum of Two Numbers

class FindMaxNumber {
    public static void main(String args[]) {
        int firstNum = Integer.parseInt(args[0]);
        int secondNum = Integer.parseInt(args[1]);
		
		FindMaxNumber result = new FindMaxNumber();
        int max = result.findMax(firstNum, secondNum);
        System.out.println(max);
    }

     int findMax(int a, int b) {
		return(a > b) ?  a : b;
    }
}

//Q6 Check Even or Odd

class CheckEvenOdd {
	public static void main(String ar[]){
		
		int num = Integer.parseInt(ar[0]);
		
		String result =  CheckEvenOdd.findEvenOdd(num);
		
		System.out.println(result);
	}
	
	static String findEvenOdd(int a){
		return(a % 2 == 0) ? "Even" : "Odd";
	}
}

// Q7 Check Positive, Negative, or Zero

class NumberSignCheck {
    public static void main(String args[]) {
        int num = Integer.parseInt(args[0]);

        String status = NumberSignCheck.checkNumber(num);
        System.out.println(status);
    }

    static String checkNumber(int n) {
        if (n > 0) {
            return "Positive";
        } else if (n < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }
}

//8 Check Leap Year

class LeapYearCheck {
    public static void main(String args[]) {
        int year = Integer.parseInt(args[0]);

        boolean result = LeapYearCheck.isLeapYear(year);
        System.out.println(result);
    }

    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

// Q9 Celsius to Fahrenheit

class TemperatureConverter {
    public static void main(String args[]) {
        double celsius = Double.parseDouble(args[0]);

        double fahrenheit = TemperatureConverter.toFahrenheit(celsius);
        System.out.println(fahrenheit);
    }

    static double toFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }
}

//Q10 Area of a Rectangle

class RectangleArea {
    public static void main(String args[]) {
        int length = Integer.parseInt(args[0]);
        int breadth = Integer.parseInt(args[1]);

        int area = RectangleArea.calculateArea(length, breadth);
        System.out.println(area);
    }

    static int calculateArea(int length, int breadth) {
        return length * breadth;
    }
}