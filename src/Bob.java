import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Go head and ask Bob a question");
        String userInput = scanner.next();

        if (userInput.contains("?")) {
            System.out.println("Sure");
        } else if (userInput.contains("!")) {
            System.out.println("Woah, chill out!");
        } else if (userInput.equals("")) {
            System.out.print("Fine. Be that way!");
        } else {
            System.out.println("Whatever");
        }
    }
}
