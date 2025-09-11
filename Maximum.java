import java.util.Scanner;

/**
 * This program finds the maximum of a set of three numbers input by the user.
 */

public class Maximum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first variable");
        int number1 = input.nextInt();

        System.out.println("Enter the second variable");
        int number2 = input.nextInt();

        System.out.println("Enter the third variable");
        int number3 = input.nextInt();

        System.out.println("The max is");
        if (number1 >= number2 && number1 >= number3)
            System.out.println(number1);
        else if (number2 >= number1 && number2 >= number3)
            System.out.println(number2);
        else if (number3 >= number1 && number3 >= number2)
            System.out.println(number3);
            


    }
}

