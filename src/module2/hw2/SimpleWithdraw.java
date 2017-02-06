package module2.hw2;

import java.util.Arrays;

/**
 * Created by Dobryvechir on 04.02.2017.
 * Continue with BANK example
 * 2.1 Write method which withdraw money from account and takes commission 5% of the transaction. Print OK + commission + balance after withdrawal. Print NO is withdrawal is not possible.
 *
 * Example
 *
 * Input
 *
 * balance = 100
 * withdrawal = 10
 *
 * Output
 * OK 0.5 89.5
 *
 * Input
 *
 * balance = 100
 * withdrawal = 99
 *
 *  Output
 *  NO
 */

public class SimpleWithdraw {
    public static void main(String[] args) {
        double balance = 100.0;
        double withdrawal = 10.0;

    /*
    * "Graphical interface" is written below (instead of writing method, which will be used for outputting the result of withdrawal operation)
    * */
        double[] interfaceArray = cashWithdraw(balance, withdrawal);
        if (interfaceArray == null) {
            System.out.println(Arrays.toString(interfaceArray));
        } else if (interfaceArray[0] == 0.0) {
            System.out.println("NO");
        } else if (interfaceArray[0] == 1.0){
            System.out.println("OK " + interfaceArray[1] + " " + interfaceArray[2]);
    }

    }

    /*
    * Method will return array, which contains 3 numbers. Each number is used in "graphical interface" and correspond to the following information:
    * cashWithdraw = {the possibility of operation (1.0 - YES, 0.0 - NO), commission value, balance after withdrawal}
    * */
    private static double[] cashWithdraw (double inputBalance, double inputWithdraw) {
        if ((inputBalance < 0) || (inputWithdraw < 0)) {
            return null;
        }

        double[] resultArray = new double[3];
        resultArray[0] = 1.0;
        resultArray[1] = inputWithdraw * 0.05;
        double amountOfWithdraw = inputWithdraw + resultArray [1];
        if ((inputBalance == 0.0) || (inputWithdraw == 0.0) || (inputBalance < amountOfWithdraw)) {
            resultArray[0] = 0.0;
        } else {
            resultArray[2] = inputBalance - amountOfWithdraw;
        }
        return resultArray;
    }

}
