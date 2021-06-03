/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Edmund Johnson V
 */

/*
At some point, you might have to deal with currency exchange rates, and you’ll need to ensure your calculations are as precise as possible.

Write a program that converts currency. Specifically, convert euros to U.S. dollars. Prompt for the amount of money in euros you have, and prompt for the current exchange rate of the euro. Print out the new amount in U.S. dollars.

The formula for currency conversion is

amount_to = (amount_from * rate_from) / rate_to
where

amount_to is the amount in U.S. dollars.
amount_from is the amount in euros.
rate_from is the current exchange rate in euros.
rate_to is the current exchange rate of the U.S. dollar.
Example Output
How many euros are you exchanging? 81
What is the exchange rate? 137.51
81 euros at an exchange rate of 137.51 is
111.38 U.S. dollars.
Constraints
Ensure that fractions of a cent are rounded up to the next penny.
Use a single output statement.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] arg){
        float euros = getEuros();
        float rate = getExchangeRate();
        System.out.println(output(euros, rate));
    }

    private static float getEuros(){
        System.out.print("How many euros are you exchanging? ");
        String x = in.nextLine();
        return Float.parseFloat(x.replace(" ", ""));
    }

    private static float getExchangeRate(){
        System.out.print("What is the exchange rate? ");
        String x = in.nextLine();
        return Float.parseFloat(x.replace(" ", ""));
    }

    private static String output(float euros, float rate){
        DecimalFormat d = new DecimalFormat("#.##");
        float usd = (euros * rate) / 100;
        return d.format(euros) + " euros at an exchange rate of " + d.format(rate) + " is\n" + d.format(usd) + " U.S. dollars.";
    }
}
