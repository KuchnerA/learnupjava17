package ru.learnupjava.feb.kuchner.homework.finance;

public class BankUtils {

    public static double calcAccruedInterest(int age, int amount) {
        int targetAge = 60;
        double rate = calcRate(age, amount, targetAge);
        double accruedInterest = (targetAge - age) * (amount * rate / 100);

        return accruedInterest;
    }

    public static double calcRate(int age, int amount, int targetAge) {

        double rate = 0;
        if (amount < 100_000) {
            rate = 5.0;
        } else if (amount >= 100_000 && amount <= 500_000) {
            rate = 6.0;
        } else if (amount > 500_000) {
            rate = 7.0;
        }

        if ((targetAge - age) >= 20) {
            rate = rate + 0.5;
        }
        return rate;
    }
}
