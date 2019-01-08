import java.util.Scanner;

public class ConsoleExercises {
    public static void main (String[] args){
//        String greeting = "Hello";
//        String name = "Sam";
//        System.out.format("%s, %s!", greeting, name);
        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter something: ");
//        String userInput = scanner.next();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");
//
//        double pi = 3.14159;
//
//        System.out.format("The value of pi is approximately %s", pi);
//
//        System.out.print("\nEnter in an integer here: ");
//        int input = scanner.nextInt();
//
//        System.out.println("You entered: " + input);
//
//        System.out.println("Enter in three words here: ");
//
//        String samInputOne = scanner.next();
//        String samInputTwo = scanner.next();
//        String samInputThree = scanner.next();
//        System.out.println("You entered: " + samInputOne + " " + samInputTwo + " " + samInputThree);

        System.out.print("Enter in the Length of classroom: ");
        int classRoomLength = scanner.nextInt();
        System.out.print("Enter in the Width of classroom: ");
        int classRoomWidth = scanner.nextInt();
        System.out.println("Classroom length is: " + classRoomLength);
        System.out.println("Classroom width is: " + classRoomWidth);
        int classRoomArea = classRoomLength * classRoomWidth;
        System.out.println("Classroom area is equal to " + classRoomArea);

    }
}


