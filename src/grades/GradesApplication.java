package grades;
import java.util.HashMap;
import java.util.Scanner;
public class GradesApplication {
    public static void main(String[] args){

        Student sam = new Student("sam", 1);
        sam.addGrade(10);
        sam.addGrade(20);
        sam.addGrade(30);
        Student ben = new Student("ben",2);
        ben.addGrade(8);
        ben.addGrade(9);
        ben.addGrade(5);
        Student john = new Student("john",3);
        john.addGrade(11);
        john.addGrade(3);
        john.addGrade(9);
        Student steve = new Student("steve",4);
        steve.addGrade(3);
        steve.addGrade(9);
        steve.addGrade(9);
        Student rick = new Student("rick",5);
        rick.addGrade(9);
        rick.addGrade(10);
        rick.addGrade(4);
        HashMap<String, Student> students = new HashMap<>();
        students.put("samrodriguez12345", sam);
        students.put("benjaminbutton", ben);
        students.put("longjohnsilver", john);
        students.put("steven123", steve);
        students.put("stickyricky", rick);


        System.out.println("Hello! Here are all the students, which one would you like to see more information about?");
        for (Student student: students.values()){
            System.out.println("Name: " + student.getName());
        }

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();

        if(userInput.equalsIgnoreCase("sam")){
            System.out.println("Name: " + sam.getName() + " | Overall Grade:  " + sam.getGradeAverage() + " | Student ID#:  " + sam.getStudentID());
        }
        else if(userInput.equalsIgnoreCase("ben")){
            System.out.println("Name: " + ben.getName() + " | Overall Grade:  " + ben.getGradeAverage() + " | Student ID#:  " + ben.getStudentID());
        }
        else if(userInput.equalsIgnoreCase("john")){
            System.out.println("Name: " + john.getName() + " | Overall Grade:  " + john.getGradeAverage() + " | Student ID#:  " + john.getStudentID());
        }
        else if(userInput.equalsIgnoreCase("steve")){
            System.out.println("Name: " + steve.getName() + " | Overall Grade:  " + steve.getGradeAverage() + " | Student ID#:  " + steve.getStudentID());
        }
        else if(userInput.equalsIgnoreCase("rick")){
            System.out.println("Name: " + rick.getName() + " | Overall Grade:  " + rick.getGradeAverage() + " | Student ID#:  " + rick.getStudentID());
        }else{
            System.out.println("Please enter a valid name");
        }
    }
}

