public class ControlFlowExercises {
    public static void main(String[] args){
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

        for(int i = 1; i <= 100; i++){
                if(i % 3 == 0 && i % 5 == 0){
                    System.out.println("FizzBuzz");
                }
                else if(i % 3 == 0){
                    System.out.println("Fizz");
                }
                else if(i % 5 == 0){
                    System.out.println("Buzz");
                }
                else{
                    System.out.println(i);
                }
            }
        }
    }
