package com.nuxio.chapter5;

class Cup {
    Cup(int marker) {
        System.out.println("Cup(" + marker + ")");
    }
    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}

class Cups {
    static Cup cup1;
    static Cup cup2;
    static { // 显式的静态初始化
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }
    Cup Cup3;
    Cup Cup4;
    { // 显式的非静态实例初始化
        Cup3 = new Cup(3);
        Cup4 = new Cup(4);
    }
    Cups() {
        System.out.println("Cups()");
    }
}

public class ExplicitStatic {
    public static void main(String[] args) {
        System.out.println("Inside main()");
        Cups.cup1.f(99);
    }
    static Cups cups1 = new Cups();
    static Cups cups2 = new Cups();
}
