import java.util.Scanner;

// Interessi = (CapitaleInvestito*TassoInteresse * giorniTotali) / 36500

public class Main {

    static void interestCalculator(int assets, double rateoInterest){

        int totalDaysInYear;
        Scanner totalYearsScanner = new Scanner(System.in);
        totalDaysInYear = totalYearsScanner.nextInt();
        totalDaysInYear = totalDaysInYear * 365;

        if(totalDaysInYear < 0){
            do{
                System.out.print("Impossible amount of years");
                totalDaysInYear = totalYearsScanner.nextInt();
            }while(totalDaysInYear < 0);
        }

        double interests = (assets * rateoInterest * totalDaysInYear) / 36500;
        System.out.println("You have a total of " + interests);
    }

    public static void main(String[] args) {

        Scanner amountOfMoneyInput = new Scanner(System.in);
        int totalAmountOfMoney;
        do {
            System.out.println("Insert a number between 1K and 1M");
            totalAmountOfMoney = amountOfMoneyInput.nextInt();
        }while(totalAmountOfMoney < 1000 || totalAmountOfMoney > 1000000);

        if (totalAmountOfMoney > 1000 && totalAmountOfMoney < 1000000) {
            System.out.println("Now enter the interest rate");
            double annualInterestRate;
            Scanner interestRateInput = new Scanner(System.in);
            annualInterestRate = interestRateInput.nextDouble();
            if (annualInterestRate > 0 && annualInterestRate < 30) {
                System.out.println("Insert now how many years");
                interestCalculator(totalAmountOfMoney, annualInterestRate);
            }else{
                do{
                    System.out.println("Insert the correct interest rate");
                    annualInterestRate = interestRateInput.nextFloat();
                }while(annualInterestRate < 0 || annualInterestRate > 30);
                System.out.println("Insert now how many years");
                interestCalculator(totalAmountOfMoney, annualInterestRate);
            }
        }
    }
}