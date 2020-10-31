package com.jihyunum.patterns.behavioral.strategy.strategies;

public class CamelCaseStrategy implements CaseStrategy {
    public String execute(String a) {
        String[] words = a.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i ++) {
            String word = words[i];
            String capWord;
            if (i > 0) {
                capWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
            } else {
                capWord = word.toLowerCase();
            }
            sb.append(capWord);

        }
        return sb.toString();
    }
}
