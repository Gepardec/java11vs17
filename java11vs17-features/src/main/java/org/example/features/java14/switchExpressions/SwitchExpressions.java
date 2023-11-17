package org.example.features.java14.switchExpressions;

public class SwitchExpressions {

    public static void main(String[] args) {
        oldStyleWithoutBreak(Fruit.APPLE);
        System.out.println();
        oldStyleWithBreak(Fruit.APPLE);
        System.out.println();
        withSwitchExpression(Fruit.ORANGE);
        System.out.println();
        withYield(Fruit.APPLE);
    }

    public enum Fruit {
        APPLE,
        PEAR,
        ORANGE,
        AVOCADO
    }

    private static void oldStyleWithoutBreak(Fruit fruit) {
        switch (fruit) {
            case APPLE, PEAR:
                System.out.println("Common fruit");
            case ORANGE, AVOCADO:
                System.out.println("Exotic fruit");
            default:
                System.out.println("Undefined fruit");
        }
    }

    private static void oldStyleWithBreak(Fruit fruit) {
        switch (fruit) {
            case APPLE, PEAR:
                System.out.println("Common fruit");
                break;
            case ORANGE, AVOCADO:
                System.out.println("Exotic fruit");
                break;
            default:
                System.out.println("Undefined fruit");
        }
    }

    private static void withSwitchExpression(Fruit fruit) {
        switch (fruit) {
            case APPLE, PEAR -> System.out.println("Common fruit");
            case ORANGE, AVOCADO -> System.out.println("Exotic fruit");
            default -> System.out.println("Undefined fruit");
        }
    }

    private static void withYield(Fruit fruit) {
        String text = switch (fruit) {
            case APPLE, PEAR -> {
                System.out.println("the given fruit was: " + fruit);
                yield "Common fruit";           //returns value
            }
            case ORANGE, AVOCADO -> "Exotic fruit";
            default -> "Undefined fruit";
        };
        System.out.println(text);
    }
}
