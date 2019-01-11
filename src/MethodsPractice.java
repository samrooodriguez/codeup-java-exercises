// Write a method named countOdds(start, end) that returns an integer containing the integer that is the count of all odd numbers between the start and the end input integers.
//
// Write a method named countEvens(start, end) that returns an integer containing the integer that is the count of all even numbers between the start and the end input integers.
//
// Write a method named isVowel() that accepts a String input of length 1 and returns a boolean if that string is a vowel other than "y".
//
// Write a method named hasVowels() that accepts a string of any length and returns a boolean if there are any vowels in that string.
//
// Write a method named countVowels() that accepts a string of any length and returns an integer count of the number of vowels in the provided input String.
//
// Write a solution to FizzBuzz using recursion instead of a loop.
//
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
        if(i.length() > 1){
            return false;
        }
        return i.equalsIgnoreCase("a") ||
         i.equalsIgnoreCase("e") ||
         i.equalsIgnoreCase("i") ||
         i.equalsIgnoreCase("o") ||
         i.equalsIgnoreCase("u");
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

    }
}


