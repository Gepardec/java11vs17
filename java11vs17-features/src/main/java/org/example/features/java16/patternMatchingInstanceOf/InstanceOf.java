package org.example.features.java16.patternMatchingInstanceOf;

import org.example.features.java16.records.GrapeClass;

import java.awt.*;

public class InstanceOf {
    public static void main(String[] args) {
        oldStyle();
        System.out.println();
        patternMatching();
        System.out.println();
        patternMatchingScope();
        System.out.println();
        patternMatchingScopeException();
    }

    private static void oldStyle() {
        Object o = new GrapeClass(Color.BLUE, 2);
        if (o instanceof GrapeClass) {
            GrapeClass grape = (GrapeClass) o;
            System.out.println("This grape has " + grape.getNbrOfPits() + " pits.");
        }
    }

    private static void patternMatching() {
        Object o = new GrapeClass(Color.BLUE, 2);
        if (o instanceof GrapeClass grape) {        // No new line to cast the object
            System.out.println("This grape has " + grape.getNbrOfPits() + " pits.");
        }
    }

    private static void patternMatchingScope() {
        Object o = new GrapeClass(Color.BLUE, 2);
        if (o instanceof GrapeClass grape && grape.getNbrOfPits() == 2) { // (o instanceof GrapeClass grape) has to turn out TRUE to proceed evaluating (grape.getNbrOfPits() == 2). && is not allowed to be chanced to ||
            System.out.println("This grape has " + grape.getNbrOfPits() + " pits.");
        }
    }

    private static void patternMatchingScopeException() {
        Object o = new GrapeClass(Color.BLUE, 2);
        if (!(o instanceof GrapeClass grape)) {
            throw new RuntimeException();
        }
        System.out.println("This grape has " + grape.getNbrOfPits() + " pits.");    //grape is allowed to be used because compiler knows for sure that grape exists.
    }
}
