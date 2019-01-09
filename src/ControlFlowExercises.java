import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

//        int i = 5;
//        while(i <= 15 ){
//            System.out.print(i + "\n");
//            i++;
//        }

//        int x = 2;
//        do {
//            System.out.print(x+ "\n");
//            x += 2;
//        } while (x <= 100);

//      int x = 100;
//        do {
//            System.out.print(x+ "\n");
//            x -= 5;
//        } while (x >= -10);

//        long a = 2;
//        do{
//            System.out.print(a + "\n");
//            a *= a;
//        }while(a < 1000000);

//        for(int i = 5; i <= 15; i++){
//            System.out.print(i + "\n");
//        }

//        for(int x = 2; x <= 100;x+=2){
//            System.out.print(x + "\n");
//        }

//        for(int x = 100; x >= -10;x -= 5){
//            System.out.print( x + "\n");
//        }

//        for(long a = 2; a < 1000000; a*=a){
//            System.out.print(a + "\n");
//        }

//        for(int i = 1; i <= 100; i++){
//                if(i % 3 == 0 && i % 5 == 0){
//                    System.out.println("FizzBuzz");
//                }
//                else if(i % 3 == 0){
//                    System.out.println("Fizz");
//                }
//                else if(i % 5 == 0){
//                    System.out.println("Buzz");
//                }
//                else{
//                    System.out.println(i);
//                }
////            }
//        System.out.println("What number would you like to go up to?");
//        int input = scanner.nextInt();
//        System.out.println("number   |Squared   |Cubed");
//        System.out.println("-----    |-----     |-----");
//        for (int i = 1; i <= input; i++) {
//            System.out.println(i + "        |" + (i * i) + "        |" + i * i * i);
//        }


//        System.out.println("Would you like to continue?");
//        String x = scanner.next();
//        if (x.equals("yes")) {
//            System.out.println("number   |Squared   |Cubed");
//            System.out.println("-----    |-----     |-----");
//            System.out.println(i + "        |" + (i * i) + "         |" + i * i * i);
//        } else if (x.equals("no")) {
//            System.out.println("number   |Squared   |Cubed");
//            System.out.println("-----    |-----     |-----");
//            System.out.println(i + "        |" + (i * i) + "         |" + i * i * i);
//        }

                 System.out.println("Enter in a grade between 0 and 100");
                 int grade = scanner.nextInt();
                 if(grade <= 100 && grade >= 95){
                     System.out.println("The grade you entered is an A+");
                 }
                 else if(grade <= 94 && grade >= 90){
                     System.out.println("The grade you entered is an A");
                 }
                 else if(grade <= 89 && grade >= 85){
                     System.out.println("The grade you entered is a B+");
                 }
                 else if(grade <= 84 && grade >= 80){
                     System.out.println("The grade you entered is a B");
                 }
                 else if(grade <= 79 && grade >= 75){
                     System.out.println("The grade you entered is a C+");
                 }
                 else if(grade <= 79 && grade >= 67){
                     System.out.println("The grade you entered is a C");
                 }
                 else if(grade <= 66 && grade >= 60){
                     System.out.println("The grade you entered is a D-");
                 }
                 else if(grade <= 59 && grade >= 0){
                     System.out.println("The grade you entered is a F-");
                 }

    }
}
