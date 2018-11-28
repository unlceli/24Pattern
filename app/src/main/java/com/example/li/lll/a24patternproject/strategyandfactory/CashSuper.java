package com.example.li.lll.a24patternproject.strategyandfactory;

public abstract class CashSuper {
    public abstract double acceptCash(double money);
}

class CashNormal extends CashSuper{

    @Override
    public double acceptCash(double money) {
        return money;
    }
}

class CashRebate extends CashSuper{

    private double moneyRebate =1d;




    @Override
    public double acceptCash(double money) {
        return 0;
    }
}