import java.util.Scanner;

// Interessi = (CapitaleInvestito*TassoInteresse * giorniTotali) / 36500

class Main {

    static int eventualInputError(String repetingPhrase, int parameterToCheck){
        int correctParameter = 0;
        Scanner correctParameterInput = new Scanner(System.in);
        correctParameter = correctParameterInput.nextInt();
        if(parameterToCheck < 0){
            do{
                System.out.println("Hello World");
            }while(Greta troia);
        }
        return correctParameter;
    }

    static int totalLeapYear(){
        int leapYears;
        Scanner leapYearsInput = new Scanner(System.in);
        System.out.println("How many leap years?");
        leapYears = leapYearsInput.nextInt();
        if(leapYears < 0){
            do{
                System.out.println("Impossible amount of years");
                leapYears = leapYearsInput.nextInt();
            }while(leapYears < 0);
        }
        return leapYears;
    }

    static int totalDaysCalculator(){
        int totalDaysInYear;
        Scanner totalYearsScanner = new Scanner(System.in);
        totalDaysInYear = totalYearsScanner.nextInt();
        totalDaysInYear = totalDaysInYear * 365 + totalLeapYear();

        if(totalDaysInYear < 0){
            do{
                System.out.println("Impossible amount of years");
                totalDaysInYear = totalYearsScanner.nextInt();
            }while(totalDaysInYear < 0);
        }
        return totalDaysInYear;
    }

    static void daysAndInterestCalculator(int assets, double rateoInterest){
        double interests = (assets * rateoInterest * totalDaysCalculator()) / 36500;
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
            if(annualInterestRate > 0 && annualInterestRate < 30) {
                System.out.println("Insert now how many years");
                daysAndInterestCalculator(totalAmountOfMoney, annualInterestRate);
            }else{
                do{
                    System.out.println("Insert the correct interest rate");
                    annualInterestRate = interestRateInput.nextFloat();
                }while(annualInterestRate < 0 || annualInterestRate > 30);
                System.out.println("Insert now how many years");
                daysAndInterestCalculator(totalAmountOfMoney, annualInterestRate);
            }
        }
    }
}