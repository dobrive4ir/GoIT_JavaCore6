package javacore.module4;

/**
 * Created by Dobryvechir on 22.02.2017.
 * ChinaBank:
 * limit of withdrawal = 100 if currency is USD and 150 if currency is EUR
 * limit of funding - 5000 if EUR and 10000 if USD
 * monthly rate - 1% with USD and 0% with EUR
 * commission - 3% if USD and up to 1000, 5% if USD and more than 1000
 * 10% if EUR and up to 1000 and 11% if EUR and more than 1000
 */

public class ChinaBank extends Bank {

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee,
                     long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        Currency currency = getCurrency();
        switch (currency) {
            case USD:
                return 100;
            case EUR:
                return 150;
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
                return 5000;
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
                return 0;
        }
        return Integer.MAX_VALUE;
    }

    @Override
    public int getCommission(int summ) {
        Currency currency = getCurrency();
        switch (currency) {
            case USD:
                return (summ <= 1000) ? 3 : 5;
            case EUR:
                return (summ <= 1000) ? 10 : 11;
        }
        return Integer.MAX_VALUE;
    }

}
