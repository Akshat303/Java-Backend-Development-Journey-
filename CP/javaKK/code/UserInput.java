import java.util.Scanner;

 class Inputs {
    public static void main(String[] args) {
        Scanner anyName = new Scanner(System.in);

        int rollNo = anyName.nextInt();           // Reads integer
        float marks = anyName.nextFloat();        // Reads float
        String word = anyName.next();             // Reads string until first whitespace
        String line = anyName.nextLine();         // Reads entire line
        System.out.println(rollNo);
        System.out.println(marks);
        System.out.println(word);
    }
}
