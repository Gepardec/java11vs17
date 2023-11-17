package org.example.features.java17Preview.patternMatchingSwitch;

public class patternMatchingSwitch {
    public static void main(String[] args) {
        System.out.println(getDoubleUsingSwitch("50"));
        System.out.println(getDoubleUsingSwitch(50));
        System.out.println(getDoubleUsingSwitch(50L));
    }

    static double getDoubleUsingSwitch(Object o) {
        return switch (o) {
            case Integer i -> i.doubleValue();                  // Is only a Preview Feature and is added with Java 21 LTS
            case Float f -> f.doubleValue();
            case Long l -> l.doubleValue();
            case String s -> Double.parseDouble(s);
            default -> 0d;
        };
    }
}
