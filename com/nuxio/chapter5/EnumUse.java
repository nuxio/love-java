package com.nuxio.chapter5;

enum Spiciness { // Spiciness: 辣度
    NOT,
    MILD,
    MEDIUM,
    HOT,
    FLAMING
}

class Burrito {
    Spiciness degree;
    public Burrito(Spiciness degree) {
        this.degree = degree;
    }
    public void describe() {
        System.out.print("This Burrito is ");

        switch(degree) {
            case NOT:
                System.out.println("not spicy at all.");
                break;
            case MILD:
            case MEDIUM:
                System.out.println("a little hot.");
                break;
            case HOT:
            case FLAMING:
            default:
                System.out.println("maybe too hot.");
        }
    }
}

public class EnumUse {
    public static void main(String[] args) {
        Spiciness hot = Spiciness.MEDIUM;
        System.out.println(hot);

        for(Spiciness s : Spiciness.values()) {
            System.out.println(s + ", ordinal " + s.ordinal()); // ordinal: 序号
        }

        Burrito plain = new Burrito(Spiciness.NOT),
                greenChile = new Burrito(Spiciness.MEDIUM),
                jalapeno = new Burrito(Spiciness.FLAMING);

        plain.describe();
        greenChile.describe();
        jalapeno.describe();
    }
}
