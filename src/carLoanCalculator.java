import java.util.Scanner;
public class carLoanCalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter in how much you need for your car loan");
            int userCarLoan = scanner.nextInt();

            System.out.println("Enter in the number of years desired to repay your loan:");
            int loanLength = scanner.nextInt();

            System.out.println("You will have an interest rate of 5%");
            double interestRate = 0.05;

            System.out.println("Enter in how much you will be paying as your down payment:");
            int downPayment = scanner.nextInt();

            if(loanLength <= 0){
                System.out.println("Error! You must take out a valid car loan.");
            }
            else if(downPayment >= userCarLoan){
                System.out.println("The car can be paid in full");
            }
            else{
                int remainingBalance = userCarLoan - downPayment;
                int months = loanLength*12;
                int monthlyBalance = remainingBalance/months;
                double interest = (remainingBalance * interestRate) / 100;
                double monthlyPayment = (int) monthlyBalance + interest;
                System.out.println("Your monthly car payment will be $" + monthlyPayment);
            }
        }
    }
