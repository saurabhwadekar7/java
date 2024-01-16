package lab_exam;

import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        // Initialize a number to some integer value
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Reverse the digits
        int reversedNumber = reverseDigits(number);

        // Display the original and reversed numbers
        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + reversedNumber);
    }

    // Function to reverse the digits of a number
    private static int reverseDigits(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}

