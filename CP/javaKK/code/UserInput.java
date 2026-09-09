import java.util.Scanner;

 class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rollNo = input.nextInt();           // Reads integer
        float marks = input.nextFloat();        // Reads float
        String word = input.next();             // Reads string until first whitespace
        String line = input.nextLine();         // Reads entire line
        System.out.println(rollNo);
        System.out.println(marks);
        System.out.println(word);
    }
}