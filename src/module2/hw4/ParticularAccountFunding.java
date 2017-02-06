package module2.hw4;

/**
 * Created by Dobryvechir on 06.02.2017.
 * You need to write method which will fund balance of particular user. Print name + balance after funding
 *
 * Input
 *
 * double[] balances = {1200, 250, 2000, 500, 3200};
 *
 * String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
 *
 * String ownerName = Oww
 * double withdrawal = 100;
 *
 * Output
 * Oww 600
 */

public class ParticularAccountFunding {
    public static void main(String[] args) {
        double[] balances = {1200.0, 250.0, 2000.0, 500.0, 3200.0};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        String ownerName = "Jane";
        double funding = 500.0;

    /*
    * "Graphical interface" is written below (instead of writing method, which will be used for outputting the result of withdrawal operation)
    * */
        double interfaceBalance = newBalance(ownerName, ownerNames, funding, balances);
        if (interfaceBalance == Double.MIN_VALUE) {
            System.out.println(interfaceBalance);
        } else {
            System.out.println(ownerName + " " + interfaceBalance);
        }

    }

    private static double newBalance (String inputName, String[] allNames, double inputFunding, double[] allBalances) {
        if ((allNames == null) || (allNames.length == 0) || (allBalances == null) || (allBalances.length == 0) || (inputName == null) || (inputFunding <= 0.0)) {
            return Double.MIN_VALUE;
        }

        double particularBalance = 0.0;
        for (int i = 0; i < allNames.length; i++) {
            if (allNames[i] == inputName) {
                particularBalance = allBalances[i];
                break;
            }
        }
        double fundedBalance = inputFunding + particularBalance;
        return fundedBalance;
    }
}
