package ru.learnupjava.feb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.learnupjava.feb.kuchner.homework.finance.BankUtils;

import java.io.FileNotFoundException;

public class Main {

    private static final Logger LOG = LoggerFactory.getLogger(TextUtils.class);

    public static void main(String[] args) throws FileNotFoundException {
        LOG.debug("Application started...");

        System.out.println("Введите возраст и сумму взноса в рублях");

        try {
            int age = Integer.parseInt(args[0]);
            int amount = Integer.parseInt(args[1]);

            if (age > 0 && amount > 0) {
                double accruedInterest = BankUtils.calcAccruedInterest(age, amount);
                System.out.println("Накопленные проценты: " + accruedInterest + " RUB");
            } else {
                System.out.println("Возраст и сумма вклада должны быть больше 0");
            }
        } catch (Exception e) {
            System.out.println("Неправильный ввод .... попробуйте ещё раз");
        }
        LOG.debug("Application finished...");
    }
}
