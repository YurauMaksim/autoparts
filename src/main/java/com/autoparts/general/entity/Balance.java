package com.autoparts.general.entity;

import java.math.BigDecimal;

public class Balance {
    private BigDecimal amount;

    public Balance(BigDecimal money) {
        this.amount = money;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal addAmount(BigDecimal amount){
        return this.amount.add(amount);
    }

    public BigDecimal subtractAmount(BigDecimal amount){
        return this.amount.subtract(amount);
    }

    @Override
    public String toString() {
        return "Balance{" +
                "amount=" + amount +
                '}';
    }
}
