package ru.pflb;

public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc();

        System.out.println(calc.getSum(2, 4, 5, 7));
        System.out.println(calc.getDivision(2, 0));
        System.out.println(calc.getSub(10,5,1));
    }
}
