package module2.hw3;

import java.util.Arrays;

/**
 * Created by Dobryvechir on 05.02.2017.
 * You need to write method which withdraw money of particular account owner if he/she can. Print name + NO of withdrawal fs not possible and name + sum of withdrawal + balance after withdrawal in other case. Commission is 5% for all cases.
 *
 * Example
 *
 * Input
 *
 * double[] balances = {1200, 250, 2000, 500, 3200};
 * String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
 *
 * String ownerName = Ann
 * double withdrawal = 100;
 *
 * Output
 * Ann 100 145
 *
 * Input
 *
 * double[] balances = {1200, 250, 2000, 500, 3200};
 * String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
 *
 * String ownerName = Oww
 * double withdrawal = 490;
 *
 * Output
 * Oww NO
 */

public class ParticularAccountWithdraw {
    public static void main(String[] args) {
        double[] balances = {1200.0, 250.0, 2000.0, 500.0, 3200.0};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        String ownerName = "Ann";
        double withdrawal = 100.0;

    /*
    * "Graphical interface" is written below (instead of writing method, which will be used for outputting the result of withdrawal operation)
    * */
        double[] interfaceArray = cashWithdraw(ownerName, ownerNames, withdrawal, balances);
        if (interfaceArray == null) {
            System.out.println(Arrays.toString(interfaceArray));
        } else if(interfaceArray[0] == 0.0) {
            System.out.println(ownerName + " NO");
        } else if(interfaceArray[0] == 1.0) {
            System.out.println(ownerName + " " + withdrawal + " " + interfaceArray[1]);
        }

    }

    /*
    * Method will return array, which contains 2 numbers. Each number is used in "graphical interface" and correspond to the following information:
    * cashWithdraw = {the possibility of operation (1.0 - YES, 0.0 - NO), balance after withdrawal}
    * */
    private static double[] cashWithdraw (String inputName, String[] allNames, double inputWithdrawal, double[] allBalances) {
        if ((allNames == null) || (allNames.length == 0) || (allBalances == null) || (allBalances.length == 0) || (inputName == null) || (inputWithdrawal < 0.0)) {
            return null;
        }

        double particularBalance = 0.0;
        for (int i = 0; i < allNames.length; i++) {
            if (allNames[i] == inputName) {
                particularBalance = allBalances[i];
                break;
            }
        }
        double[] resultArray = new double[2];
        resultArray[0] = 1.0;
        double withdrawalAmount = inputWithdrawal + (inputWithdrawal * 0.05);
        if ((particularBalance <= 0.0) || (particularBalance < withdrawalAmount) || (inputWithdrawal == 0)) {
            resultArray[0] = 0.0;
        } else {
            resultArray[1] = particularBalance - withdrawalAmount;
        }
        return resultArray;
    }
}
