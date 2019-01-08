import java.util.Scanner;

public class ConsoleExercises {
    public static void main (String[] args){
        String greeting = "Hello";
        String name = "Sam";
        System.out.format("%s, %s!", greeting, name);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something: ");
        String userInput = scanner.next();

        System.out.println("You entered: --> \"" + userInput + "\" <--");

        double pi = 3.14159;

        System.out.format("The value of pi is approximately %s", pi);

        System.out.print("Enter in an integer here: ");
        int input = scanner.nextInt();

        System.out.println("You entered: " + input);

    }
}


