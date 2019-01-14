// Write a method named isPrime() that that accepts in an integer number and returns a boolean if the number is evenly divisible only by either 1 or the number itself.
//
//Write a method named getTwentyPrimes() that returns a string containing the first 20 prime numbers, each separated by a comma. Output:
// "1, 2, 3, 5, 7, 11, 13, 17, 19"... until we have a total count of 20 primes in the string.

import java.util.Scanner;

public class MethodsPractice {
    public static char firstChar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter in any string to get the first character:");
        String userInput = scanner.next();
        char first = userInput.charAt(0);
        System.out.println("The first character in your string is: " + first);
        return first;
    }

    public static char secondChar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter in any string to get the second character:");
        String userInput = scanner.next();
        char second = userInput.charAt(1);
        System.out.println("The second character in your string is: " + second);
        return second;
    }

    public static char thirdChar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter in any string to get the third character:");
        String userInput = scanner.next();
        char third = userInput.charAt(2);
        System.out.println("The third character in your string is: " + third);
        return third;
    }

    public static char lastChar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter in any string to get the last character");
        String userInput = scanner.next();
        char last = userInput.charAt(userInput.length() - 1);
        System.out.println("The last character in your string is: " + last);
        return last;
    }

    public static char secondToLastChar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter in any string to get the second to last character");
        String userInput = scanner.next();
        char secondToLast = userInput.charAt(userInput.length() - 2);
        System.out.println("The last character in your string is: " + secondToLast);
        return secondToLast;
    }

    public static boolean userWantsToContinue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to continue?");
        String userInput = scanner.next();
        boolean cont;
        if (userInput.equalsIgnoreCase("Yes") || userInput.equals("y")) {
            cont = true;
            System.out.println("You chose to continue");
        } else {
            cont = false;
            System.out.println("You did not choose to continue");
        }
        return cont;
    }

    public static boolean isEven(int i) {
        return i % 2 == 0;
    }

    public static boolean isOdd(int i) {
        return i % 2 == 1;
    }

    public static int countOdds(int start, int end) {
        int output = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                output += 1;
            }
        }
        System.out.format("%d %n", output);
        return output;
    }

    public static int countEvens(int start, int end) {
        int output = 0;
        for (int i = start; i <= end; i++) {
            if (isEven(i)) {
                output += 1;
            }
        }
        System.out.format("%d %n", output);
        return output;
    }

    public static boolean isVowel(String i) {
        if (i.length() > 1) {
            return false;
        }
        return i.equalsIgnoreCase("a") ||
                i.equalsIgnoreCase("e") ||
                i.equalsIgnoreCase("i") ||
                i.equalsIgnoreCase("o") ||
                i.equalsIgnoreCase("u");
    }

    public static boolean hasVowels(String input) {
        for (int i = 0; i <= input.length(); i++) {
            if (input.contains("a") || input.contains("e") || input.contains("i") || input.contains("o") || input.contains("u")) {
                return true;
            }
        }
        return false;
    }

    public static int countVowels(String input) {
        int vowelCount = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
                vowelCount++;
            }
        }
        return vowelCount;
    }

    public static void fizzBuzz() {

        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
//        firstChar();
//        secondChar();
//        thirdChar();
//        lastChar();
//        secondToLastChar();
//        userWantsToContinue();
//        System.out.println(isOdd(7));
//        System.out.println(isEven(4));
//        countOdds(1, 10);
//        countEvens(0,20);
//        System.out.println(isVowel("a"));
//        System.out.println(hasVowels("This string has vowels"));
//        System.out.println(countVowels("cat, dog"));
        fizzBuzz();

    }
}


