import java.util.Scanner;

public class JL_03_Taking_User_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
            Observation : if any non-string taking input is given string/char as input it will
            traverse till next string or character type input taking line is found
            if not use sc.nextLine().
        */

        try {
            System.out.print("Enter a boolean value (true/false) : ");
            boolean myBoolean = sc.nextBoolean();
            System.out.println("The Boolean value entered by the user is: " + myBoolean);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid Boolean number.");
        }

        sc.nextLine();  //  to consume the leftover newline

        System.out.print("Enter your first name only : ");
        String firstName = sc.next();
        System.out.println("The Entered one word name of user is : " + firstName);

        sc.nextLine();  //  to consume the leftover newline

        System.out.print("Enter your full name : ");
        String fullName = sc.nextLine();
        System.out.println("The Entered full name of user is : " + fullName);

        try {
            System.out.print("Enter your Age : ");
            byte myAge = sc.nextByte();
            System.out.println("The Entered Age of the user is : " + myAge);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid byte number.");
        }

        sc.nextLine();  //  to consume the leftover newline

        try {
            System.out.print("Enter any positive number less than 32767 : ");
            short myShortNum = sc.nextShort();
            System.out.println("The Entered positive number less than 32767 is  : " + myShortNum);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid short number.");
        }

        sc.nextLine();  //  to consume the leftover newline

        try {
            System.out.print("Enter any number : ");
            int myInt = sc.nextInt();
            System.out.println("The Entered number is  : " + myInt);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid integer number.");
        }

        sc.nextLine();  //  to consume the leftover newline

        System.out.print("Enter any Alphabet Character : ");
        char myChar = sc.next().charAt(0);
        System.out.println("The Entered Alphabet is  : " + myChar);

        try {
            System.out.print("Enter a floating-point number: ");
            float myFloat = sc.nextFloat();
            System.out.println("The float value entered by the user is: " + myFloat);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid floating-point number.");
        }

        sc.nextLine();  //  to consume the leftover newline

        try {
            System.out.print("Enter a Long digit number: ");
            long myLong = sc.nextLong();
            System.out.println("The Long value entered by the user is: " + myLong);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid Long number.");
        }

        sc.nextLine();  //  to consume the leftover newline

        try {
            System.out.print("Enter a double number: ");
            double myDouble = sc.nextDouble();
            System.out.println("The Double value entered by the user is: " + myDouble);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid Double number.");
        }
    }
}
