package ru.pflb;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Calc {
    private Logger logger = LogManager.getLogger();

    int getSum(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        logger.debug("Результат сложения", sum);
        return sum;
    }

    int getSub(int... numbers) {
        int difference = 0;
        for (int i = 0; i < numbers.length - 1; ++i) {
            difference = numbers[i] - numbers[i + 1];
        }
        logger.debug("Результат вычитания", difference);
        return difference;
    }

    int getMultiplication(int... numbers) {
        int composition = 1;
        for (int number : numbers) {
            composition *= number;
        }
        logger.debug("Результат умножения", composition);
        return composition;
    }

    double getDivision(double a, double b) {
        if (b == 0) {
            System.out.println("Division by zero");
        }
        logger.debug("Результат деления", a / b);
        return a / b;
    }
}
