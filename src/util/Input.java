package util;
import java.util.Scanner;
public class Input {

    private Scanner scanner = new Scanner(System.in);

    public boolean yesNo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter \"yes\" or \"no\"");
        String userInput = scanner.next();
        if (userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y")) {
            return true;
        } else if (userInput.equalsIgnoreCase("no") || userInput.equalsIgnoreCase("n")) {
            return false;
        }
        return yesNo();
    }

    public int getInt() {
        String result = scanner.nextLine();
        int parsedInt = 0;
        try{
            parsedInt = Integer.valueOf(result);
        }catch(NumberFormatException ex){
            System.out.println("That is not a number");
            return getInt();
        }
        return parsedInt;
    }

    public int getMinMax(int min, int max){
        System.out.println("Enter in an integer within the min and max");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        if(userInput >= min && userInput <= max){
            System.out.println("The number you entered is within the desired range");
            return userInput;
        }
        System.out.println("wrong");
        return getMinMax(min,max);
    }

    public double getDoubleMinMax(double min, double max){
        System.out.println("Enter in a decimal point number within range");
        Scanner scanner = new Scanner(System.in);
        double userInput = scanner.nextDouble();
        if(userInput >= min && userInput <= max ){
            System.out.println("The double you entered is within the desired range.");
            return userInput;
        }
        System.out.println("Double wrong");
        return getDoubleMinMax(min,max);
    }

    public double getDouble(){
        String result = scanner.nextLine();
        double parsedDouble = 0.0;
        try{
            parsedDouble = Double.valueOf(result);
        }catch(NumberFormatException ex){
            System.out.println("That is not a double");
            return getDouble();
        }
        return parsedDouble;
    }
}
