package com.jihyunum.patterns.behavioral.strategy;

import com.jihyunum.patterns.behavioral.strategy.strategies.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String userName = "randomUser";

        System.out.println("Hello " + userName + ", please provide the sentence to casify:");
        String sentence= reader.readLine();

        System.out.println("Which case do you want to use?");
        System.out.println("P - PascalCase");
        System.out.println("C - camelCase");
        System.out.println("S - snake_case");
        System.out.println("P, C or S?");
        String caseUsed = reader.readLine();

        CasifyContext context = new CasifyContext();
        Map<String, CaseStrategy> strategyMap = new HashMap<String, CaseStrategy>();
        strategyMap.put("P", new PascalCaseStrategy());
        strategyMap.put("C", new CamelCaseStrategy());
        strategyMap.put("S", new SnakeCaseStrategy());

        CaseStrategy strategyToUse = strategyMap.getOrDefault(caseUsed, new SentenceCaseStrategy());

        context.setStrategy(strategyToUse);
        String result = context.executeStrategy(sentence);

        System.out.println(result);
    }
}
