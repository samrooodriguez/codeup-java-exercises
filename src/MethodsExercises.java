public class MethodsExercises {

    public static int addition(int numberA, int numberB){
        return numberA + numberB;
    }
    public static int subtraction(int numberA, int numberB){
        return numberA - numberB;
    }
    public static int multiplication(int a, int b){
        int total = 0;

        for(int x = 0; x < a; x++){
            total += b;
        }
        return total;
    }
    public static int division(int numberA, int numberB){
        return numberA / numberB;
    }
    public static int modulus(int numberA, int numberB){
        return numberA % numberB;
    }
    public static void main(String[] args){
        System.out.println(addition(5,5));
        System.out.println(subtraction(5,4));
        System.out.println(multiplication(2,8));
        System.out.println(division(10,2));
        System.out.println(modulus(4,8));

    }
}
