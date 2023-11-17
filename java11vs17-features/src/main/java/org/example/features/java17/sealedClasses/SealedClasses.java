package org.example.features.java17.sealedClasses;

import org.example.features.java17.sealedClasses.nonsealed.Apple;
import org.example.features.java17.sealedClasses.nonsealed.Fruit;
import org.example.features.java17.sealedClasses.nonsealed.Pear;
import org.example.features.java17.sealedClasses.sealed.AppleSealed;
import org.example.features.java17.sealedClasses.sealed.AsianPear;
import org.example.features.java17.sealedClasses.sealed.AsianPearSealed;
import org.example.features.java17.sealedClasses.sealed.FruitSealed;
import org.example.features.java17.sealedClasses.sealed.PearSealed;

public class SealedClasses {
    private static void problemSpace() {
        Apple apple = new Apple();
        Pear pear = new Pear();

        Fruit fruit = apple;
        Fruit fruit2 = pear;
        class SweetApple extends Fruit {                                // In this example should not be possible
        }
    }

    private static void sealedClasses() {
        AppleSealed apple = new AppleSealed();
        AsianPearSealed asianPearSealed = new AsianPearSealed();

        PearSealed pear = asianPearSealed;

        FruitSealed fruitSealed = pear;
        FruitSealed fruitSealed2 = apple;

        class SweetApple extends AppleSealed {                          //Should be possible because it extends of a non-sealed class
        }

    }
}

