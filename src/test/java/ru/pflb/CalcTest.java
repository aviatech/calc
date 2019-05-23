package ru.pflb;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.*;

public class CalcTest {
    private Calc calc;
    Logger logger = LogManager.getLogger();

    @BeforeMethod
    public void initTest() {
        calc = new Calc();
        logger.debug("Создание объекта calc", calc);
    }

    @AfterMethod
    public void getAfterTest() {
        calc = null;
    }

    @Test
    public void getTestSum() {
        logger.info("Тестирование сложения");
        Assert.assertEquals(5, calc.getSum(2, 3));
    }

    @Test
    public void getSub() {
        logger.info("Тестирование вычитания");
        Assert.assertEquals(5, calc.getSub(10, 5));
    }

    @Test
    public void getMultiplication() {
        logger.info("Тестирование умножения");
        Assert.assertEquals(8, calc.getMultiplication(2, 4));
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void getDivisionException() {
        logger.info("Тестирование деления");
        //int i = 1 / 0;
        calc.getDivision(3, 0);
    }
}
