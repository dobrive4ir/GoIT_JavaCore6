package module4;

/**
 * Created by Dobryvechir on 22.02.2017.
 * EUBank:
 * limit of withdrawal = 2000 if currency is USD and 2200 if currency is EUR
 * limit of funding - 20000 if EUR and 10000 if USD
 * monthly rate - 0% with USD and 1% with EUR
 * commission - 5% if USD and up to 1000, 7% if USD and more than 1000
 * 2% if EUR and up to 1000 and 4% if EUR and more than 1000
 */

public class EUBank extends Bank {

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        Currency currency = getCurrency();
        switch (currency) {
            case USD:
                return 2000;
            case EUR:
                return 2200;
        }
        return Integer.MAX_VALUE;
    }

    @Override
    public int getLimitOfFunding() {
        Currency currency = getCurrency();
        switch (currency) {
            case USD:
                return 10000;
            case EUR:
                return 20000;
        }
        return Integer.MAX_VALUE;
    }

    @Override
    public int getMonthlyRate() {
        Currency currency = getCurrency();
        switch (currency) {
            case USD:
                return 0;
            case EUR:
                return 1;
        }
        return Integer.MAX_VALUE;
    }

    @Override
    public int getCommission(int summ) {
        Currency currency = getCurrency();
        switch (currency) {
            case USD:
                return (summ <= 1000) ? 5 : 7;
            case EUR:
                return (summ <= 1000) ? 2 : 4;
        }
        return Integer.MAX_VALUE;
    }

}