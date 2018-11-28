package com.example.li.lll.a24patternproject.strategyandfactory;

public abstract class CashSuper {
    public abstract double acceptCash(double money);
}

/**
 * 正常
 */
class CashNormal extends CashSuper{

    @Override
    public double acceptCash(double money) {
        return money;
    }
}

/**
 * 打折
 */
class CashRebate extends CashSuper{

    private double moneyRebate =1d;


    public CashRebate(String moneyRebate){
        this.moneyRebate = Double.parseDouble(moneyRebate);

    }



    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}

/**
 * 返利   300 反 100；
 */
class CashReturn extends CashSuper{

    private double moneyCondition = 0.0d;
    private double moneyReturn = 0.0d;

    public CashReturn(String moneyCondition,String moneyReturn){
        this.moneyCondition =Double.parseDouble(moneyCondition);
        this.moneyReturn =Double.parseDouble(moneyReturn);
    }



    @Override
    public double acceptCash(double money) {
        double result =money;
        if (money >= moneyCondition){
            result  =money -Math.floor(money/moneyCondition)*moneyReturn;
        }
        return result ;
    }
}