 class AddTwoNumber2 {

    public static void main(String args[]) {

        int firstNum = Integer.parseInt(args[0]);
        int secondNum = Integer.parseInt(args[1]);

        AddTwoNumber2 sumFun = new AddTwoNumber2();

        int sum = sumFun.sumTwoNumber(firstNum, secondNum);

        System.out.print(sum);
    }

    int sumTwoNumber(int num1, int num2) {
        return num1 + num2;
    }
}