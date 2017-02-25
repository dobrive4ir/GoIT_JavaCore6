package module4;

/**
 * Created by Dobryvechir on 22.02.2017.
 * USBank:
 * limit of withdrawal = 1000 if currency is USD and 1200 if currency is EUR
 * limit of funding - 10000 if EUR and no limit if USD
 * monthly rate - 1% with USD and 2% with EUR
 * commission - 5% if USD and up to 1000, 7% if USD and more than 1000
 * 6% if EUR and up to 1000 and 8% if EUR and more than 1000
 */

public class USBank extends Bank {

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        Currency currency = getCurrency();
        switch (currency) {
            case USD:
                return 1000;
            case EUR:
                return 1200;
        }
        return Integer.MAX_VALUE;
    }

    @Override
    public int getLimitOfFunding() {
        Currency currency = getCurrency();
        switch (currency) {
            case USD:
                return Integer.MAX_VALUE;
            case EUR:
                return 10000;
        }
        return Integer.MAX_VALUE;
    }

    @Override
    public int getMonthlyRate() {
        Currency currency = getCurrency();
        switch (currency) {
            case USD:
                return 1;
            case EUR:
                return 2;
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
                return (summ <= 1000) ? 6 : 8;
        }
        return Integer.MAX_VALUE;
    }

}