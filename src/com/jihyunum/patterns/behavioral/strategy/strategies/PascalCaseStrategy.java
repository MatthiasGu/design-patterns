package com.jihyunum.patterns.behavioral.strategy.strategies;

import com.jihyunum.patterns.behavioral.strategy.strategies.CaseStrategy;

public class PascalCaseStrategy implements CaseStrategy {
     public String execute(String a) {
        String[] words = a.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String word: words) {
            String capWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
            sb.append(capWord);
        }
        return sb.toString();
    }
}
