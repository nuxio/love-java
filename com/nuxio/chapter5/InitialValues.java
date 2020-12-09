package com.nuxio.chapter5;

public class InitialValues {
    boolean t;
    char c;
    byte b;
    short s;
    int i;
    float f;
    double d;
    InitialValues reference;
    String ss;

    void printInitialValues() {
        System.out.println("Data type Initial value");
        System.out.println("boolean " + t);
        System.out.println("char " + c);
        System.out.println("byte " + b);
        System.out.println("short " + s);
        System.out.println("int " + i);
        System.out.println("float " + f);
        System.out.println("double " + d);
        System.out.println("reference " + reference);
        System.out.println("String " + ss);
    }

    public static void main(String[] args) {
        InitialValues iv = new InitialValues();
        iv.printInitialValues();

        // new InitialValues().printInitialValues();
    }
}
