package com.jihyunum.patterns.behavioral.strategy;

import com.jihyunum.patterns.behavioral.strategy.strategies.CaseStrategy;

public class CasifyContext {
    private CaseStrategy strategy;

    public void setStrategy(CaseStrategy strategy) {
        this.strategy = strategy;
    }

    public String executeStrategy(String a){
        return strategy.execute(a);
    }
}
