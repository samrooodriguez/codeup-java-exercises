import java.util.Scanner;
import java.util.Random;
public class MethodsExercises {
    public static int addition(int numberA, int numberB) {
        return numberA + numberB;
    }
    public static int subtraction(int numberA, int numberB) {
        return numberA - numberB;
    }
    public static int multiplication(int a, int b) {
        int total = 0;
        for (int x = 0; x < a; x++) {
            total += b;
        }
        return total;
    }
    public static int division(int numberA, int numberB) {
        return numberA / numberB;
    }
    public static int modulus(int numberA, int numberB) {
        return numberA % numberB;
    }
    public static int getInteger(int min, int max){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.format("Enter in a number between %s and %s: ", min, max);
        int input = scanner.nextInt();

        if(input < min){
            System.out.format(input + " is less than %s value %n", min);
        }
        else if(input > min && input < max){
            System.out.println(input + " is within the desired range");
            return input;
        }
        System.out.println("Please enter a valid number");
        return getInteger(min,max);
    }

    public static void factorial(){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Enter an integer from 1 to 10:");
        int x = scanner.nextInt();
        String output = "";
        for(int i = 1; i <= x; i++){
            output += i + " x ";
            System.out.format("%d! = %s %n",i,output);
        }
    }
    public static void diceRoll(){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        Random random = new Random();
        System.out.println("Please enter the number for a pair of dice:");
        int userInput = scanner.nextInt();
        double diceOne = Math.floor(Math.random() * 49 + 1);
        double diceTwo = Math.floor(Math.random() * 49 + 1);

        System.out.println("Dice one:" + diceOne);
        System.out.println("Dice Two:" + diceTwo);

    }


    public static void main(String[] args) {
        System.out.println(addition(5, 5));
        System.out.println(subtraction(5, 4));
        System.out.println(multiplication(2, 8));
        System.out.println(division(10, 2));
        System.out.println(modulus(4, 8));
        getInteger(1,10);
        factorial();
        diceRoll();

    }
}
