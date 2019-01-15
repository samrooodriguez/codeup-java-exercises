import java.util.Scanner;
class Person {
    public String firstName;
    public String lastName;
    public String newFirstName;
    public String newLastName;
    public String job;
    public String newJob;


    public String sayHello() {
        return String.format("Hello from %s %s!", firstName, lastName);
    }
    public String displayJob(){
        return String.format(firstName + " has the job: " + job + "\n");
    }

    public String changeFirstName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter in a new first name for your person:");
        String userInput = scanner.next();
        newFirstName = userInput;
        firstName = newFirstName;
        System.out.println("You successfully change your first name to " + newFirstName);
        return sayHello();
    }
    public String changeLastName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter in a new last name for your person:");
        String userInput = scanner.next();
        newLastName = userInput;
        lastName = newLastName;
        System.out.println("You successfully change your last name to " + newLastName);
        return sayHello();
    }

    public String changeJobs(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(firstName + " has the job: " + job + " but they want to change jobs. Assign " + firstName + " someone else's job.");
        System.out.println("To assign " + firstName + " a new job enter the name of their old job: ");
        String userInput = scanner.next();
        if(userInput.equalsIgnoreCase(job)){
            System.out.println("Now enter in the desired job: ");
            String newJobInput = scanner.next();
            newJob = newJobInput;
            this.job = newJob;
        }
        else{
            System.out.println("That isn't a valid job entry");
            changeJobs();
        }

        sayHello();
        return displayJob();

    }

    public static void main(String[] args) {
        Person rick = new Person();
        rick.firstName = "Rick";
        rick.lastName = "Sanchez";
        rick.job = "Scientist";

        Person sam = new Person();
        sam.firstName = "Sam";
        sam.lastName = "Rodriguez";
        sam.job = "unemployed";

        Person bob = new Person();
        bob.firstName = "Bob";
        bob.lastName = "Lob";
        bob.job = "Lawyer";

        System.out.println(rick.sayHello());
        System.out.println(rick.changeFirstName());
        System.out.println(rick.changeLastName());

        System.out.println(sam.sayHello());
        System.out.println(sam.changeFirstName());
        System.out.println(sam.changeLastName());

        System.out.println(bob.sayHello());
        System.out.println(bob.changeFirstName());
        System.out.println(bob.changeLastName());

        System.out.println(sam.sayHello());
        System.out.println(sam.displayJob());

        System.out.println(rick.sayHello());
        System.out.println(rick.displayJob());

        System.out.println(bob.sayHello());
        System.out.println(bob.displayJob());

        System.out.println(rick.changeJobs());

    }
}
