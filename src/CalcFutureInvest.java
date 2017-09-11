/** “CalcFutureInvest"
 *
 *  @author Emma Slayton
 *  Created: 9/8/17
 *  Last updated: 9/10/17
 *
 *  Project 2; CSC201-004N
 *  Assignment 2.21
 *
 */

import java.util.Scanner;

public class CalcFutureInvest {
    public static void main(String[] args) {
        /* Create a Scanner object */
        Scanner input = new Scanner(System.in);

        /* Get Input */
        System.out.print ("Enter Investment Amount (e.g. 1000.25):  ");
        double investmentAmount = input.nextDouble();

        System.out.print ("Enter Annual Interest Rate (e.g.5.25):  ");
        double annualInterestRate = input.nextDouble();

        System.out.print ("Enter Number of Years as an Integer (e.g. 2):  ");
        double numberOfYears = input.nextDouble();

        /* Calculate Future Investment Value */
        double monthlyInterestRate = annualInterestRate / 1200;
        double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears *12);

        /* Output Result */
        System.out.println("==> Accumulated value is $" + (int)(futureInvestmentValue * 100) / 100.0);
    }
}
