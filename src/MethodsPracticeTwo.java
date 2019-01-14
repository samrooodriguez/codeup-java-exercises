//Write a method named secondLongestRun that accepts a string of 1s and 0s and returns an integer that specifies the length of the second longest run of consecutive numbers. Example secondLongestRun("111001") returns 2 because the two 0s in a row are the second longest run.
//
//Write a method named magic8ball that prompts the user to input a question. If the user inputs a string that does not have a question mark at the end, then start the method over again. When answering the magic 8 ball randomly returns one of a set of string options like the following:
//"All signs point to yes", "The future is cloudy. Ask again", "Very doubtful", "Outlook not so good.", "Don't count on it.", "You may rely on it!", "Ask again later."
//
//Write a method named dndDiceRoll that accepts a string of the format "2d6" where the first number(s) are the number of dice and the second number is the number of sides of each of those dice. Example: "5d4" rolls a four sided die 5 times and returns the sum of the result.
//
//Write a method named l5rDiceRoll that accepts a string of the following format "6k4" where the first number is the number of dice to roll, the second number is the number of dice we keep the highest values from, and each die has 10 sides. Example "4k2" rolls 4 dice of 10 sides, and returns the sum of keeping the highest 2 rolls.
import java.util.Random;
public class MethodsPracticeTwo {


    //    Write a method called coinFlip that randomly returns a true or false value.
    public static boolean coinFlip(){
        Random random = new Random();
        System.out.println(random.nextBoolean());
        return random.nextBoolean();

    }
    //  Write a method named randomWalk that takes in an integer and returns a string of that many random ones and zeros.
    // Example: randomWalk(1) returns a string with one character that is randomly 0 or 1. randomWalk(33) returns a string with 33 random 1s or 0s.
    public static String randomWalk(int lengthOfNum){
        String output = "";
            for(int i = 0; i < lengthOfNum; i++) {
                int randomNum = (int) Math.round(Math.random());
                output += randomNum;
            }
        return output;
    }
    //Write a method named countOnes that takes in a string of ones and zeroes and returns a count of the ones.
    public static int countOnes(String input){
        int oneCount = 0;
//        System.out.println(input);
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == '1'){
                oneCount++;
            }
        }
        return oneCount;
    }

    //Write a method named countZeros that takes in a string of ones and zeroes and returns a count of the 0s.
    public static int countZeros(String input){
        int zeroCount = 0;
//        System.out.println(input);
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == '0'){
                zeroCount++;
            }
        }
        return zeroCount;
    }
    //Write a method named analyzeRandomWalk that accepts a string containing ones and zeroes and prints out the number of ones and the number of zeroes. This method is void because it does not return anything. Example: analyzeRandomWalk("11000") should print "There are 2 ones and 3 zeroes".
    public static void analyzeRandomWalk(String input){
        int zeroCount = 0;
        int oneCount = 0;
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == '0'){
                zeroCount++;
            }
            if(input.charAt(i) == '1'){
                oneCount++;
            }
        }
        System.out.format("There are %d zeros and %d ones",zeroCount,oneCount);
    }



    public static void main(String[] args) {
        coinFlip();
        System.out.println(randomWalk(20));
        System.out.println(countOnes(randomWalk(20)));
        System.out.println(countZeros(randomWalk(20)));
        analyzeRandomWalk(randomWalk(20));



    }

}
