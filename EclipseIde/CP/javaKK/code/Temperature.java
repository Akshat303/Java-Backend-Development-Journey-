import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter temp in C: ");
        float tempC = input.nextFloat();
        System.out.println ("your enter no is " + tempC);
        float tempF = (tempC * 9.0f / 5.0f) + 32;

        System.out.println(tempF);

    }
}