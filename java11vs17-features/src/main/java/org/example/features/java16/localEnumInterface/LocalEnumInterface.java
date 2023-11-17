package org.example.features.java16.localEnumInterface;

public class LocalEnumInterface {

    public static void main(String[] args) {
        enum Fruit {        //Local Enum
            APPLE,
            PEAR,
            ORANGE,
            AVOCADO
        }
        System.out.println(Fruit.ORANGE);

        interface B { void b(); }       //Local Interface
        B b = new B() {
            @Override
            public void b() {
                System.out.println("B");
            }
        };
        b.b();
    }
}
